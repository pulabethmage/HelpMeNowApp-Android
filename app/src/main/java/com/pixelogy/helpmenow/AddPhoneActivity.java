package com.pixelogy.helpmenow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class AddPhoneActivity extends AppCompatActivity {

    EditText Ephone1,Ephone2,Ephone3,Ephone4,Ephone5,Ephone6,Ephone7,Ephone8,Ephone9,Ephone10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_phone);

        Ephone1 = findViewById(R.id.Ephone1);
        Ephone2 = findViewById(R.id.Ephone2);
        Ephone3 = findViewById(R.id.Ephone3);
        Ephone4 = findViewById(R.id.Ephone4);
        Ephone5 = findViewById(R.id.Ephone5);
        Ephone6 = findViewById(R.id.Ephone6);
        Ephone7 = findViewById(R.id.Ephone7);
        Ephone8 = findViewById(R.id.Ephone8);
        Ephone9 = findViewById(R.id.Ephone9);
        Ephone10 = findViewById(R.id.Ephone10);

        ////Saved Phone Number//
        SharedPreferences prefs = getSharedPreferences("myphone", MODE_PRIVATE);
        final String phonenumber1 = prefs.getString("Ephone1", "");//"No name defined" is the default value.
        final String phonenumber2 = prefs.getString("Ephone2", "");
        final String phonenumber3 = prefs.getString("Ephone3", "");
        final String phonenumber4 = prefs.getString("Ephone4", "");
        final String phonenumber5 = prefs.getString("Ephone5", "");
        final String phonenumber6 = prefs.getString("Ephone6", "");
        final String phonenumber7 = prefs.getString("Ephone7", "");
        final String phonenumber8 = prefs.getString("Ephone8", "");
        final String phonenumber9 = prefs.getString("Ephone9", "");
        final String phonenumber10 = prefs.getString("Ephone10", "");
        ////Saved Phone Number//

        if(phonenumber1 == "" && phonenumber2 == "" && phonenumber3 == "" && phonenumber4 == "" && phonenumber5 == ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {


        }
        else if(phonenumber1 != "" && phonenumber2 == "" && phonenumber3 == "" && phonenumber4 == "" && phonenumber5 == ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            Ephone1.setText(phonenumber1);
        }
        else if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 == "" && phonenumber4 == "" && phonenumber5 == ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            Ephone1.setText(phonenumber1);
            Ephone2.setText(phonenumber2);
        }
        else if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 == "" && phonenumber5 == ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            Ephone1.setText(phonenumber1);
            Ephone2.setText(phonenumber2);
            Ephone3.setText(phonenumber3);
        }
        else if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 == ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            Ephone1.setText(phonenumber1);
            Ephone2.setText(phonenumber2);
            Ephone3.setText(phonenumber3);
            Ephone4.setText(phonenumber4);
        }
        else if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            Ephone1.setText(phonenumber1);
            Ephone2.setText(phonenumber2);
            Ephone3.setText(phonenumber3);
            Ephone4.setText(phonenumber4);
            Ephone5.setText(phonenumber5);
        }
        else if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 != "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            Ephone1.setText(phonenumber1);
            Ephone2.setText(phonenumber2);
            Ephone3.setText(phonenumber3);
            Ephone4.setText(phonenumber4);
            Ephone5.setText(phonenumber5);
            Ephone6.setText(phonenumber6);
        }
        else if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 != "" && phonenumber7 != "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            Ephone1.setText(phonenumber1);
            Ephone2.setText(phonenumber2);
            Ephone3.setText(phonenumber3);
            Ephone4.setText(phonenumber4);
            Ephone5.setText(phonenumber5);
            Ephone6.setText(phonenumber6);
            Ephone7.setText(phonenumber7);
        }
        else if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 != "" && phonenumber7 != "" && phonenumber8 != "" && phonenumber9 == "" && phonenumber10 == "")
        {
            Ephone1.setText(phonenumber1);
            Ephone2.setText(phonenumber2);
            Ephone3.setText(phonenumber3);
            Ephone4.setText(phonenumber4);
            Ephone5.setText(phonenumber5);
            Ephone6.setText(phonenumber6);
            Ephone7.setText(phonenumber7);
            Ephone8.setText(phonenumber8);
        }
        else if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 != "" && phonenumber7 != "" && phonenumber8 != "" && phonenumber9 != "" && phonenumber10 == "")
        {

            Ephone1.setText(phonenumber1);
            Ephone2.setText(phonenumber2);
            Ephone3.setText(phonenumber3);
            Ephone4.setText(phonenumber4);
            Ephone5.setText(phonenumber5);
            Ephone6.setText(phonenumber6);
            Ephone7.setText(phonenumber7);
            Ephone8.setText(phonenumber8);
            Ephone9.setText(phonenumber9);
        }
        else if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 != "" && phonenumber7 != "" && phonenumber8 != "" && phonenumber9 != "" && phonenumber10 != "")
        {

            Ephone1.setText(phonenumber1);
            Ephone2.setText(phonenumber2);
            Ephone3.setText(phonenumber3);
            Ephone4.setText(phonenumber4);
            Ephone5.setText(phonenumber5);
            Ephone6.setText(phonenumber6);
            Ephone7.setText(phonenumber7);
            Ephone8.setText(phonenumber8);
            Ephone9.setText(phonenumber9);
            Ephone10.setText(phonenumber10);


        }



        /////Actionbar////
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater li = LayoutInflater.from(this);
        View customView = li.inflate(R.layout.custom_actionbar_addphone, null);
        mActionBar.setCustomView(customView);
        mActionBar.setDisplayShowCustomEnabled(true);

        ImageButton addContent = (ImageButton)    customView.findViewById(R.id.action_add);
        addContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddPhoneActivity.super.onBackPressed();
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
                Intent intent1 = new Intent(AddPhoneActivity.this,AddPhoneActivity.class);//Settings Activity
                startActivity(intent1);
                //Toast.makeText(DashBoardActivity.this,"Settings Clidked!",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_comejest:
                Intent intent2 = new Intent(AddPhoneActivity.this,ComejestActivity.class);//Comejest Activity
                startActivity(intent2);
                return true;
            case R.id.action_bazawiedy:
                Intent intent3 = new Intent(AddPhoneActivity.this,BazaActivity.class);//Baza Activity
                startActivity(intent3);
                return true;
            case R.id.action_glowna:
                Intent intent4 = new Intent(AddPhoneActivity.this,DashBoardActivity.class);//Home Activity
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /////Actionbar////
    /////Actionbar////


    public void savephone(View v)
    {
        SharedPreferences.Editor editor = getSharedPreferences("myphone", MODE_PRIVATE).edit();
        editor.putString("Ephone1", Ephone1.getText().toString());
        editor.putString("Ephone2", Ephone2.getText().toString());
        editor.putString("Ephone3", Ephone3.getText().toString());
        editor.putString("Ephone4", Ephone4.getText().toString());
        editor.putString("Ephone5", Ephone5.getText().toString());
        editor.putString("Ephone6", Ephone6.getText().toString());
        editor.putString("Ephone7", Ephone7.getText().toString());
        editor.putString("Ephone8", Ephone8.getText().toString());
        editor.putString("Ephone9", Ephone9.getText().toString());
        editor.putString("Ephone10", Ephone10.getText().toString());
        editor.apply();

        super.onBackPressed();

    }


}
