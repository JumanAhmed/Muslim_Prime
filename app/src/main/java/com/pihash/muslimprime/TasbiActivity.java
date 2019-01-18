package com.pihash.muslimprime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TasbiActivity extends AppCompatActivity {

    TextView text;
    ImageButton but1;
    com.pihash.flo.FloatingActionButton but2;
    com.pihash.flo.FloatingActionButton but3;
    int tot=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbi);
        text=(TextView)findViewById(R.id.txtview);
        but1=(ImageButton)findViewById(R.id.but1);
        but2=(com.pihash.flo.FloatingActionButton)findViewById(R.id.but2);
        but3=(com.pihash.flo.FloatingActionButton)findViewById(R.id.but3);



        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tot++;
                text.setText(translate(String.valueOf(tot)));
            }
        });




        but2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(tot!=0) {
                    tot--;
                    text.setText(translate(String.valueOf(tot)));
                }
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tot=0;
                text.setText(translate(String.valueOf(tot)));
            }
        });




    }


    public static String translate(String str)
    {
        String[] en = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] bn = {"০", "১", "২", "৩", "৪", "৫", "৬", "৭", "৮", "৯"};

        for (int i=0; i <= 9; i++)
        {
            str = str.replace(en[i], bn[i]);
        }

        return(str);
    }

}
