package com.pihash.muslimprime;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class progsActivity extends AppCompatActivity {

    private ProgressBar progressBar;


    public class backgroundTask extends AsyncTask<Void,Integer,Void> {

        int progress=0;

        @Override
        protected void onPreExecute() {
            progress = 0;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            goToDashBoard();
        }

        @Override
        protected Void doInBackground(Void... params) {
            while(progress<100){
                progress++;
                publishProgress(progress);
                SystemClock.sleep(20);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            progressBar.setProgress(values[0]);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progs);


        progressBar = (ProgressBar)findViewById(R.id.progressbar_Horizontal);
        progressBar.setProgress(0);
        new backgroundTask().execute();
    }

    public void goToDashBoard(){
        Intent intent = new Intent(progsActivity.this,FrActivity.class);
        startActivity(intent);
        finish();
    }

}

