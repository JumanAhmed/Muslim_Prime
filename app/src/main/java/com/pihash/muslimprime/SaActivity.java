package com.pihash.muslimprime;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.pihash.ripple.RippleView;

public class SaActivity extends AppCompatActivity {
    RippleView rippleView1;
    RippleView rippleView2;
    RippleView rippleView3;
    RippleView rippleView4;
    RippleView rippleView5;
    RippleView rippleView6;
    RippleView rippleView7;
    RippleView rippleView8;
    RippleView rippleView9;
    RippleView rippleView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa);
        TextView textv = (TextView) findViewById(R.id.tx55);
        textv.setShadowLayer(30, 0, 0, Color.RED);

        rippleView1=(RippleView)findViewById(R.id.rect5);
        rippleView2=(RippleView)findViewById(R.id.rect1);
        rippleView3=(RippleView)findViewById(R.id.rect4);
        rippleView4=(RippleView)findViewById(R.id.rect6);
        rippleView5=(RippleView)findViewById(R.id.rect7);
        rippleView6=(RippleView)findViewById(R.id.rect8);
        rippleView7=(RippleView)findViewById(R.id.rect9);
        rippleView8=(RippleView)findViewById(R.id.rect10);
        rippleView9=(RippleView)findViewById(R.id.rect11);
        rippleView10=(RippleView)findViewById(R.id.rect12);

        rippleView1.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(SaActivity.this, Edetail1.class);
                i1.putExtra("pos","0");
                startActivity(i1);


            }
        });
        rippleView2.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(SaActivity.this, Edetail1.class);
                i1.putExtra("pos","1");
                startActivity(i1);


            }
        });
        rippleView3.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(SaActivity.this, Edetail1.class);
                i1.putExtra("pos","2");
                startActivity(i1);


            }
        });
        rippleView4.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(SaActivity.this, Edetail1.class);
                i1.putExtra("pos","3");
                startActivity(i1);


            }
        });
        rippleView5.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(SaActivity.this, Edetail1.class);
                i1.putExtra("pos","4");
                startActivity(i1);


            }
        });
        rippleView6.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(SaActivity.this, Edetail1.class);
                i1.putExtra("pos","5");
                startActivity(i1);


            }
        });
        rippleView7.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(SaActivity.this, Edetail1.class);
                i1.putExtra("pos","6");
                startActivity(i1);


            }
        });
        rippleView8.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(SaActivity.this, Edetail1.class);
                i1.putExtra("pos","7");
                startActivity(i1);


            }
        });
        rippleView9.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(SaActivity.this, Edetail1.class);
                i1.putExtra("pos","8");
                startActivity(i1);


            }
        });
        rippleView10.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(SaActivity.this, Edetail1.class);
                i1.putExtra("pos","9");
                startActivity(i1);


            }
        });
    }



}
