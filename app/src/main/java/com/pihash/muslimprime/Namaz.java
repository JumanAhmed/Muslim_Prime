package com.pihash.muslimprime;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.pihash.ripple.RippleView;

public class Namaz extends AppCompatActivity {
    RippleView rippleView1;
    RippleView rippleView2;
    RippleView rippleView3;
    RippleView rippleView4;
    RippleView rippleView5;
    RippleView rippleView6;
    RippleView rippleView7;
    RippleView rippleView8;
    ImageButton but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz);

        rippleView1=(RippleView)findViewById(R.id.sa1);
        rippleView2=(RippleView)findViewById(R.id.sa2);
        rippleView3=(RippleView)findViewById(R.id.sa3);
        rippleView4=(RippleView)findViewById(R.id.sa4);
        rippleView5=(RippleView)findViewById(R.id.sa5);
        rippleView6=(RippleView)findViewById(R.id.sa6);
        rippleView7=(RippleView)findViewById(R.id.sa7);
        rippleView8=(RippleView)findViewById(R.id.sa8);
        but1=(ImageButton)findViewById(R.id.icon);

        rippleView1.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(Namaz.this, SaActivity.class);
                startActivity(i1);


            }
        });

        rippleView4.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(Namaz.this, TasbiActivity.class);
                startActivity(i1);


            }
        });

        rippleView5.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(Namaz.this, Sylhet.class);
                startActivity(i1);


            }
        });

        rippleView6.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(Namaz.this, Nishiddo.class);
                startActivity(i1);


            }
        });
        rippleView7.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(Namaz.this, R.style.AppCompatAlertDialogStyle);


                builder.setTitle("নামাজের ওয়াক্ত");
                builder.setMessage("নামাজ প্রতিদিন ৫ ওয়াক্ত" + "\n" + "১.ফযর" + "\n" + "২.যোহর" + "\n" + "৩.আসর" + "\n" + "৪.মাগরিব" + "\n" + "৫.এশা");
                builder.setCancelable(false);
                builder.setNegativeButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });


                builder.show();



            }
        });
        rippleView8.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(Namaz.this, R.style.AppCompatAlertDialogStyle);


                builder.setTitle("নামাজের রাকাত সমূহ");
                builder.setMessage("নামাজ প্রতিদিন ৫ ওয়াক্ত" + "\n" +""+"\n"+ "১.ফযর(৪ রাকাত)- সুন্নত ২ রাকাত, ফরজ ২ রাকাত" + "\n" +""+"\n"+ "২.যোহর(১২ রাকাত)-সুন্নত ৪ রাকাত, ফরজ ৪ রাকাত, সুন্নত ২ রাকাত, নফল ২ রাকাত"+ "\n" +""+"\n"+ "৩.আসর(৮ রাকাত)-সুন্নত ৪ রাকাত, ফরজ ৪ রাকাত"+ "\n" +""+"\n"+ "৪.মাগরিব(৭ রাকাত)-ফরজ ৩ রাকাত, সুন্নত ২ রাকাত,নফল ২ রাকাত"+ "\n" +""+"\n"+ "৫.এশা(১৭ রাকাত)-সুন্নত ৪ রাকাত, ফরজ ৪ রাকাত,সুন্নত ২ রাকাত, বেতের ৩ রাকাত");
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
