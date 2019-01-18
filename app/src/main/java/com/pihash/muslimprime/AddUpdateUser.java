package com.pihash.muslimprime;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;

public class AddUpdateUser extends AppCompatActivity {
    String ID;
    EditText edit1;
    EditText edit2;
    EditText edit3;
    EditText edit4;
    EditText edit5;
    EditText edit6;
    Button add_save_btn, add_view_all, update_btn, update_view_all;
    LinearLayout add_view, update_view,lay1,lay2,lay3,lay4,lay5,lay6;
    int USER_ID;
    DatabaseHandler dbHandler = new DatabaseHandler(this);
    Intent intent = getIntent();
    double num1 = 0;
    double num2 = 0;
    double num3 = 0;
    double num4 = 0;
    double result = 0;
    double gram = 0;
    double mj;
    String total="0";
    String e1="null";
    String e2="null";
    String e3="null";
    String e4="null";
    String e5="null";
    String e6="null";
    String e7="null";
    String e8="null";
    String e9="null";
    String e10="null";
    String e11="null";
    String e12="null";
    String sub;
    String currentDateTimeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_update_user);
        setTitle("Create Contact");
        // set screen
        Set_Add_Update_Screen();
        currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());

        // set visibility of view as per calling activity
        String called_from = getIntent().getStringExtra("called");
        ID =  getIntent().getStringExtra("Id");

        if (called_from.equalsIgnoreCase("add")) {
            add_view.setVisibility(View.VISIBLE);
            update_view.setVisibility(View.GONE);
            if(ID!= null && ID.equalsIgnoreCase("নগদ টাকা")){
                lay1.setVisibility(View.GONE);
                lay2.setVisibility(View.GONE);
                lay3.setVisibility(View.GONE);
                lay4.setVisibility(View.GONE);
                lay6.setVisibility(View.GONE);
                lay5.setVisibility(View.VISIBLE);

            }else{
                lay1.setVisibility(View.VISIBLE);
                lay2.setVisibility(View.VISIBLE);
                lay3.setVisibility(View.VISIBLE);
                lay4.setVisibility(View.VISIBLE);
                lay6.setVisibility(View.GONE);
                lay5.setVisibility(View.GONE);
            }
        }
        else {
            update_view.setVisibility(View.VISIBLE);
            add_view.setVisibility(View.GONE);
            USER_ID = Integer.parseInt(getIntent().getStringExtra("USER_ID"));
            datanamaz c = dbHandler.Get_Contact(USER_ID);
            sub=c.getName();
            if(sub!=null && sub.equalsIgnoreCase("নগদ টাকা")){
                lay1.setVisibility(View.GONE);
                lay2.setVisibility(View.GONE);
                lay3.setVisibility(View.GONE);
                lay4.setVisibility(View.GONE);
                lay6.setVisibility(View.GONE);
                lay5.setVisibility(View.VISIBLE);
            }else{
                lay1.setVisibility(View.VISIBLE);
                lay2.setVisibility(View.VISIBLE);
                lay3.setVisibility(View.VISIBLE);
                lay4.setVisibility(View.VISIBLE);
                lay6.setVisibility(View.GONE);
                lay5.setVisibility(View.GONE);
            }

            if(sub.equals("সোনা")){
                edit2.setText(c.getemail1());
                edit3.setText(c.getemail2());
                edit4.setText(c.getemail3());
            }else if(sub.equals("রুপা")){
                edit2.setText(c.getemail4());
                edit3.setText(c.getemail5());
                edit4.setText(c.getemail6());
            }else if(sub.equals("নগদ টাকা")){
                edit5.setText(c.getemail7());
            }


            // dbHandler.close();


            }


        add_save_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (ID.equals("সোনা") || ID.equals("রুপা")) {
                    Gold_Sil();
                } else if ("নগদ টাকা".equalsIgnoreCase(ID)) {
                    cash();

                }
            }
        });

        update_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if (sub.equals("সোনা") || sub.equals("রুপা")) {
                    UPGold_Sil();
                } else if ("নগদ টাকা".equalsIgnoreCase(sub)) {
                    UPcash();

                }



            }
        });
        update_view_all.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent view_user = new Intent(AddUpdateUser.this,
                        Zakat.class);
                view_user.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                        | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(view_user);
                finish();
            }
        });

        add_view_all.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent view_user = new Intent(AddUpdateUser.this,
                        Zakat.class);
                view_user.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                        | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(view_user);
                finish();
            }
        });

    }

    private void UPcash() {


        if(!TextUtils.isEmpty(edit5.getText().toString())){
            e7=edit5.getText().toString();
            double t= Double.parseDouble(e7);
            double r=(t*2.5)/100;
            r=Math.ceil(r * 100);
            r=r/100;
            DecimalFormat myFormatter = new DecimalFormat("############");
            total =myFormatter.format(r);
            e8=currentDateTimeString;
            dbHandler.Update_Contact(new datanamaz(USER_ID,sub, total, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12));
            Reset_Textt();

            android.support.v7.app.AlertDialog.Builder builder =
                    new android.support.v7.app.AlertDialog.Builder(AddUpdateUser.this, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("যাকাত");
            builder.setMessage("মোট যাকাতের পরিমাণঃ" +" "+translate(total)+ "টাকা");
            builder.setCancelable(false);
            builder.setCancelable(false);
            builder.setNegativeButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Intent view_user = new Intent(AddUpdateUser.this,
                            Zakat.class);
                    view_user.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                            | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(view_user);
                    finish();
                }
            });


            builder.show();
        }else{
            android.support.v7.app.AlertDialog.Builder builder =
                    new android.support.v7.app.AlertDialog.Builder(AddUpdateUser.this, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("বার্তা");
            builder.setMessage("আপনি টাকার পরিমাণ লিখেননি।");
            builder.setCancelable(false);
            builder.setCancelable(false);
            builder.setNegativeButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });


            builder.show();
        }
    }

    private void UPGold_Sil() {

        if(!TextUtils.isEmpty(edit1.getText().toString())) {
            if (edit2.getText().toString().equals("")) {
                edit2.setText("0");
            }
            if (edit3.getText().toString().equals("")) {
                edit3.setText("0");
            }
            if (edit4.getText().toString().equals("")) {
                edit4.setText("0");
            }

            num1 = Double.parseDouble(edit1.getText().toString());
            num2 = Double.parseDouble(edit2.getText().toString());
            num3 = Double.parseDouble(edit3.getText().toString());
            num4 = Double.parseDouble(edit4.getText().toString());

            result = ((num1/96)*((num2*96)+(num3*6)+(num4)))+mj;
            gram=((num2*96)+(num3*6)+(num4))*(0.1215);
            result=Math.ceil(result * 100);
            result=result/100;
            double zak=(result*2.5)/100;
            zak=Math.ceil(zak * 100);
            zak=zak/100;
            total = String.valueOf(zak);

            if(sub.equals("সোনা")&&!total.equals("")){
                e1=edit2.getText().toString();
                e2=edit3.getText().toString();
                e3=edit4.getText().toString();
                e8=currentDateTimeString;
                dbHandler.Update_Contact(new datanamaz(USER_ID,sub,total,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12));
                dbHandler.close();
                Reset_Text();
            }else if(sub.equals("রুপা")&&!total.equals("")){
                e4=edit2.getText().toString();
                e5=edit3.getText().toString();
                e6=edit4.getText().toString();
                e8=currentDateTimeString;
                dbHandler.Update_Contact(new datanamaz(USER_ID,sub,total,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12));
                dbHandler.close();
                Reset_Text();
            }


            //Toast.makeText(FristActivity.this, "মোট সোনার দাম : " + result + "টাকা", Toast.LENGTH_SHORT).show();
            android.support.v7.app.AlertDialog.Builder builder =
                    new android.support.v7.app.AlertDialog.Builder(AddUpdateUser.this, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("যাকাত");
            builder.setMessage("#" + translate(String.valueOf(num2)) + " " + "ভরি" + "," + translate(String.valueOf(num3)) + " " + "আনা" + "," + translate(String.valueOf(num4)) + " " + "রতি " + "\n" + "#" + translate(String.valueOf(gram)) + " " + "গ্রাম" + "\n" + "মোট যাকাতের পরিমাণঃ" + " " + translate(String.valueOf(total)) + "টাকা");
                    builder.setCancelable(false);
            builder.setCancelable(false);
            builder.setNegativeButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Intent view_user = new Intent(AddUpdateUser.this,
                            Zakat.class);
                    view_user.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                            | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(view_user);
                    finish();
                }
            });


            builder.show();

        }else{
            android.support.v7.app.AlertDialog.Builder builder =
                    new android.support.v7.app.AlertDialog.Builder(AddUpdateUser.this, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("বার্তা");
            builder.setMessage("আপনি ভরি প্রতি দাম লিখেননি");
            builder.setCancelable(false);
            builder.setCancelable(false);
            builder.setNegativeButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int which) {
                    dialog.dismiss();
                }
            });


            builder.show();
        }
    }

    private void cash() {
        if(!TextUtils.isEmpty(edit5.getText().toString())) {
            double t= Double.parseDouble(edit5.getText().toString());
            double r=(t*2.5)/100;
            r=Math.ceil(r * 100);
            r=r/100;
            DecimalFormat myFormatter = new DecimalFormat("############");
            e7=edit5.getText().toString();
            total =myFormatter.format(r);
            e8=currentDateTimeString;
            dbHandler.Add_Contact(new datanamaz(ID, total, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12));
            Reset_Textt();

            android.support.v7.app.AlertDialog.Builder builder =
                    new android.support.v7.app.AlertDialog.Builder(AddUpdateUser.this, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("যাকাত");
            builder.setMessage("মোট যাকাতের পরিমাণঃ" + " "+translate(total)+ "টাকা");
            builder.setCancelable(false);
            builder.setCancelable(false);
            builder.setNegativeButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Intent view_user = new Intent(AddUpdateUser.this,
                            Zakat.class);
                    view_user.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                            | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(view_user);
                    finish();
                }
            });

            builder.show();

        }else{

            android.support.v7.app.AlertDialog.Builder builder =
                    new android.support.v7.app.AlertDialog.Builder(AddUpdateUser.this, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("বার্তা");
            builder.setMessage("আপনি টাকার পরিমাণ লিখেননি।");
            builder.setCancelable(false);
            builder.setCancelable(false);
            builder.setNegativeButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });


            builder.show();

        }
    }

    private void Gold_Sil() {

        if (!TextUtils.isEmpty(edit1.getText().toString())) {
            if (edit2.getText().toString().equals("")) {
                edit2.setText("0");
            }
            if (edit3.getText().toString().equals("")) {
                edit3.setText("0");
            }
            if (edit4.getText().toString().equals("")) {
                edit4.setText("0");
            }

            num1 = Double.parseDouble(edit1.getText().toString());
            num2 = Double.parseDouble(edit2.getText().toString());
            num3 = Double.parseDouble(edit3.getText().toString());
            num4 = Double.parseDouble(edit4.getText().toString());

            result = ((num1/96)*((num2*96)+(num3*6)+(num4)))+mj;
            gram=((num2*96)+(num3*6)+(num4))*(0.1215);
            result=Math.ceil(result * 100);
            result=result/100;
            double zak=(result*2.5)/100;
            zak=Math.ceil(zak * 100);
            zak=zak/100;
            total = String.valueOf(zak);

            if (ID.equals("সোনা") && !total.equals("")) {
                e1 = edit2.getText().toString();
                e2 = edit3.getText().toString();
                e3 = edit4.getText().toString();
                e8=currentDateTimeString;
                dbHandler.Add_Contact(new datanamaz(ID, total, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12));
                Reset_Text();
            } else if (ID.equals("রুপা") && !total.equals("")) {
                e4 = edit2.getText().toString();
                e5 = edit3.getText().toString();
                e6 = edit4.getText().toString();
                e8=currentDateTimeString;
                dbHandler.Add_Contact(new datanamaz(ID, total, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12));
                Reset_Text();
            }


            //Toast.makeText(FristActivity.this, "মোট সোনার দাম : " + result + "টাকা", Toast.LENGTH_SHORT).show();
            android.support.v7.app.AlertDialog.Builder builder =
                    new android.support.v7.app.AlertDialog.Builder(AddUpdateUser.this, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("যাকাত");
            builder.setMessage("#" + translate(String.valueOf(num2)) + " " + "ভরি" + "," + translate(String.valueOf(num3)) + " " + "আনা" + "," + translate(String.valueOf(num4)) + " " + "রতি " + "\n" + "#" + translate(String.valueOf(gram)) + " " + "গ্রাম" + "\n" + "মোট যাকাতের পরিমাণঃ" + " " + translate(String.valueOf(total)) + "টাকা");
            builder.setCancelable(false);
            builder.setCancelable(false);
            builder.setNegativeButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Intent view_user = new Intent(AddUpdateUser.this,
                            Zakat.class);
                    view_user.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                            | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(view_user);
                    finish();
                }
            });
            builder.show();



        } else {
            android.support.v7.app.AlertDialog.Builder builder =
                    new android.support.v7.app.AlertDialog.Builder(AddUpdateUser.this, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("বার্তা");
            builder.setMessage("আপনি ভরি প্রতি দাম লিখেননি");
            builder.setCancelable(false);
            builder.setCancelable(false);
            builder.setNegativeButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });


            builder.show();
        }

    }

    public void Set_Add_Update_Screen() {

        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        edit3 = (EditText) findViewById(R.id.edit3);
        edit4 = (EditText) findViewById(R.id.edit4);
        edit5 = (EditText) findViewById(R.id.edit5);

        add_save_btn = (Button) findViewById(R.id.add_save_btn);
        update_btn = (Button) findViewById(R.id.update_btn);
        add_view_all = (Button) findViewById(R.id.add_view_all);
        update_view_all = (Button) findViewById(R.id.update_view_all);

        add_view = (LinearLayout) findViewById(R.id.add_view);
        update_view = (LinearLayout) findViewById(R.id.update_view);

        lay1 = (LinearLayout) findViewById(R.id.lay1);
        lay2 = (LinearLayout) findViewById(R.id.lay2);
        lay3 = (LinearLayout) findViewById(R.id.lay3);
        lay4 = (LinearLayout) findViewById(R.id.lay4);
        lay5 = (LinearLayout) findViewById(R.id.lay5);

        add_view.setVisibility(View.GONE);
        update_view.setVisibility(View.GONE);

        lay1.setVisibility(View.GONE);
        lay2.setVisibility(View.GONE);
        lay3.setVisibility(View.GONE);
        lay4.setVisibility(View.GONE);
        lay5.setVisibility(View.GONE);


    }

    public void Reset_Text() {
        edit1.getText().clear();
        edit2.getText().clear();
        edit3.getText().clear();
        edit4.getText().clear();

    }


    public void Reset_Textt() {

        edit5.getText().clear();
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
