package com.pihash.muslimprime;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sylhet extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    Button Start;
    NotificationCompat.Builder notification;
    PendingIntent pIntent;
    NotificationManager manager;
    Intent resultIntent;
    TaskStackBuilder stackBuilder;
    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        tv4=(TextView)findViewById(R.id.textView4);
        tv5=(TextView)findViewById(R.id.textView5);
        tv6=(TextView)findViewById(R.id.textView6);
        tv7=(TextView)findViewById(R.id.textView7);



            Calendar c = Calendar.getInstance();
        SimpleDateFormat sdfmonth = new SimpleDateFormat("MMM");
        String Month = sdfmonth.format(c.getTime());

        int Day = c.getInstance().get(Calendar.DATE);

        //January comapre//
        if(Month.equals("Jan")){

            if(Day>=1&&Day<6)
            {
                JanTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                JanTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                JanTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                JanTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                JanTime_1_5();
            }
            else if(Day>25)
            {
                JanTime_1_6();
            }
            else{

                Nothing();
            }


        }

        //Feb comapre//

        if(Month.equals("Feb")){

            if(Day>=1&&Day<6)
            {
                FebTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                FebTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                FebTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                FebTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                FebTime_1_5();
            }
            else if(Day>25)
            {
                FebTime_1_6();
            }
            else{

                Nothing();
            }


        }

        //Mar comapre//

        if(Month.equals("Mar")){

            if(Day>=1&&Day<6)
            {
                MarTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                MarTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                MarTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                MarTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                MarTime_1_5();
            }
            else if(Day>25)
            {
                MarTime_1_6();
            }
            else{

                Nothing();
            }


        }

        //Apr comapre//

        if(Month.equals("Apr")){

            if(Day>=1&&Day<6)
            {
                AprTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                AprTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                AprTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                AprTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                AprTime_1_5();
            }
            else if(Day>25)
            {
                AprTime_1_6();
            }
            else{

                Nothing();
            }


        }

        //May compare//

        if(Month.equals("May")){

            if(Day>=1&&Day<6)
            {
                MayTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                MayTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                MayTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                MayTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                MayTime_1_5();
            }
            else if(Day>25)
            {
                MayTime_1_6();
            }
            else{

                Nothing();
            }


        }

        //Jun compare//

        if(Month.equals("Jun")){

            if(Day>=1&&Day<6)
            {
                JunTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                JunTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                JunTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                JunTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                JunTime_1_5();
            }
            else if(Day>25)
            {
                JunTime_1_6();
            }
            else{

                Nothing();
            }


        }

        //Jul compare//

        if(Month.equals("Jul")){

            if(Day>=1&&Day<6)
            {
                JulTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                JulTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                JulTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                JulTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                JulTime_1_5();
            }
            else if(Day>25)
            {
                JulTime_1_6();
            }
            else{

                Nothing();
            }


        }

        //Aug compare//

        if(Month.equals("Aug")){

            if(Day>=1&&Day<6)
            {
                AugTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                AugTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                AugTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                AugTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                AugTime_1_5();
            }
            else if(Day>25)
            {
                AugTime_1_6();
            }
            else{

                Nothing();
            }


        }

        //Sep compare//

        if(Month.equals("Sep")){

            if(Day>=1&&Day<6)
            {
                SepTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                SepTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                SepTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                SepTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                SepTime_1_5();
            }
            else if(Day>25)
            {
                SepTime_1_6();
            }
            else{

                Nothing();
            }


        }

        //Oct compare//

        if(Month.equals("Oct")){

            if(Day>=1&&Day<6)
            {
                OctTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                OctTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                OctTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                OctTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                OctTime_1_5();
            }
            else if(Day>25)
            {
                OctTime_1_6();
            }
            else{

                Nothing();
            }


        }

        //Nov compare//

        if(Month.equals("Nov")){

            if(Day>=1&&Day<6)
            {
                NovTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                NovTime_1_2();
            }
            else if(Day>9&&Day<15)
            {
                NovTime_1_3();
            }
            else if(Day>14&&Day<20)
            {
                NovTime_1_4();
            }
            else if(Day>19&&Day<26)
            {
                NovTime_1_5();
            }
            else if(Day>25)
            {
                NovTime_1_6();
            }
            else{

                Nothing();
            }
        }

        //Dec compare//

        if(Month.equals("Dec")){

            if(Day>=1&&Day<6)
            {

                DecTime_1_1();
            }
            else if(Day>5&&Day<10)
            {
                a=1;
                startNotification();
                DecTime_1_2();
            }
            else if(Day>9&&Day<15)
            {

                DecTime_1_3();
            }
            else if(Day>14&&Day<20)
            {

                DecTime_1_4();
            }
            else if(Day>19&&Day<26)
            {

                DecTime_1_5();
            }
            else if(Day>25)
            {

                DecTime_1_6();
            }
            else{

                Nothing();
            }
        }



    }



    protected void startNotification() {

        if(a==1) {
            // TODO Auto-generated method stub
            //Creating Notification Builder
            notification = new NotificationCompat.Builder(Sylhet.this);
            //Title for Notification
            notification.setContentTitle("Learn2Crack Updates");
            //Message in the Notification
            notification.setContentText("New Post on Android Notification.");
            //Alert shown when Notification is received
            notification.setTicker("New Message Alert!");
            //Icon to be set on Notification
            notification.setSmallIcon(R.drawable.ic_launcher);
            //Creating new Stack Builder
            stackBuilder = TaskStackBuilder.create(Sylhet.this);
            stackBuilder.addParentStack(Sylhet.class);
            //Intent which is opened when notification is clicked
            resultIntent = new Intent(Sylhet.this, Sylhet.class);
            stackBuilder.addNextIntent(resultIntent);
            pIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
            notification.setContentIntent(pIntent);
            manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(0, notification.build());

        }

    }
    //January Start//

    public void JanTime_1_1() {

        tv1.setText("Sahri End   :    5:11 AM");
        tv2.setText("Fazar Start :  5:17 AM");
        tv3.setText("Sunrise     :    6:38 AM");
        tv4.setText("Juhar Start : 12:02 PM");
        tv5.setText("Asar Start  :  3:40 PM");
        tv6.setText("Magrib Start: 5:18 PM");
        tv7.setText("Esha Start  : 6:39 PM");

    }
    public void JanTime_1_2() {

        tv1.setText("Sahri End   : 5:13 AM");
        tv2.setText("Fazar Start : 5:19 AM");
        tv3.setText("Sunrise     : 6:39 AM");
        tv4.setText("Juhar Start : 12:04 PM");
        tv5.setText("Asar Start  : 3:42 PM");
        tv6.setText("Magrib Start: 5:21 PM");
        tv7.setText("Esha Start  : 6:41 PM");

    }
    public void JanTime_1_3() {

        tv1.setText("Sahri End   : 5:14 AM");
        tv2.setText("Fazar Start : 5:20 AM");
        tv3.setText("Sunrise     : 6:39 AM");
        tv4.setText("Juhar Start : 12:06 PM");
        tv5.setText("Asar Start  : 3:45 PM");
        tv6.setText("Magrib Start: 5:24 PM");
        tv7.setText("Esha Start  : 6:43 PM");

    }
    public void JanTime_1_4() {


        tv1.setText("Sahri End   : 5:15 AM");
        tv2.setText("Fazar Start : 5:21 AM");
        tv3.setText("Sunrise     : 6:39 AM");
        tv4.setText("Juhar Start : 12:08 PM");
        tv5.setText("Asar Start  : 3:49 PM");
        tv6.setText("Magrib Start: 5:28 PM");
        tv7.setText("Esha Start  : 6:47 PM");

    }
    public void JanTime_1_5() {

        tv1.setText("Sahri End   : 5:15 AM");
        tv2.setText("Fazar Start : 5:21 AM");
        tv3.setText("Sunrise     : 6:39 AM");
        tv4.setText("Juhar Start : 12:10 PM");
        tv5.setText("Asar Start  : 3:58 PM");
        tv6.setText("Magrib Start: 5:32 PM");
        tv7.setText("Esha Start  : 6:50 PM");

    }
    public void JanTime_1_6() {

        tv1.setText("Sahri End   : 5:14 AM");
        tv2.setText("Fazar Start : 5:20 AM");
        tv3.setText("Sunrise     : 6:39 AM");
        tv4.setText("Juhar Start : 12:05 PM");
        tv5.setText("Asar Start  : 3:57 PM");
        tv6.setText("Magrib Start: 5:35 PM");
        tv7.setText("Esha Start  : 6:54 PM");

    }
    //January End//


    //February Start//

    public void FebTime_1_1() {

        tv1.setText("Sahri End   : 5:13 AM");
        tv2.setText("Fazar Start : 5:19 AM");
        tv3.setText("Sunrise     : 6:36 AM");
        tv4.setText("Juhar Start : 12:13 PM");
        tv5.setText("Asar Start  : 4:03 PM");
        tv6.setText("Magrib Start: 5:41 PM");
        tv7.setText("Esha Start  : 6:58 PM");

    }

    public void FebTime_1_2() {

        tv1.setText("Sahri End    : 5:11 AM");
        tv2.setText("Fazar Start  : 5:17 AM");
        tv3.setText("Sunrise      : 6:35 AM");
        tv4.setText("Juhar Start  : 12:13 PM");
        tv5.setText("Asar Start   : 4:04 PM");
        tv6.setText("Magrib Start : 5:43 PM");
        tv7.setText("Esha Start   : 7:01 PM");

    }
    public void FebTime_1_3() {

        tv1.setText("Sahri End    : 5:09 AM");
        tv2.setText("Fazar Start  : 5:15 AM");
        tv3.setText("Sunrise      : 6:31 AM");
        tv4.setText("Juhar Start  : 12:13 PM");
        tv5.setText("Asar Start   : 4:07 PM");
        tv6.setText("Magrib Start : 5:47 PM");
        tv7.setText("Esha Start   : 7:03 PM");

    }

    public void FebTime_1_4() {

        tv1.setText("Sahri End    : 5:06 AM");
        tv2.setText("Fazar Start  : 5:12 AM");
        tv3.setText("Sunrise      : 6:28 AM");
        tv4.setText("Juhar Start  : 12:13 PM");
        tv5.setText("Asar Start   : 4:10 PM");
        tv6.setText("Magrib Start : 5:50 PM");
        tv7.setText("Esha Start   : 7:06 PM");

    }

    public void FebTime_1_5() {

        tv1.setText("Sahri End   : 5:03 AM");
        tv2.setText("Fazar Start : 5:09 AM");
        tv3.setText("Sunrise     : 6:24 AM");
        tv4.setText("Juhar Start : 12:13 PM");
        tv5.setText("Asar Start  : 4:13 PM");
        tv6.setText("Magrib Start: 5:58 PM");
        tv7.setText("Esha Start  : 7:09 PM");

    }

    public void FebTime_1_6() {

        tv1.setText("Sahri End   :  4:59 AM");
        tv2.setText("Fazar Start :  5:05 AM");
        tv3.setText("Sunrise     :  6:20 AM");
        tv4.setText("Juhar Start :  12:12 PM");
        tv5.setText("Asar Start  :  4:15 PM");
        tv6.setText("Magrib Start:  5:56 PM");
        tv7.setText("Esha Start  : 7:11 PM");

    }
    //February End//

    //March Start//

    public void MarTime_1_1() {

        tv1.setText("Sahri End   : 4:55 AM");
        tv2.setText("Fazar Start : 5:01 AM");
        tv3.setText("Sunrise     : 6:16 AM");
        tv4.setText("Juhar Start : 12:11 PM");
        tv5.setText("Asar Start  : 4:18 PM");
        tv6.setText("Magrib Start: 5:58 PM");
        tv7.setText("Esha Start  : 7:13 PM");

    }

    public void MarTime_1_2() {

        tv1.setText("Sahri End   : 4:53 AM");
        tv2.setText("Fazar Start : 4:59 AM");
        tv3.setText("Sunrise     : 6:12 AM");
        tv4.setText("Juhar Start : 12:11 PM");
        tv5.setText("Asar Start  : 4:19 PM");
        tv6.setText("Magrib Start: 6:01 PM");
        tv7.setText("Esha Start  : 7:14 PM");

    }
    public void MarTime_1_3() {

        tv1.setText("Sahri End   : 4:48 AM");
        tv2.setText("Fazar Start : 4:54 AM");
        tv3.setText("Sunrise     : 6:07 AM");
        tv4.setText("Juhar Start : 12:09 PM");
        tv5.setText("Asar Start  : 4:21 PM");
        tv6.setText("Magrib Start: 6:03 PM");
        tv7.setText("Esha Start  : 7:16 PM");

    }
    public void MarTime_1_4() {

        tv1.setText("Sahri End   : 4:43 AM");
        tv2.setText("Fazar Start : 4:49 AM");
        tv3.setText("Sunrise     : 6:02 AM");
        tv4.setText("Juhar Start : 12:08 PM");
        tv5.setText("Asar Start  : 4:22 PM");
        tv6.setText("Magrib Start: 6:05 PM");
        tv7.setText("Esha Start  : 7:18 PM");

    }

    public void MarTime_1_5() {

        tv1.setText("Sahri End   : 4:38 AM");
        tv2.setText("Fazar Start : 4:44 AM");
        tv3.setText("Sunrise     : 5:57 AM");
        tv4.setText("Juhar Start : 12:06 PM");
        tv5.setText("Asar Start  : 4:23 PM");
        tv6.setText("Magrib Start: 6:07 PM");
        tv7.setText("Esha Start  : 7:20 PM");

    }

    public void MarTime_1_6() {

        tv1.setText("Sahri End   : 4:33 AM");
        tv2.setText("Fazar Start : 4:39 AM");
        tv3.setText("Sunrise     : 5:52 AM");
        tv4.setText("Juhar Start : 12:05 PM");
        tv5.setText("Asar Start  : 4:23 PM");
        tv6.setText("Magrib Start: 6:09 PM");
        tv7.setText("Esha Start  : 7:22 PM");

    }
    //March End//

    //April Start//

    public void AprTime_1_1() {

        tv1.setText("Sahri End   : 4:24 AM");
        tv2.setText("Fazar Start : 4:30 AM");
        tv3.setText("Sunrise     : 5:45 AM");
        tv4.setText("Juhar Start : 12:03 PM");
        tv5.setText("Asar Start  : 4:25 PM");
        tv6.setText("Magrib Start: 6:12 PM");
        tv7.setText("Esha Start  : 7:27 PM");

    }

    public void AprTime_1_2() {

        tv1.setText("Sahri End   : 4:20 AM");
        tv2.setText("Fazar Start : 4:26 AM");
        tv3.setText("Sunrise     : 5:41 AM");
        tv4.setText("Juhar Start : 12:02 PM");
        tv5.setText("Asar Start  : 4:26 PM");
        tv6.setText("Magrib Start: 6:14 PM");
        tv7.setText("Esha Start  : 7:29 PM");

    }

    public void AprTime_1_3() {

        tv1.setText("Sahri End   : 4:15 AM");
        tv2.setText("Fazar Start : 4:21 AM");
        tv3.setText("Sunrise     : 5:36 AM");
        tv4.setText("Juhar Start : 12:00 PM");
        tv5.setText("Asar Start  : 4:26 PM");
        tv6.setText("Magrib Start: 6:16 PM");
        tv7.setText("Esha Start  : 7:31 PM");

    }

    public void AprTime_1_4() {

        tv1.setText("Sahri End   : 4:09 AM");
        tv2.setText("Fazar Start : 4:15 AM");
        tv3.setText("Sunrise     : 5:31 AM");
        tv4.setText("Juhar Start : 11:59 AM");
        tv5.setText("Asar Start  : 4:26 PM");
        tv6.setText("Magrib Start: 6:18 PM");
        tv7.setText("Esha Start  : 7:34 PM");

    }


    public void AprTime_1_5() {

        tv1.setText("Sahri End   : 4:04 AM");
        tv2.setText("Fazar Start : 4:10 AM");
        tv3.setText("Sunrise     : 5:26 AM");
        tv4.setText("Juhar Start : 11:58 AM");
        tv5.setText("Asar Start  : 4:27 PM");
        tv6.setText("Magrib Start: 6:21 PM");
        tv7.setText("Esha Start  : 7:37 PM");

    }
    public void AprTime_1_6() {

        tv1.setText("Sahri End   : 4:00 AM");
        tv2.setText("Fazar Start : 4:06 AM");
        tv3.setText("Sunrise     : 5:22 AM");
        tv4.setText("Juhar Start : 11:57 AM");
        tv5.setText("Asar Start  : 4:27 PM");
        tv6.setText("Magrib Start: 6:23 PM");
        tv7.setText("Esha Start  : 7:39 PM");


    }
    //April End//

    //May Start//

    public void MayTime_1_1() {

        tv1.setText("Sahri End   : 3:54 AM");
        tv2.setText("Fazar Start : 4:00 AM");
        tv3.setText("Sunrise     : 5:17 AM");
        tv4.setText("Juhar Start : 11:56 AM");
        tv5.setText("Asar Start  : 4:29 PM");
        tv6.setText("Magrib Start: 6:26 PM");
        tv7.setText("Esha Start  : 7:43 PM");

    }
    public void MayTime_1_2() {

        tv1.setText("Sahri End   : 3:50 AM");
        tv2.setText("Fazar Start : 3:56 AM");
        tv3.setText("Sunrise     : 5:15 AM");
        tv4.setText("Juhar Start : 11:56 AM");
        tv5.setText("Asar Start  : 4:29 PM");
        tv6.setText("Magrib Start: 6:28 PM");
        tv7.setText("Esha Start  : 7:47 PM");

    }
    public void MayTime_1_3() {

        tv1.setText("Sahri End   : 3:45 AM");
        tv2.setText("Fazar Start : 3:51 AM");
        tv3.setText("Sunrise     : 5:11 AM");
        tv4.setText("Juhar Start : 11:55 AM");
        tv5.setText("Asar Start  : 4:29 PM");
        tv6.setText("Magrib Start: 6:31 PM");
        tv7.setText("Esha Start  : 7:51 PM");

    }
    public void MayTime_1_4() {


        tv1.setText("Sahri End   : 3:42 AM");
        tv2.setText("Fazar Start : 3:48 AM");
        tv3.setText("Sunrise     : 5:09 AM");
        tv4.setText("Juhar Start : 11:55 AM");
        tv5.setText("Asar Start  : 4:29 PM");
        tv6.setText("Magrib Start: 6:33 PM");
        tv7.setText("Esha Start  : 7:54 PM");
    }
    public void MayTime_1_5() {

        tv1.setText("Sahri End   : 3:39 AM");
        tv2.setText("Fazar Start : 3:45 AM");
        tv3.setText("Sunrise     : 5:06 AM");
        tv4.setText("Juhar Start : 11:55 AM");
        tv5.setText("Asar Start  : 4:30 PM");
        tv6.setText("Magrib Start: 6:36 PM");
        tv7.setText("Esha Start  : 7:57 PM");

    }
    public void MayTime_1_6() {

        tv1.setText("Sahri End   : 3:37 AM");
        tv2.setText("Fazar Start : 3:43 AM");
        tv3.setText("Sunrise     : 5:05 AM");
        tv4.setText("Juhar Start : 11:56 AM");
        tv5.setText("Asar Start  : 4:32 PM");
        tv6.setText("Magrib Start: 6:39 PM");
        tv7.setText("Esha Start  : 8:01 PM");

    }


    //May End//

    //Jun Start//


    public void JunTime_1_1() {

        tv1.setText("Sahri End   : 3:34 AM");
        tv2.setText("Fazar Start : 3:40 AM");
        tv3.setText("Sunrise     : 5:03 AM");
        tv4.setText("Juhar Start : 11:57 AM");
        tv5.setText("Asar Start  : 4:34 PM");
        tv6.setText("Magrib Start: 6:42 PM");
        tv7.setText("Esha Start  : 8:05 PM");

    }
    public void JunTime_1_2() {

        tv1.setText("Sahri End   : 3:34 AM");
        tv2.setText("Fazar Start : 3:40 AM");
        tv3.setText("Sunrise     : 5:03 AM");
        tv4.setText("Juhar Start : 11:57 AM");
        tv5.setText("Asar Start  : 4:35 PM");
        tv6.setText("Magrib Start: 6:43 PM");
        tv7.setText("Esha Start  : 8:06 PM");

    }
    public void JunTime_1_3() {


        tv1.setText("Sahri End   : 3:33 AM");
        tv2.setText("Fazar Start : 3:39 AM");
        tv3.setText("Sunrise     : 5:02 AM");
        tv4.setText("Juhar Start : 11:58 AM");
        tv5.setText("Asar Start  : 4:35 PM");
        tv6.setText("Magrib Start: 6:45 PM");
        tv7.setText("Esha Start  : 8:08 PM");

    }
    public void JunTime_1_4() {


        tv1.setText("Sahri End   : 3:33 AM");
        tv2.setText("Fazar Start : 3:39 AM");
        tv3.setText("Sunrise     : 5:02 AM");
        tv4.setText("Juhar Start : 11:59 AM");
        tv5.setText("Asar Start  : 4:36 PM");
        tv6.setText("Magrib Start: 6:47 PM");
        tv7.setText("Esha Start  : 8:10 PM");

    }
    public void JunTime_1_5() {

        tv1.setText("Sahri End   : 3:33 AM");
        tv2.setText("Fazar Start : 3:39 AM");
        tv3.setText("Sunrise     : 5:03 AM");
        tv4.setText("Juhar Start : 12:00 PM");
        tv5.setText("Asar Start  : 4:38 PM");
        tv6.setText("Magrib Start: 6:48 PM");
        tv7.setText("Esha Start  : 8:12 PM");

    }
    public void JunTime_1_6() {

        tv1.setText("Sahri End   : 3:34 AM");
        tv2.setText("Fazar Start : 3:40 AM");
        tv3.setText("Sunrise     : 5:04 AM");
        tv4.setText("Juhar Start : 12:02 PM");
        tv5.setText("Asar Start  : 4:39 PM");
        tv6.setText("Magrib Start: 6:48 PM");
        tv7.setText("Esha Start  : 8:14 PM");

    }

    //June End//

    //July Start//

    public void JulTime_1_1() {

        tv1.setText("Sahri End   : 3:37 AM");
        tv2.setText("Fazar Start : 3:43 AM");
        tv3.setText("Sunrise     : 5:06 AM");
        tv4.setText("Juhar Start : 12:03 PM");
        tv5.setText("Asar Start  : 4:39 PM");
        tv6.setText("Magrib Start: 6:50 PM");
        tv7.setText("Esha Start  : 8:13 PM");

    }
    public void JulTime_1_2() {

        tv1.setText("Sahri End   : 3:39 AM");
        tv2.setText("Fazar Start : 3:45 AM");
        tv3.setText("Sunrise     : 5:07 AM");
        tv4.setText("Juhar Start : 12:03 PM");
        tv5.setText("Asar Start  : 4:40 PM");
        tv6.setText("Magrib Start: 6:50 PM");
        tv7.setText("Esha Start  : 8:12 PM");

    }
    public void JulTime_1_3() {

        tv1.setText("Sahri End   : 3:41 AM");
        tv2.setText("Fazar Start : 3:47 AM");
        tv3.setText("Sunrise     : 5:10 AM");
        tv4.setText("Juhar Start : 12:03 PM");
        tv5.setText("Asar Start  : 4:40 PM");
        tv6.setText("Magrib Start: 6:49 PM");
        tv7.setText("Esha Start  : 8:11 PM");

    }
    public void JulTime_1_4() {

        tv1.setText("Sahri End   : 3:44 AM");
        tv2.setText("Fazar Start : 3:50 AM");
        tv3.setText("Sunrise     : 5:12 AM");
        tv4.setText("Juhar Start : 12:05 PM");
        tv5.setText("Asar Start  : 4:41 PM");
        tv6.setText("Magrib Start: 6:49 PM");
        tv7.setText("Esha Start  : 8:10 PM");

    }
    public void JulTime_1_5() {

        tv1.setText("Sahri End   : 3:47 AM");
        tv2.setText("Fazar Start : 3:53 AM");
        tv3.setText("Sunrise     : 5:14 AM");
        tv4.setText("Juhar Start : 12:05 PM");
        tv5.setText("Asar Start  : 4:41 PM");
        tv6.setText("Magrib Start: 6:47 PM");
        tv7.setText("Esha Start  : 8:08 PM");

    }
    public void JulTime_1_6() {

        tv1.setText("Sahri End   : 3:51 AM");
        tv2.setText("Fazar Start : 3:57 AM");
        tv3.setText("Sunrise     : 5:16 AM");
        tv4.setText("Juhar Start : 12:05 PM");
        tv5.setText("Asar Start  : 4:40 PM");
        tv6.setText("Magrib Start: 6:45 PM");
        tv7.setText("Esha Start  : 8:04 PM");

    }
    //July End//

    //August Start//

    public void AugTime_1_1() {

        tv1.setText("Sahri End   : 3:55 AM");
        tv2.setText("Fazar Start : 4:01 AM");
        tv3.setText("Sunrise     : 5:20 AM");
        tv4.setText("Juhar Start : 12:05 PM");
        tv5.setText("Asar Start  : 4:39 PM");
        tv6.setText("Magrib Start: 6:41 PM");
        tv7.setText("Esha Start  : 8:00 PM");
    }

    public void AugTime_1_2() {

        tv1.setText("Sahri End   : 3:58 AM");
        tv2.setText("Fazar Start : 4:04 AM");
        tv3.setText("Sunrise     : 5:22 AM");
        tv4.setText("Juhar Start : 12:05 PM");
        tv5.setText("Asar Start  : 4:38 PM");
        tv6.setText("Magrib Start: 6:39 PM");
        tv7.setText("Esha Start  : 7:57 PM");
    }
    public void AugTime_1_3() {

        tv1.setText("Sahri End   : 4:01 AM");
        tv2.setText("Fazar Start : 4:07 AM");
        tv3.setText("Sunrise     : 5:24 AM");
        tv4.setText("Juhar Start : 12:04 PM");
        tv5.setText("Asar Start  : 4:36 PM");
        tv6.setText("Magrib Start: 6:35 PM");
        tv7.setText("Esha Start  : 7:52 PM");
    }
    public void AugTime_1_4() {

        tv1.setText("Sahri End   : 4:04 AM");
        tv2.setText("Fazar Start : 4:10 AM");
        tv3.setText("Sunrise     : 5:27 AM");
        tv4.setText("Juhar Start : 12:03 PM");
        tv5.setText("Asar Start  : 4:34 PM");
        tv6.setText("Magrib Start: 6:31 PM");
        tv7.setText("Esha Start  : 7:48 PM");
    }

    public void AugTime_1_5() {

        tv1.setText("Sahri End   :  4:07 AM");
        tv2.setText("Fazar Start :  4:13 AM");
        tv3.setText("Sunrise     :  5:28 AM");
        tv4.setText("Juhar Start :  12:02 PM");
        tv5.setText("Asar Start  :  4:31 PM");
        tv6.setText("Magrib Start: 6:27 PM");
        tv7.setText("Esha Start  : 7:43 PM");
    }
    public void AugTime_1_6() {

        tv1.setText("Sahri End   : 4:10 AM");
        tv2.setText("Fazar Start : 4:16 AM");
        tv3.setText("Sunrise     : 5:28 AM");
        tv4.setText("Juhar Start : 12:01 PM");
        tv5.setText("Asar Start  : 4:29 PM");
        tv6.setText("Magrib Start: 6:23 PM");
        tv7.setText("Esha Start  : 7:38 PM");
    }

    //August End//

    //September Start//

    public void SepTime_1_1() {

        tv1.setText("Sahri End   : 4:13 AM");
        tv2.setText("Fazar Start : 4:19 AM");
        tv3.setText("Sunrise     : 5:33 AM");
        tv4.setText("Juhar Start : 11:59 AM");
        tv5.setText("Asar Start  : 4:24 PM");
        tv6.setText("Magrib Start: 6:16 PM");
        tv7.setText("Esha Start  : 7:30 PM");
    }

    public void SepTime_1_2() {

        tv1.setText("Sahri End   : 4:15 AM");
        tv2.setText("Fazar Start : 4:21 AM");
        tv3.setText("Sunrise     : 5:35 AM");
        tv4.setText("Juhar Start : 11:58 AM");
        tv5.setText("Asar Start  : 4:22 PM");
        tv6.setText("Magrib Start: 6:11 PM");
        tv7.setText("Esha Start  : 7:25 PM");
    }
    public void SepTime_1_3() {

        tv1.setText("Sahri End   : 4:17 AM");
        tv2.setText("Fazar Start : 4:23 AM");
        tv3.setText("Sunrise     : 5:37 AM");
        tv4.setText("Juhar Start : 11:56 AM");
        tv5.setText("Asar Start  : 4:18 PM");
        tv6.setText("Magrib Start: 6:06 PM");
        tv7.setText("Esha Start  :7:20 PM");
    }
    public void SepTime_1_4() {

        tv1.setText("Sahri End   : 4:19 AM");
        tv2.setText("Fazar Start : 4:25 AM");
        tv3.setText("Sunrise     : 5:39 AM");
        tv4.setText("Juhar Start : 11:54 AM");
        tv5.setText("Asar Start  : 4:14 PM");
        tv6.setText("Magrib Start: 6:01 PM");
        tv7.setText("Esha Start  : 7:15 PM");
    }
    public void SepTime_1_5() {

        tv1.setText("Sahri End   : 4:22 AM");
        tv2.setText("Fazar Start : 4:28 AM");
        tv3.setText("Sunrise     : 5:40 AM");
        tv4.setText("Juhar Start : 11:52 AM");
        tv5.setText("Asar Start  : 4:10 PM");
        tv6.setText("Magrib Start: 5:56 PM");
        tv7.setText("Esha Start  : 7:09 PM");
    }
    public void SepTime_1_6() {

        tv1.setText("Sahri End   : 4:23 AM");
        tv2.setText("Fazar Start : 4:29 AM");
        tv3.setText("Sunrise     : 5:46 AM");
        tv4.setText("Juhar Start : 11:51 AM");
        tv5.setText("Asar Start  : 4:06 PM");
        tv6.setText("Magrib Start: 5:51 PM");
        tv7.setText("Esha Start  : 7:04 PM");
    }
    //September End//

    //October Start//

    public void OctTime_1_1() {

        tv1.setText("Sahri End   : 4:26 AM");
        tv2.setText("Fazar Start : 4:32 AM");
        tv3.setText("Sunrise     : 5:45 AM");
        tv4.setText("Juhar Start : 11:49 AM");
        tv5.setText("Asar Start  : 4:00 PM");
        tv6.setText("Magrib Start: 5:44 PM");
        tv7.setText("Esha Start  : 6:59 PM");
    }

    public void OctTime_1_2() {
        tv1.setText("Sahri End   : 4:27 AM");
        tv2.setText("Fazar Start : 4:33 AM");
        tv3.setText("Sunrise     : 5:46 AM");
        tv4.setText("Juhar Start : 11:47 AM");
        tv5.setText("Asar Start  : 3:57 PM");
        tv6.setText("Magrib Start: 5:40 PM");
        tv7.setText("Esha Start  : 6:55 PM");
    }
    public void OctTime_1_3() {

        tv1.setText("Sahri End   : 4:29 AM");
        tv2.setText("Fazar Start : 4:35 AM");
        tv3.setText("Sunrise     : 5:48 AM");
        tv4.setText("Juhar Start : 11:46 AM");
        tv5.setText("Asar Start  : 3:53 PM");
        tv6.setText("Magrib Start: 5:35 PM");
        tv7.setText("Esha Start  : 6:50 PM");
    }

    public void OctTime_1_4() {
        tv1.setText("Sahri End   : 4:31 AM");
        tv2.setText("Fazar Start : 4:37 AM");
        tv3.setText("Sunrise     : 5:50 AM");
        tv4.setText("Juhar Start : 11:45 AM");
        tv5.setText("Asar Start  : 3:49 PM");
        tv6.setText("Magrib Start: 5:30 PM");
        tv7.setText("Esha Start  : 6:45 PM");
    }
    public void OctTime_1_5() {
        tv1.setText("Sahri End   : 4:33 AM");
        tv2.setText("Fazar Start : 4:39 AM");
        tv3.setText("Sunrise     : 5:53 AM");
        tv4.setText("Juhar Start : 11:44 AM");
        tv5.setText("Asar Start  : 3:46 PM");
        tv6.setText("Magrib Start: 5:26 PM");
        tv7.setText("Esha Start  : 6:40 PM");

    }
    public void OctTime_1_6() {
        tv1.setText("Sahri End    : 4:35 AM");
        tv2.setText("Fazar Start  : 4:41 AM");
        tv3.setText("Sunrise      : 5:56 AM");
        tv4.setText("Juhar Start  : 11:43 AM");
        tv5.setText("Asar Start   : 3:41 PM");
        tv6.setText("Magrib Start : 5:21 PM");
        tv7.setText("Esha Start   : 6:37 PM");
    }
    //October  End//

    //November  Start//

    public void NovTime_1_1() {
        tv1.setText("Sahri End   : 4:38 AM");
        tv2.setText("Fazar Start : 4:44 AM");
        tv3.setText("Sunrise     : 6:00 AM");
        tv4.setText("Juhar Start : 11:43 AM");
        tv5.setText("Asar Start  : 3:37 PM");
        tv6.setText("Magrib Start: 5:16 PM");
        tv7.setText("Esha Start  : 6:32 PM");
    }

    public void NovTime_1_2() {
        tv1.setText("Sahri End   :  4:40 AM");
        tv2.setText("Fazar Start :  4:46 AM");
        tv3.setText("Sunrise     :  6:02 AM");
        tv4.setText("Juhar Start : 11:43 AM");
        tv5.setText("Asar Start  :  3:35 PM");
        tv6.setText("Magrib Start: 5:14 PM");
        tv7.setText("Esha Start  : 6:30 PM");
    }

    public void NovTime_1_3() {
        tv1.setText("Sahri End  :   4:43 AM");
        tv2.setText("Fazar Start:  4:49 AM");
        tv3.setText("Sunrise    :    6:06 AM");
        tv4.setText("Juhar Start:  11:43 AM");
        tv5.setText("Asar Start :  3:33 PM");
        tv6.setText("Magrib Start: 5:11 PM");
        tv7.setText("Esha Start :  6:28 PM");
    }
    public void NovTime_1_4() {
        tv1.setText("Sahri End   : 4:46 AM");
        tv2.setText("Fazar Start : 4:52 AM");
        tv3.setText("Sunrise     : 6:10 AM");
        tv4.setText("Juhar Start : 11:44 AM");
        tv5.setText("Asar Start  : 3:29 PM");
        tv6.setText("Magrib Start: 5:08 PM");
        tv7.setText("Esha Start  : 6:26 PM");
    }
    public void NovTime_1_5() {
        tv1.setText("Sahri End   : 4:49 AM");
        tv2.setText("Fazar Start : 4:55 AM");
        tv3.setText("Sunrise     : 6:13 AM");
        tv4.setText("Juhar Start : 11:45 AM");
        tv5.setText("Asar Start  : 3:28 PM");
        tv6.setText("Magrib Start: 5:07 PM");
        tv7.setText("Esha Start  : 6:25 PM");
    }
    public void NovTime_1_6() {
        tv1.setText("Sahri End   : 4:52 AM");
        tv2.setText("Fazar Start : 4:58 AM");
        tv3.setText("Sunrise     : 6:17 AM");
        tv4.setText("Juhar Start : 11:46 AM");
        tv5.setText("Asar Start  : 3:28 PM");
        tv6.setText("Magrib Start: 5:06 PM");
        tv7.setText("Esha Start  : 6:25 PM");
    }
    //November End//

    //December Start//

    public void DecTime_1_1() {

        tv1.setText("Sahri End   : 4:55 AM");
        tv2.setText("Fazar Start : 5:01 AM");
        tv3.setText("Sunrise     : 6:21 AM");
        tv4.setText("Juhar Start : 11:48 AM");
        tv5.setText("Asar Start  : 3:28 PM");
        tv6.setText("Magrib Start: 5:06 PM");
        tv7.setText("Esha Start  : 6:26 PM");
    }
    public void DecTime_1_2() {

        tv1.setText("Sahri End   : 4:58 AM");
        tv2.setText("Fazar Start : 5:04 AM");
        tv3.setText("Sunrise     : 6:24 AM");
        tv4.setText("Juhar Start : 11:50 AM");
        tv5.setText("Asar Start  : 3:28 PM");
        tv6.setText("Magrib Start: 5:06 PM");
        tv7.setText("Esha Start  : 6:26 PM");
    }
    public void DecTime_1_3() {

        tv1.setText("Sahri End   : 5:01 AM");
        tv2.setText("Fazar Start : 5:07 AM");
        tv3.setText("Sunrise     : 6:27 AM");
        tv4.setText("Juhar Start : 11:52 AM");
        tv5.setText("Asar Start  : 3:30 PM");
        tv6.setText("Magrib Start: 5:08 PM");
        tv7.setText("Esha Start  : 6:28 PM");
    }
    public void DecTime_1_4() {

        tv1.setText("Sahri End   : 5:04 AM");
        tv2.setText("Fazar Start : 5:10 AM");
        tv3.setText("Sunrise     : 6:30 AM");
        tv4.setText("Juhar Start : 11:54 AM");
        tv5.setText("Asar Start  : 3:30 PM");
        tv6.setText("Magrib Start: 5:09 PM");
        tv7.setText("Esha Start  : 6:29 PM");
    }
    public void DecTime_1_5() {

        tv1.setText("Sahri End   : 5:06 AM");
        tv2.setText("Fazar Start : 5:12 AM");
        tv3.setText("Sunrise     : 6:33 AM");
        tv4.setText("Juhar Start : 11:57 AM");
        tv5.setText("Asar Start  : 3:33 PM");
        tv6.setText("Magrib Start: 5:11 PM");
        tv7.setText("Esha Start  : 6:32 PM");
    }
    public void DecTime_1_6() {

        tv1.setText("Sahri End   : 5:09 AM");
        tv2.setText("Fazar Start : 5:15 AM");
        tv3.setText("Sunrise     : 6:35 AM");
        tv4.setText("Juhar Start : 11:59 AM");
        tv5.setText("Asar Start  : 3:35 PM");
        tv6.setText("Magrib Start: 5:13 PM");
        tv7.setText("Esha Start  : 6:34 PM");
    }



    //December End//

    public void Nothing() {
        tv1.setText("Sahri End    ");
        tv2.setText("Fazar Start  ");
        tv3.setText("Sunrise      ");
        tv4.setText("Juhar Start  ");
        tv5.setText("Asar Start   ");
        tv6.setText("Magrib Start ");
        tv7.setText("Esha Start   ");
    }

}
