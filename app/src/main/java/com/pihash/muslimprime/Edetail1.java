package com.pihash.muslimprime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Edetail1 extends AppCompatActivity {
    String pos;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edetail1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pos=getIntent().getStringExtra("pos");
        position=Integer.parseInt(pos);




        String[] string1 = getResources().getStringArray(R.array.arabic1);
        String[] string2 = getResources().getStringArray(R.array.uccharon1);
        String[] string3 = getResources().getStringArray(R.array.onubad1);
        String[] string_title = getResources().getStringArray(R.array.dua_list1);


        TextView tv_title = (TextView) findViewById(R.id.title);
        TextView tv_arabic = (TextView) findViewById(R.id.arabic);
        TextView tv_pro = (TextView) findViewById(R.id.uccharon);
        TextView tv_meaning = (TextView) findViewById(R.id.bangla);

        tv_title.setText(string_title[position]);
        tv_arabic.setText(string1[position]);
        tv_pro.setText(string2[position]);
        tv_meaning.setText(string3[position]);

    }

}
