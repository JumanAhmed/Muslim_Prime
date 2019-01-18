package com.pihash.muslimprime;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.pihash.menu.ContextMenuDialogFragment;
import com.pihash.menu.MenuObject;
import com.pihash.menu.MenuParams;
import com.pihash.menu.interfaces.OnMenuItemClickListener;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FrActivity extends AppCompatActivity implements OnMenuItemClickListener {

    private FragmentManager fragmentManager;
    private ContextMenuDialogFragment mMenuDialogFragment;

    private static final String TAG = "BANANEALARM";
    public AlarmManager alarmManager;
    Intent alarmIntent;
    PendingIntent pendingIntent;
    int mNotificationCount;
    static final String NOTIFICATION_COUNT = "notificationCount";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            mNotificationCount = savedInstanceState.getInt(NOTIFICATION_COUNT);
        }
        setContentView(R.layout.activity_fr);
        fragmentManager = getSupportFragmentManager();
        initToolbar();
        initMenuFragment();
        addFragment(new AboutFragment(), true, R.id.container);
        setAlarm();
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
    }


    @Override
    protected void onNewIntent( Intent intent ) {
        Log.i(TAG, "onNewIntent(), intent = " + intent);
        if (intent.getExtras() != null)
        {
            Log.i(TAG, "in onNewIntent = " + intent.getExtras().getString("test"));
        }
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void setAlarm(){
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmIntent = new Intent(FrActivity.this, AlarmReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(FrActivity.this, 0, alarmIntent, 0);
        Calendar alarmStartTime = Calendar.getInstance();
        int sec=alarmStartTime.get(Calendar.SECOND);
        alarmStartTime.set(Calendar.MINUTE, 1);
        alarmStartTime.set(Calendar.SECOND, 0);
        alarmStartTime.set(Calendar.MILLISECOND, 0);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, alarmStartTime.getTimeInMillis(), 1000 * 60, pendingIntent);
    }



    @Override
    protected void onStart(){
        super.onStart();

    }

    public void cancelNotifications(){
        Log.i(TAG, "All notifications cancelled.");
    }



    @Override
    protected void onResume(){
        super.onResume();
        if(this.getIntent().getExtras() != null){
            Log.i(TAG,"extras: " + this.getIntent().getExtras());


        }
    }


    private void initMenuFragment() {
        MenuParams menuParams = new MenuParams();
        menuParams.setActionBarSize((int) getResources().getDimension(R.dimen.tool_bar_height));
        menuParams.setMenuObjects(getMenuObjects());
        menuParams.setClosableOutside(false);
        mMenuDialogFragment = ContextMenuDialogFragment.newInstance(menuParams);
        mMenuDialogFragment.setItemClickListener(this);

    }

    private List<MenuObject> getMenuObjects() {
        // You can use any [resource, bitmap, drawable, color] as image:
        // item.setResource(...)
        // item.setBitmap(...)
        // item.setDrawable(...)
        // item.setColor(...)
        // You can set image ScaleType:
        // item.setScaleType(ScaleType.FIT_XY)
        // You can use any [resource, drawable, color] as background:
        // item.setBgResource(...)
        // item.setBgDrawable(...)
        // item.setBgColor(...)
        // You can use any [color] as text color:
        // item.setTextColor(...)
        // You can set any [color] as divider color:
        // item.setDividerColor(...)

        List<MenuObject> menuObjects = new ArrayList<>();

        MenuObject close = new MenuObject();
        close.setResource(R.drawable.icn_close);

        MenuObject send = new MenuObject("About");
        send.setResource(R.drawable.icn_1);


        menuObjects.add(close);
        menuObjects.add(send);

        return menuObjects;
    }

    private void initToolbar() {
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView mToolBarTextView = (TextView) findViewById(R.id.text_view_toolbar_title);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mToolBarTextView.setText("Muslim Prime");
    }

    protected void addFragment(Fragment fragment, boolean addToBackStack, int containerId) {
        invalidateOptionsMenu();
        String backStackName = fragment.getClass().getName();
        boolean fragmentPopped = fragmentManager.popBackStackImmediate(backStackName, 0);
        if (!fragmentPopped) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(containerId, fragment, backStackName)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            if (addToBackStack)
                transaction.addToBackStack(backStackName);
            transaction.commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_menu:
                if (fragmentManager.findFragmentByTag(ContextMenuDialogFragment.TAG) == null) {
                    mMenuDialogFragment.show(fragmentManager, ContextMenuDialogFragment.TAG);
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (mMenuDialogFragment != null && mMenuDialogFragment.isAdded()) {
            mMenuDialogFragment.dismiss();
        } else{
            finish();
        }
    }

    @Override
    public void onMenuItemClick(View clickedView, int position) {
        if(position==1){
            Intent i=new Intent(FrActivity.this,AbouActivity.class);
            startActivity(i);

        }
    }




}
