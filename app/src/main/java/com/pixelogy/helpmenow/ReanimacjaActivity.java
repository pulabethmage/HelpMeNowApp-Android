package com.pixelogy.helpmenow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ReanimacjaActivity extends Activity {

    ImageButton popmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reanimacja);

        fullscreen();


        popmenu = findViewById(R.id.popipmenu);


    }

    public void popbutton(View v)
    {

        PopupMenu popupMenu = new PopupMenu(ReanimacjaActivity.this,popmenu);
        popupMenu.getMenuInflater().inflate(R.menu.dash_board,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                // TODO Auto-generated method stub
                switch (item.getItemId()) {
                    case R.id.action_settings:
                        Intent intent1 = new Intent(ReanimacjaActivity.this,AddPhoneActivity.class);//Settings Activity
                        startActivity(intent1);
                        //Toast.makeText(DashBoardActivity.this,"Settings Clidked!",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.action_comejest:
                        Intent intent2 = new Intent(ReanimacjaActivity.this,ComejestActivity.class);//Comejest Activity
                        startActivity(intent2);
                        return true;
                    case R.id.action_bazawiedy:
                        Intent intent3 = new Intent(ReanimacjaActivity.this,BazaActivity.class);//Baza Activity
                        startActivity(intent3);
                        return true;
                    case R.id.action_glowna:
                        Intent intent4 = new Intent(ReanimacjaActivity.this,DashBoardActivity.class);//Home Activity
                        startActivity(intent4);
                        return true;
                }



                return false;
            }
        });
        this.setFinishOnTouchOutside(false);
        popupMenu.show();


    }


    public  void fullscreen()
    {
        this.getWindow().getDecorView().setSystemUiVisibility(

                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );
    }






}
