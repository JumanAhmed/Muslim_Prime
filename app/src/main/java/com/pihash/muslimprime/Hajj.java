package com.pihash.muslimprime;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.pihash.ripple.RippleView;

public class Hajj extends AppCompatActivity {
    RippleView rippleView1;
    RippleView rippleView2;
    RippleView rippleView3;
    ImageButton but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hajj);

        rippleView3 = (RippleView) findViewById(R.id.sa3);
        rippleView2 = (RippleView) findViewById(R.id.sa2);
        rippleView1 = (RippleView) findViewById(R.id.sa1);
        but1=(ImageButton)findViewById(R.id.icon);

        rippleView1.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(Hajj.this, Ramadan.class);
                startActivity(i1);
            }
        });
        rippleView2.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(Hajj.this, Dua.class);
                startActivity(i1);
            }
        });
        rippleView3.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(Hajj.this, R.style.AppCompatAlertDialogStyle);


                builder.setTitle("নবী সঃ এর দেশে সফর");
                builder.setMessage("(১)হজ্জের শেষে নবী সঃ দেশে সফর করবেন অর্থাৎ মদীনায়" + "\n" + "" + "\n" + "(২)সময় থাকলে হজ্জের পূর্বেও করা যায় ।" + "\n" + "" + "\n" + "(৩)মসজিদে নব্বীতে গিয়ে রিয়াদুল জান্নায় গিয়ে দু রাকাত নামায পড়বে।" + "\n" + "" + "\n" + "(৪)রাসুল সঃ বলেছেন রিয়াদুল জান্নাহ বেহেস্তের একটি অংশ। এখানে দোয়া কবুল হয়।" + "\n" + "" + "\n" + "(৫)এর পর সতর্কতার সাথে রওজায় গিয়ে রসুলুল্লাহ সঃ কে সালাম দিবে।" + "\n" + "" + "\n" + "(৬)আসসালামু আলাইকা ইয়া রাসুলুল্লাহ।" + "\n" + "" + "\n" + "(৭)আসসালামু আলাইকা ইয়া খায়রা খালকি আল্লাহ।" + "\n" + "" + "\n" + "(৮)আসসালামু আলাইকা ইয়া খালিল আল্লাহ।" + "\n" + "" + "\n" + "(৯)আসসালতু আসসালামু আলাইকা ইয়া নাবী আল্লাহ।" + "\n" + "" + "\n" + "(১০)আসসালাতু আসসালামু আলাইকা ইয়া হাবিব আল্লাহ।" + "\n" + "" + "\n" + "(১১)আসসালাতু আসসালামু আলাইকা ইয়া রাহমাতুলিল আলামিন ।" + "\n" + "" + "\n" + "(১২)আসসালাতু আসসালামু আলাইকা ইয়া আশরাফুল আম্বিয়া ।" + "\n" + "" + "\n" + "(১৩)আসসালাতু আসসালামু আলাইকা ইয়া খাতামুন নাবিয়ান  ।" + "\n" + "" + "\n" + "(১৪)আসসালাতু আসসালামু আলাইকা ইয়া সাইয়েদুল মুরসালীন ।" + "\n" + "" + "\n" + "(১৫)আসসালাতু আসসালামু আলাইকা ইয়া ইমামুল মুরসালীন ।" + "\n" + "" + "\n" + "(১৬)এই পন্থায় মহব্বতের সাথে বিভিন্নভাবে নবী সঃ কে সালাম দিবেন ।" + "\n" + "" + "\n" + "(১৭)নিজের পক্ষ থেকে সালাম পেশ করার পর ।" + "\n" + "" + "\n" + "(১৮)বাবা মা ভাই বোন সন্তান ও আত্মীয় স্বজন ও বন্দু বান্দবদের পক্ষ থেকে ।" + "\n" + "" + "\n" + "(১৯)কেউ সালাম পেশ করতে বললে তার পক্ষ থেকে ।" + "\n" + "" + "\n" + "(২০)আবু বক্কর সিদ্দিক রা প্রতি সালাম পেশ করে তার দু কদম ডানে ওমর রা প্রতি।" + "\n" + "" + "\n" + "(২১)মদীনায় অবস্থান কালে জান্নাতুল বাকী জিয়ারত করবেন ।" + "\n" + "" + "\n" + "(২২)মসজিদে কুবা জিয়ারত করবেন ও দুই রাকাত নামায পড়বে ।" + "\n" + "" + "\n" + "(২৩)রসুলুল্লাহ সঃ বলেছেন মসজিদে কুবার নামাজ ওমরার সমতুল্য ।" + "\n" + "" + "\n" + "(২৪)মসজিদে কিব্লাতান জিয়ারত করবেন ও নফল নামায পড়বে ।" + "\n" + "" + "\n" + "(২৫)উহুদ ময়দান জিয়ারত করবেন ।" + "\n" + "" + "\n" + "(২৬)সময় করে মক্কা ও মদীনার অন্যান্য ঐতিহাসিক জায়গাগুলো জিয়ারত করবেন ।এর জন্য ইতিহাস সম্পর্কে মোটামুটি ধারনা থাকা উত্তম ।");
                builder.setCancelable(false);


                builder.setPositiveButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });
                builder.show();



            }
        });


        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}