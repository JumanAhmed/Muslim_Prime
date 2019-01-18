package com.pihash.muslimprime;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ED extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ed);
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

        String[] strings = {"ঘুম থেকে উঠে","টয়লেটে যাওয়ার সময়","টয়লেটে থেকে বের হবার সময়","ঘর থেকে বেরোবার সময়","যানবাহনে চরার সময়","ঘরে প্রবেশের সময়","খাওয়ার শুরুতে","খাওয়ার শেষে","বিপদে পড়লে","ঘুমানোর আগে"};

        ListView listView = (ListView) findViewById(R.id.duaList);
        MyAdapter adapter = new MyAdapter(this, strings);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ED.this, Edetail.class);
                intent.putExtra("Pos", position);
                startActivity(intent);
            }
        });


    }

}
