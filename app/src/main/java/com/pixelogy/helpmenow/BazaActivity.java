package com.pixelogy.helpmenow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class BazaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baza);

        /////Actionbar////
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater li = LayoutInflater.from(this);
        View customView = li.inflate(R.layout.custom_actionbar_baza, null);
        mActionBar.setCustomView(customView);
        mActionBar.setDisplayShowCustomEnabled(true);

        ImageButton addContent = (ImageButton)    customView.findViewById(R.id.action_add);
        addContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BazaActivity.super.onBackPressed();
            }
        });
        /////Actionbar////

    }

    /////Actionbar////
    //////////Actionbar////
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dash_board, menu); //your file name
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        // TODO Auto-generated method stub
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent1 = new Intent(BazaActivity.this,AddPhoneActivity.class);//Settings Activity
                startActivity(intent1);
                //Toast.makeText(DashBoardActivity.this,"Settings Clidked!",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_comejest:
                Intent intent2 = new Intent(BazaActivity.this,ComejestActivity.class);//Comejest Activity
                startActivity(intent2);
                return true;
            case R.id.action_bazawiedy:
                Intent intent3 = new Intent(BazaActivity.this,BazaActivity.class);//Baza Activity
                startActivity(intent3);
                return true;
            case R.id.action_glowna:
                Intent intent4 = new Intent(BazaActivity.this,DashBoardActivity.class);//Home Activity
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /////Actionbar////
    /////Actionbar////

    public void reanimacjs(View v)
    {
        Intent intent4 = new Intent(BazaActivity.this,ReanimacjaActivity.class);//Home Activity
        startActivity(intent4);


    }


    public void sendNotification(View view) {

        // Create an explicit intent for an Activity in your app
        Intent intent = new Intent(this, ReanimacjaActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "111")
                .setSmallIcon(R.drawable.ic_monetization_on_black_24dp)
                .setContentTitle("My notification")
                .setContentText("Hello World!")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                // Set the intent that will fire when the user taps the notification
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(22, builder.build());
    }



}
