package com.pixelogy.helpmenow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class SerceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serce);

        /////Actionbar////
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater li = LayoutInflater.from(this);
        View customView = li.inflate(R.layout.custom_actionbar_comijest, null);
        mActionBar.setCustomView(customView);
        mActionBar.setDisplayShowCustomEnabled(true);

        ImageButton addContent = (ImageButton)    customView.findViewById(R.id.action_add);
        addContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SerceActivity.super.onBackPressed();
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
                Intent intent1 = new Intent(SerceActivity.this,AddPhoneActivity.class);//Settings Activity
                startActivity(intent1);
                //Toast.makeText(DashBoardActivity.this,"Settings Clidked!",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_comejest:
                Intent intent2 = new Intent(SerceActivity.this,ComejestActivity.class);//Comejest Activity
                startActivity(intent2);
                return true;
            case R.id.action_bazawiedy:
                Intent intent3 = new Intent(SerceActivity.this,BazaActivity.class);//Baza Activity
                startActivity(intent3);
                return true;
            case R.id.action_glowna:
                Intent intent4 = new Intent(SerceActivity.this,DashBoardActivity.class);//Home Activity
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /////Actionbar////
    /////Actionbar////

}
