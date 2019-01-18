package com.pihash.muslimprime;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.pihash.flo.FloatingActionButton;
import com.pihash.flo.FloatingActionMenu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;



public class Zakat extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView Contact_listview;
    ArrayList<datanamaz> contact_data = new ArrayList<datanamaz>();
    Contact_Adapter cAdapter;
    DatabaseHandler db;
    private List<FloatingActionMenu> menus = new ArrayList<>();
    String name;
    TextView tot;
    double total;
    double total1;
    String totvalue;
    private FloatingActionButton fab1;
    private FloatingActionButton fab2;
    private FloatingActionButton fab3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat);
        try {
            Contact_listview = (ListView) findViewById(R.id.list);
            Contact_listview.setItemsCanFocus(false);
            Contact_listview.setDivider(null);

        } catch (Exception e) {
            // TODO: handle exception
            Log.e("some error", "" + e);
        }
        tot=(TextView)findViewById(R.id.tot);

        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);


        fab1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Toast.makeText(Zakat.this,name, Toast.LENGTH_SHORT).show();
                Intent add_user = new Intent(Zakat.this, AddUpdateUser.class);
                add_user.putExtra("called", "add");
                add_user.putExtra("Id", "সোনা");
                add_user.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(add_user);


            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent add_user = new Intent(Zakat.this, AddUpdateUser.class);
                add_user.putExtra("called", "add");
                add_user.putExtra("Id", "রুপা");
                add_user.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(add_user);


            }
        });


        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent add_user = new Intent(Zakat.this, AddUpdateUser.class);
                add_user.putExtra("called", "add");
                add_user.putExtra("Id", "নগদ টাকা");
                add_user.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(add_user);


            }
        });

    }


    public void Set_Referash_Data() {
        contact_data.clear();
        db = new DatabaseHandler(this);
        ArrayList<datanamaz> contact_array_from_db = db.Get_Contacts();

        for (int i = 0; i < contact_array_from_db.size(); i++) {
            int tidno = contact_array_from_db.get(i).getID();
            name = contact_array_from_db.get(i).getName();
            String mobile = contact_array_from_db.get(i).getPhoneNumber();
            String time= contact_array_from_db.get(i).getemail8();
            total=Double.parseDouble(contact_array_from_db.get(i).getPhoneNumber());
            total1=(total1+total);
            datanamaz cnt = new datanamaz();
            cnt.setID(tidno);
            cnt.setName(name);
            cnt.setPhoneNumber(translate(mobile)+"টাকা");
            cnt.setemail8(translate(time));
            contact_data.add(cnt);
        }

        DecimalFormat myFormatter = new DecimalFormat("############");
        totvalue=myFormatter.format(total1);

        tot.setText(translate(totvalue)+"টাকা");

        db.close();
        cAdapter = new Contact_Adapter(Zakat.this, R.layout.listview_row_apos, contact_data);
        Contact_listview.setAdapter(cAdapter);
        cAdapter.notifyDataSetChanged();

    }

    public void Show_Toast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Set_Referash_Data();

    }

    public class Contact_Adapter extends ArrayAdapter<datanamaz> {
        Activity activity;
        int layoutResourceId;
        datanamaz user;
        ArrayList<datanamaz> data = new ArrayList<datanamaz>();

        public Contact_Adapter(Activity act, int layoutResourceId,
                               ArrayList<datanamaz> data) {
            super(act, layoutResourceId, data);
            this.layoutResourceId = layoutResourceId;
            this.activity = act;
            this.data = data;
            notifyDataSetChanged();
        }

        public String getPhoneumner(int arg2) {
            return data.get(arg2).getPhoneNumber();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            UserHolder holder = null;

            if (row == null) {
                LayoutInflater inflater = LayoutInflater.from(activity);
                row = inflater.inflate(layoutResourceId, parent, false);
                holder = new UserHolder();
                holder.name = (TextView) row.findViewById(R.id.user_name_txt);
                holder.number = (TextView) row.findViewById(R.id.user_mob_txt);
                holder.time = (TextView) row.findViewById(R.id.user_time);
                //holder.edit = (Button) row.findViewById(R.id.btn_update);
               // holder.delete = (Button) row.findViewById(R.id.btn_delete);
                holder.imbut=(ImageButton)row.findViewById(R.id.imagebut);
                row.setTag(holder);
            } else {
                holder = (UserHolder) row.getTag();
            }
            user = data.get(position);
            holder.imbut.setTag(user.getID());
            //holder.edit.setTag(user.getID());
            //holder.delete.setTag(user.getID());
            holder.name.setText(user.getName());
            holder.number.setText(user.getPhoneNumber());
            holder.time.setText(user.getemail8());



            holder.imbut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View v) {

                    Context wrapper = new ContextThemeWrapper(getBaseContext(), R.style.AppTheme);
                    PopupMenu popup = new PopupMenu(wrapper, v);

                    /** Adding menu items to the popumenu */
                    popup.getMenuInflater().inflate(R.menu.main, popup.getMenu());

                    /** Defining menu item click listener for the popup menu */
                    popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            int id = item.getItemId();
                            switch (id) {
                                case R.id.edit:
                                    Intent update_user = new Intent(activity,
                                            AddUpdateUser.class);
                                    update_user.putExtra("called", "update");
                                    update_user.putExtra("USER_ID", v.getTag().toString());
                                    activity.startActivity(update_user);
                                    break;

                                case R.id.del:
                                    AlertDialog.Builder adb = new AlertDialog.Builder(activity);
                                    adb.setTitle("Delete?");
                                    adb.setMessage("Are you sure you want to delete ");
                                    final int user_id = Integer.parseInt(v.getTag().toString());
                                    adb.setNegativeButton("Cancel", null);
                                    adb.setPositiveButton("Ok",
                                            new AlertDialog.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog,
                                                                    int which) {
                                                    // MyDataObject.remove(positionToRemove);
                                                    DatabaseHandler dBHandler = new DatabaseHandler(
                                                            activity.getApplicationContext());
                                                    dBHandler.Delete_Contact(user_id);
                                                    Zakat.this.onResume();
                                                    finish();
                                                    startActivity(getIntent());


                                                }
                                            });
                                    adb.show();
                                    break;

                            }
                            return true;
                        }
                    });

                    /** Showing the popup menu */
                    popup.show();
                }
            });

