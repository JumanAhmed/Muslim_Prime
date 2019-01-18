package com.pihash.muslimprime;


import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class AlarmService extends IntentService {
    private static final int NOTIFICATION_ID = 1;
    private static final String TAG = "Namaz";
    private NotificationManager notificationManager;
    private PendingIntent pendingIntent;
    Context context;
    Intent mIntent;
    Bundle bundle;
    Resources res;
    NotificationCompat.Builder builder;
    Uri notification;
    Ringtone r;
    MyAlarm app;
    String id;
    Calendar c;
    int hour;
    int minute;
    int m;
    int sec;
    String data;

    public AlarmService() {
        super("AlarmService");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        app = (MyAlarm) getApplicationContext();
        c = Calendar.getInstance();
        SimpleDateFormat sdfmonth = new SimpleDateFormat("MMM");
        String Month = sdfmonth.format(c.getTime());
        int Day = c.getInstance().get(Calendar.DATE);
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        m= c.get(Calendar.MINUTE);
        sec= c.get(Calendar.SECOND);
        id = intent.getStringExtra("da");
        Log.i(TAG, "Alarm Service has started.");
        context = this.getApplicationContext();
        notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mIntent = new Intent(this, FrActivity.class);
        bundle = new Bundle();
        bundle.putString("test", "test");
        mIntent.putExtras(bundle);
        pendingIntent = PendingIntent.getActivity(context, 0, mIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        res = this.getResources();
        builder = new NotificationCompat.Builder(this);

        //January comapre//
        if(Month.equals("Jan")){

            if(Day>=1&&Day<6)
            {
                if(hour==5 && minute==11){
                    data="Sahri End";
                    notific();

                }else if(hour==5&&minute==17) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==38) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==2){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==40) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==18) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==39) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>5&&Day<10)
            {
                if(hour==5 && minute==13){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==19) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==39) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==4){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==42) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==21) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==41) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>9&&Day<15)
            {
                if(hour==5 && minute==14){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==20) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==39) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==6){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==45) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==24) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==43) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>14&&Day<20)
            {
                if(hour==5 && minute==15){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==21) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==39) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==8){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==39) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==28) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==47) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==5 && minute==15){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==21) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==39) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==10){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==58) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==32) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==50) {
                    data="Esha Start";
                    notific();}


            }
            else if(Day>25)
            {
                if(hour==5 && minute==14){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==20) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==39) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==5){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==57) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==35) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==54) {
                    data="Esha Start";
                    notific();}

            }
        }

        //Feb comapre//

        if(Month.equals("Feb")){

            if(Day>=1&&Day<6)
            {
                if(hour==5 && minute==13){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==19) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==36) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==13){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==3) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==41) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==58) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>5&&Day<10)
            {
                if(hour==5 && minute==11){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==17) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==35) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==13){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==4) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==43) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==1) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>9&&Day<15)
            {
                if(hour==5 && minute==9){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==15) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==31) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==13){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==7) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==47) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==3) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>14&&Day<20)
            {
                if(hour==5 && minute==6){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==12) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==28) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==13){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==10) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==50) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==6) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==5 && minute==3){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==9) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==24) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==13){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==13) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==58) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==9) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>25)
            {
                if(hour==4 && minute==59){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==5) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==20) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==12){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==15) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==56) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==11) {
                    data="Esha Start";
                    notific();}

            }
        }

        //Mar comapre//

        if(Month.equals("Mar")){

            if(Day>=1&&Day<6)
            {
                if(hour==4 && minute==55){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==1) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==16) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==11){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==48) {
                    data="Asar Start ";
                    notific();

                }else if(hour==17&&minute==58) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==13) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>5&&Day<10)
            {
                if(hour==4 && minute==53){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==59) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==12) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==11){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==19) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==1) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==14) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>9&&Day<15)
            {
                if(hour==4 && minute==48){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==54) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==7) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==9){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==21) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==3) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==16) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>14&&Day<20)
            {
                if(hour==4 && minute==43){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==49) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==2) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==8){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==22) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==5) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==18) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==4 && minute==38){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==44) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==57) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==6){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==23) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==7) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==20) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>25)
            {
                if(hour==4 && minute==33){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==39) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==52) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==5){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==23) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==9) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==22) {
                    data="Esha Start";
                    notific();}

            }
        }

        //Apr comapre//

        if(Month.equals("Apr")){

            if(Day>=1&&Day<6)
            {
                if(hour==4 && minute==24){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==30) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==45) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==3){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==25) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==12) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==27) {
                    data="Esha Start";
                    notific();}
            }
            else if(Day>5&&Day<10)
            {
                if(hour==4 && minute==20){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==26) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==41) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==2){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==26) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==14) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==29) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>9&&Day<15)
            {
                if(hour==4 && minute==15){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==21) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==36) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==0){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==26) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==16) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==31) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>14&&Day<20)
            {
                if(hour==4 && minute==9){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==15) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==31) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==59){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==26) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==18) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==34) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==4 && minute==4){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==10) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==26) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==58){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==27) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==21) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==37) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>25)
            {
                if(hour==4 && minute==0){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==6) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==22) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==57){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==27) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==23) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==39) {
                    data="Esha Start";
                    notific();}

            }
        }

        //May compare//

        if(Month.equals("May")){

            if(Day>=1&&Day<6)
            {
                if(hour==3 && minute==54){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==0) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==17) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==56){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==29) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==26) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==43) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>5&&Day<10)
            {
                if(hour==3 && minute==50){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==56) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==15) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==56){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==29) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==28) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==47) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>9&&Day<15)
            {
                if(hour==3 && minute==45){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==51) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==11) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==55){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==29) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==31) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==51) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>14&&Day<20)
            {
                if(hour==3 && minute==42){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==48) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==9) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==55){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==29) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==33) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==54) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==3 && minute==39){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==45) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==6) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==55){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==30) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==36) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==57) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>25)
            {
                if(hour==3 && minute==37){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==43) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==5) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==56){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==32) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==39) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==1) {
                    data="Esha Start";
                    notific();}

            }
        }

        //Jun compare//

        if(Month.equals("Jun")){

            if(Day>=1&&Day<6)
            {
                if(hour==3 && minute==34){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==40) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==3) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==57){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==34) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==42) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==5) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>5&&Day<10)
            {
                if(hour==3 && minute==34){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==40) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==3) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==57){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==35) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==43) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==6) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>9&&Day<15)
            {
                if(hour==3 && minute==33){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==39) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==2) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==58){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==35) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==45) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==8) {
                    data="Esha Start";
                    notific();}


            }
            else if(Day>14&&Day<20)
            {
                if(hour==3 && minute==33){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==39) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==2) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==59){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==36) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==47) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==10) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==3 && minute==33){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==39) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==3) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==0){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==38) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==48) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==12) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>25)
            {
                if(hour==3 && minute==34){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==40) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==4) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==2){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==39) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==48) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==14) {
                    data="Esha Start";
                    notific();}

            }
        }

        //Jul compare//

        if(Month.equals("Jul")){

            if(Day>=1&&Day<6)
            {
                if(hour==3 && minute==37){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==43) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==6) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==3){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==39) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==50) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==13) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>5&&Day<10)
            {
                if(hour==3 && minute==39){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==45) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==7) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==3){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==40) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==50) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==12) {
                    data="Esha Start";
                    notific();}
            }
            else if(Day>9&&Day<15)
            {
                if(hour==3 && minute==41){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==47) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==10) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==3){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==40) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==49) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==11) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>14&&Day<20)
            {
                if(hour==3 && minute==44){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==50) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==12) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==5){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==41) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==49) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==10) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==3 && minute==47){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==53) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==14) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==5){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==41) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==47) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==8) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>25)
            {
                if(hour==3 && minute==51){
                    data="Sahri End";
                    notific();
                }else if(hour==3&&minute==57) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==16) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==5){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==40) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==45) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==4) {
                    data="Esha Start";
                    notific();}

            }
        }

        //Aug compare//

        if(Month.equals("Aug")){

            if(Day>=1&&Day<6)
            {
                if(hour==3 && minute==55){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==1) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==20) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==5){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==39) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==41) {
                    data="Magrib Start";
                    notific();

                }else if(hour==20&&minute==0) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>5&&Day<10)
            {
                if(hour==3 && minute==58){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==4) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==22) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==5){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==38) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==39) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==57) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>9&&Day<15)
            {
                if(hour==4 && minute==1){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==7) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==24) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==4){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==36) {
                    data="Asar Start ";
                    notific();

                }else if(hour==18&&minute==35) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==52) {
                    data="Esha Start";
                    notific();}


            }
            else if(Day>14&&Day<20)
            {
                if(hour==4 && minute==4){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==10) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==27) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==3){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==34) {
                    data="Asar Start";
                    notific();

                }else if(hour==18&&minute==31) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==48) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==4 && minute==7){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==13) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==28) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==2){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==31) {
                    data="Asar Start";
                    notific();

                }else if(hour==18&&minute==27) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==43) {
                    data="Esha Start";
                    notific();}


            }
            else if(Day>25)
            {
                if(hour==4 && minute==10){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==16) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==28) {
                    data="Sunrise";
                    notific();

                }else if(hour==12&&minute==1){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==29) {
                    data="Asar Start";
                    notific();

                }else if(hour==18&&minute==23) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==38) {
                    data="Esha Start";
                    notific();}

            }
        }

        //Sep compare//

        if(Month.equals("Sep")){

            if(Day>=1&&Day<6)
            {

                if(hour==4 && minute==13){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==19) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==33) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==59){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==24) {
                    data="Asar Start";
                    notific();

                }else if(hour==18&&minute==16) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==30) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>5&&Day<10)
            {
                if(hour==4 && minute==15){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==21) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==35) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==58){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==22) {
                    data="Asar Start";
                    notific();

                }else if(hour==18&&minute==11) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==25) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>9&&Day<15)
            {
                if(hour==4 && minute==17){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==23) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==37) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==56){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==18) {
                    data="Asar Start";
                    notific();

                }else if(hour==18&&minute==6) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==20) {
                    data="Esha Start";
                    notific();}


            }
            else if(Day>14&&Day<20)
            {
                if(hour==4 && minute==19){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==25) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==39) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==54){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==14) {
                    data="Asar Start";
                    notific();

                }else if(hour==18&&minute==1) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==15) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==4 && minute==22){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==28) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==40) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==52){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==10) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==56) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==9) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>25)
            {
                if(hour==4 && minute==23){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==29) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==56) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==51){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==6) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==51) {
                    data="Magrib Start";
                    notific();

                }else if(hour==19&&minute==4) {
                    data="Esha Start";
                    notific();}
            }



        }

        //Oct compare//

        if(Month.equals("Oct")){

            if(Day>=1&&Day<6)
            {
                if(hour==4 && minute==26){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==32) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==45) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==49){
                    data="Juhar Start";
                    notific();

                }else if(hour==16&&minute==0) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==54) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==59) {
                    data="Esha Start";
                    notific();}
            }
            else if(Day>5&&Day<10)
            {
                if(hour==4 && minute==27){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==33) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==46) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==47){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==57) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==40) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==55) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>9&&Day<15)
            {
                if(hour==4 && minute==29){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==35) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==48) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==46){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==53) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==35) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==50) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>14&&Day<20)
            {
                if(hour==4 && minute==31){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==37) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==50) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==45){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==49) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==30) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==45) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==4 && minute==33){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==39) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==53) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==44){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==46) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==26) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==40) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>25)
            {
                if(hour==4 && minute==35){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==41) {
                    data="Fazar Start";
                    notific();

                }else if(hour==5&&minute==56) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==43){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==41) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==21) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==37) {
                    data="Esha Start";
                    notific();}

            }



        }

        //Nov compare//

        if(Month.equals("Nov")){

            if(Day>=1&&Day<6)
            {
                if(hour==4 && minute==38){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==44) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==0) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==43){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==57) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==16) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==32) {
                    data="Esha Start";
                    notific();}


            }
            else if(Day>5&&Day<10)
            {
                if(hour==4 && minute==40){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==46) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==2) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==43){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==35) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==14) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==30) {
                    data="Esha Start";
                    notific();}


            }
            else if(Day>9&&Day<15)
            {
                if(hour==4 && minute==43){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==49) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==6) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==43){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==33) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==11) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==28) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>14&&Day<20)
            {
                if(hour==4 && minute==46){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==52) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==10) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==44){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==29) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==8) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==26) {
                    data="Esha Start";
                    notific();}


            }
            else if(Day>19&&Day<26)
            {
                if(hour==4 && minute==49){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==55) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==13) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==45){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==28) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==7) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==25) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>25)
            {
                if(hour==4 && minute==52){
                    data="Sahri End";
                    notific();
                }else if(hour==4&&minute==58) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==17) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==46){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==28) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==6) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==25) {
                    data="Esha Start";
                    notific();}

            }

        }

        //Dec compare//

        if(Month.equals("Dec")){

            if(Day>=1&&Day<6)
            {
                if(hour==4 && minute==55){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==1) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==21) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==48){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==28) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==6) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==26) {
                    data="Esha Start";
                    notific();}


            }
            else if(Day>5&&Day<10)
            {
                if(hour==4 && minute==48){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==4) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==24) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==50){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==28) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==6) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==26) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>9&&Day<15)
            {
                if(hour==5 && minute==1){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==7) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==27) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==52){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==30) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==8) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==28) {
                    data="Esha Start";
                    notific();}
            }
            else if(Day>14&&Day<20)
            {
                if(hour==5 && minute==4){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==10) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==30) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==54){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==30) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==9) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==29) {
                    data="Esha Start";
                    notific();}

            }
            else if(Day>19&&Day<26)
            {
                if(hour==5 && minute==6){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==12) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==33) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==57){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==33) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==11) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==32) {
                    data="Esha Start";
                    notific();}


            }
            else if(Day>25)
            {
                if(hour==5 && minute==9){
                    data="Sahri End";
                    notific();
                }else if(hour==5&&minute==15) {
                    data="Fazar Start";
                    notific();

                }else if(hour==6&&minute==35) {
                    data="Sunrise";
                    notific();

                }else if(hour==11&&minute==59){
                    data="Juhar Start";
                    notific();

                }else if(hour==15&&minute==35) {
                    data="Asar Start";
                    notific();

                }else if(hour==17&&minute==13) {
                    data="Magrib Start";
                    notific();

                }else if(hour==18&&minute==34) {
                    data="Esha Start";
                    notific();}

            }

        }



        }


    private void notific() {
        builder.setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.ic_launcher))
                .setTicker("Namaz")
                .setAutoCancel(true)
                .setContentTitle("Namaz")
                .setContentText(data);
        notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        r = RingtoneManager.getRingtone(getApplicationContext(), notification);
        r.play();
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID, builder.build());
        Log.i(TAG, "Notifications sent.");
        app.incrementCount();
    }


}