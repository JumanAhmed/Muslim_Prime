package com.pihash.muslimprime;


import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {

	private static final String TAG = "Namaz";
	Intent intent;
	PendingIntent pendingIntent;
	NotificationManager notificationManager;
    String data;

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i(TAG, "BroadcastReceiver has received alarm intent.");
		Intent service1 = new Intent(context, AlarmService.class);
		context.startService(service1);
	}




}
