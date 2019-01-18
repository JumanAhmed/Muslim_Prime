package com.pihash.muslimprime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.pihash.ripple.RippleView;

import java.util.Calendar;


public class AboutFragment extends Fragment {

    ImageView l1;
    RippleView rippleView1;
    RippleView rippleView2;
    RippleView rippleView3;
    RippleView rippleView4;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);

       ;
        l1=(ImageView)rootView.findViewById(R.id.imageView1);
        rippleView1=(RippleView)rootView.findViewById(R.id.rect1);
        rippleView2=(RippleView)rootView.findViewById(R.id.rect2);
        rippleView3=(RippleView)rootView.findViewById(R.id.rect3);
        rippleView4=(RippleView)rootView.findViewById(R.id.rect4);
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 6){
            l1.setBackgroundResource(R.drawable.ln);
        }else if(timeOfDay >= 6 && timeOfDay < 18){
            l1.setBackgroundResource(R.drawable.day);
        }else if(timeOfDay >= 18 && timeOfDay < 20){
            l1.setBackgroundResource(R.drawable.eve);
        }else if(timeOfDay >= 20 && timeOfDay < 24){
            l1.setBackgroundResource(R.drawable.night1);
        }


        rippleView1.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(getActivity(), Namaz.class);
                startActivity(i1);


            }
        });
        rippleView2.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(getActivity(), Sylhet.class);
                startActivity(i1);


            }
        });
        rippleView3.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(getActivity(), Hajj.class);
                startActivity(i1);


            }
        });
        rippleView4.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent i1 = new Intent(getActivity(), Zakat.class);
                startActivity(i1);


            }
        });


        return rootView;
    }

}
