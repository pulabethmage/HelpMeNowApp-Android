package com.pixelogy.helpmenow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.Manifest.permission.SEND_SMS;


public class DashBoardActivity extends AppCompatActivity {

    private FusedLocationProviderClient fusedLocationClient;

    /** Duration of wait **/
    private final int WAITING_LENGTH = 10000; //10 Seconds

    int counter=10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board2);

        /////Actionbar////
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater li = LayoutInflater.from(this);
        View customView = li.inflate(R.layout.custom_actionbar, null);
        mActionBar.setCustomView(customView);
        mActionBar.setDisplayShowCustomEnabled(true);

        ImageButton addContent = (ImageButton)    customView.findViewById(R.id.action_add);
        addContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Toast.makeText(DashBoardActivity.this,"You Cliked !",Toast.LENGTH_LONG).show();
            }
        });
        /////Actionbar////


        ///////Location Codes
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        requesrPermission();
        ///////////////
        //http://www.google.com/maps/place/49.46800006494457,17.11514008755796



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
                Intent intent1 = new Intent(DashBoardActivity.this,AddPhoneActivity.class);//Settings Activity
                startActivity(intent1);
                //Toast.makeText(DashBoardActivity.this,"Settings Clidked!",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_comejest:
                Intent intent2 = new Intent(DashBoardActivity.this,ComejestActivity.class);//Comejest Activity
                startActivity(intent2);
                return true;
            case R.id.action_bazawiedy:
                Intent intent3 = new Intent(DashBoardActivity.this,BazaActivity.class);//Baza Activity
                startActivity(intent3);
                return true;
            case R.id.action_glowna:
                Intent intent4 = new Intent(DashBoardActivity.this,DashBoardActivity.class);//Home Activity
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /////Actionbar////
    /////Actionbar////


    public void helpmenowaction(View v)
    {

        final ProgressBar pb = findViewById(R.id.progressBar);



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
            Intent intent = new Intent(DashBoardActivity.this,AddPhoneActivity.class);
            startActivity(intent);

        }
        if(phonenumber1 != "" && phonenumber2 == "" && phonenumber3 == "" && phonenumber4 == "" && phonenumber5 == ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {

            final String numbers[] = {phonenumber1};
            sendsms(numbers);

        }
         if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 == "" && phonenumber4 == "" && phonenumber5 == ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            final String numbers[] = {phonenumber1,phonenumber2};
            sendsms(numbers);
        }
         if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 == "" && phonenumber5 == ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {

            final String numbers[] = {phonenumber1,phonenumber2,phonenumber3};
            sendsms(numbers);
        }
         if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 == ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            final String numbers[] = {phonenumber1,phonenumber2,phonenumber3,phonenumber4};
            sendsms(numbers);
        }
         if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 == "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            final String numbers[] = {phonenumber1,phonenumber2,phonenumber3,phonenumber4,phonenumber5};
            sendsms(numbers);
        }
         if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 != "" && phonenumber7 == "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            final String numbers[] = {phonenumber1,phonenumber2,phonenumber3,phonenumber4,phonenumber5,phonenumber6};
            sendsms(numbers);
        }
         if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 != "" && phonenumber7 != "" && phonenumber8 == "" && phonenumber9 == "" && phonenumber10 == "")
        {
            final String numbers[] = {phonenumber1,phonenumber2,phonenumber3,phonenumber4,phonenumber5,phonenumber6,phonenumber7};
            sendsms(numbers);
        }
         if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 != "" && phonenumber7 != "" && phonenumber8 != "" && phonenumber9 == "" && phonenumber10 == "")
        {
            final String numbers[] = {phonenumber1,phonenumber2,phonenumber3,phonenumber4,phonenumber5,phonenumber6,phonenumber7,phonenumber8};
            sendsms(numbers);
        }
         if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 != "" && phonenumber7 != "" && phonenumber8 != "" && phonenumber9 != "" && phonenumber10 == "")
        {
            final String numbers[] = {phonenumber1,phonenumber2,phonenumber3,phonenumber4,phonenumber5,phonenumber6,phonenumber7,phonenumber8,phonenumber9};
            sendsms(numbers);
        }
         if(phonenumber1 != "" && phonenumber2 != "" && phonenumber3 != "" && phonenumber4 != "" && phonenumber5 != ""
                && phonenumber6 != "" && phonenumber7 != "" && phonenumber8 != "" && phonenumber9 != "" && phonenumber10 != "")
        {
            final String numbers[] = {phonenumber1,phonenumber2,phonenumber3,phonenumber4,phonenumber5,phonenumber6,phonenumber7,phonenumber8,phonenumber9,phonenumber10};
            sendsms(numbers);
        }


        /*

        if(phonenumber1.equals("")) {

            Intent intent = new Intent(DashBoardActivity.this,AddPhoneActivity.class);
            startActivity(intent);
        }
        else {
            //pb.setVisibility(View.VISIBLE);

            counttime.setVisibility(View.VISIBLE);*/

