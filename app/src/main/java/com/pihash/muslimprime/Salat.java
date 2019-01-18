package com.pihash.muslimprime;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Salat extends AppCompatActivity {
    TextView tv1;
    Button Today;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Today=(Button)findViewById(R.id.TodayView);
        tv1=(TextView)findViewById(R.id.textViewDate);

        Today.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
               // Intent iIntent = new Intent(FristActivity.this, Dua.class);
                Intent OpenIt= new Intent(Salat.this, Sylhet.class);
                startActivity(OpenIt);
            }
        });

        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdfmonth = new SimpleDateFormat("MMM");
        String strMonth = sdfmonth.format(c.getTime());
        SimpleDateFormat sdfdate = new SimpleDateFormat("dd");
        String strDate = sdfdate.format(c.getTime());


        tv1.setText("Today: " + strDate + "," + strMonth + "");
    }

}