/*
            holder.edit.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Log.i("Edit Button Clicked", "**********");

                    Intent update_user = new Intent(activity,
                            AddUpdateUser.class);
                    update_user.putExtra("called", "update");
                    update_user.putExtra("USER_ID", v.getTag().toString());
                    activity.startActivity(update_user);

                }
            });
            holder.delete.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(final View v) {
                    // TODO Auto-generated method stub

                    // show a message while loader is loading

                    AlertDialog.Builder adb = new AlertDialog.Builder(activity);
                    adb.setTitle("Delete?");
                    adb.setMessage("Are you sure you want to delete ");
                    final int user_id = Integer.parseInt(v.getTag().toString());
                    adb.setNegativeButton("Cancel", null);
                    adb.setPositiveButton("Ok",
                            new AlertDialog.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog,
                                                    int which) {
                                    // MyDataObject.remove(positionToRemove);
                                    DatabaseHandler dBHandler = new DatabaseHandler(
                                            activity.getApplicationContext());
                                    dBHandler.Delete_Contact(user_id);
                                    Zakat.this.onResume();
                                    finish();
                                    startActivity(getIntent());


                                }
                            });
                    adb.show();
                }

            });
            */

            return row;

        }

        class UserHolder {
            TextView name;
            TextView number;
            TextView time;
            Button edit;
            Button delete;
            ImageButton imbut;

        }

    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        // TODO Auto-generated method stub

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