/*

            // check permission
            if (ActivityCompat.checkSelfPermission(DashBoardActivity.this,ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // reuqest for permission

                return;
            }
            if (ActivityCompat.checkSelfPermission(DashBoardActivity.this,SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
                // reuqest for permission

                return;
            }
            fusedLocationClient.getLastLocation()
                    .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                        @Override
                        public void onSuccess(final Location location) {
                            // Got last known location. In some rare situations this can be null.
                            if (location != null) {
                                // Logic to handle location object

                               ///COUNTER
                                final CountDownTimer yourCountDownTimer = new CountDownTimer(50000,1000) {
                                    @Override
                                    public void onTick(long millisUntilFinished) {
                                        counttime.setText(String.valueOf(counter));
                                        counter++;
                                    }
                                    @Override
                                    public void onFinish() {
                                        counttime.setText("Finished");
                                    }
                                }.start();
                                ///COUNTER

                                ////WAIT FOR 10 SECONDS AND SEND THE MSG
                                ////WAIT FOR 10 SECONDS AND SEND THE MSG
                                new Handler().postDelayed(new Runnable(){
                                    @Override
                                    public void run() {

                                        //Toast.makeText(DashBoardActivity.this,"Lat = "+location.getLatitude()+"Lon ="+location.getLongitude(),Toast.LENGTH_LONG).show();
                                       // pb.setVisibility(View.GONE);

                                        try {
                                            yourCountDownTimer.cancel();
                                            ///Sending the sms
                                            SmsManager smgr = SmsManager.getDefault();
                                            smgr.sendTextMessage(phonenumber1, null,"Help Me Please! My Location is:", null, null);
                                            smgr.sendTextMessage(phonenumber1, null,"http://www.google.com/maps/place/" + location.getLatitude() + "," + location.getLongitude(), null, null);
                                            Toast.makeText(DashBoardActivity.this, "SMS Sent Successfully", Toast.LENGTH_SHORT).show();
                                            ///Sending the sms
                                            Intent intent4 = new Intent(DashBoardActivity.this,DashBoardActivity.class);//Home Activity
                                            startActivity(intent4);
                                        }
                                        catch (Exception e)
                                        {
                                            Toast.makeText(DashBoardActivity.this,"Please Check SMS SEND Permission on your Device!",Toast.LENGTH_LONG).show();

                                        }


                                    }
                                }, WAITING_LENGTH);
                                ////WAIT FOR 10 SECONDS AND SEND THE MSG
                                ////WAIT FOR 10 SECONDS AND SEND THE MSG





                                // Toast.makeText(DashBoardActivity.this,"Lat = "+location.getLatitude()+"Lon ="+location.getLongitude(),Toast.LENGTH_LONG).show();

                            } else {
                                Toast.makeText(DashBoardActivity.this, "No Location data!", Toast.LENGTH_LONG).show();
                            }

                        }
                    });

        }*/
        /////


    }

    public  void requesrPermission()
    {
        String[] PERMISSIONS = {
                android.Manifest.permission.ACCESS_FINE_LOCATION,
                android.Manifest.permission.SEND_SMS
        };

            ActivityCompat.requestPermissions(this,PERMISSIONS,1);


        //ActivityCompat.requestPermissions(this,new String[]{ACCESS_FINE_LOCATION},1);

    }



    public void sendsms(final String[] numberss)
    {

        final String [] numbers=numberss;


        final TextView counttime = findViewById(R.id.counter);
        counttime.setVisibility(View.VISIBLE);




        int PERMISSION_ALL = 1;
        String[] PERMISSIONS = {
                android.Manifest.permission.ACCESS_FINE_LOCATION,
                android.Manifest.permission.SEND_SMS
        };

        if(!hasPermissions(this, PERMISSIONS)){
            ActivityCompat.requestPermissions(this, PERMISSIONS, PERMISSION_ALL);
        }


        // check permission
      /*  if (ActivityCompat.checkSelfPermission(DashBoardActivity.this,ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // reuqest for permission

            return;
        }
        if (ActivityCompat.checkSelfPermission(DashBoardActivity.this,SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            // reuqest for permission

            return;
        }*/

        fusedLocationClient.getLastLocation()
                .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(final Location location) {
                        // Got last known location. In some rare situations this can be null.
                        if (location != null) {
                            // Logic to handle location object

                            ///COUNTER
                            final CountDownTimer yourCountDownTimer = new CountDownTimer(10000,1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    counttime.setText(String.valueOf(millisUntilFinished/1000));
                                }
                                @Override
                                public void onFinish() {
                                    //counttime.setText("Finished");

                                    try {

                                        for(String number : numbers) {
                                           // yourCountDownTimer.cancel();
                                            ///Sending the sms
                                            SmsManager smgr = SmsManager.getDefault();
                                            // smgr.sendTextMessage(number, null,"Help Me Please! My Location is:", null, null);
                                            smgr.sendTextMessage(number, null,"Please Help me!\n"+"http://www.google.com/maps/place/" + location.getLatitude() + "," + location.getLongitude(), null, null);


                                            Toast.makeText(DashBoardActivity.this, "SMS Sent Successfully", Toast.LENGTH_SHORT).show();
                                            ///Sending the sms
                                            Intent intent4 = new Intent(DashBoardActivity.this,DashBoardActivity.class);//Home Activity
                                            startActivity(intent4);

                                        }



                                    }
                                    catch (Exception e)
                                    {
                                        Toast.makeText(DashBoardActivity.this,"Please Check SMS SEND Permission on your Device!",Toast.LENGTH_LONG).show();

                                    }


                                }
                            }.start();

                           // yourCountDownTimer.cancel();
                            ///COUNTER

                        } else {
                            Toast.makeText(DashBoardActivity.this, "No Location data!", Toast.LENGTH_LONG).show();
                        }

                    }
                });
    }

    public static boolean hasPermissions(Context context, String... permissions) {
        if (context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

}
