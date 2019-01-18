package com.pihash.muslimprime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Edetail extends AppCompatActivity {
    String pos;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edetail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pos=getIntent().getStringExtra("pos");
        position=Integer.parseInt(pos);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        String[] string1 = getResources().getStringArray(R.array.arabic);
        String[] string2 = getResources().getStringArray(R.array.uccharon);
        String[] string3 = getResources().getStringArray(R.array.onubad);
        String[] string_title = getResources().getStringArray(R.array.dua_list);


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
