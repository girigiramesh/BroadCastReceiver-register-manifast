package com.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Ramesh on 9/12/16.
 */
public class PowerConnected extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Yes! PowerConnected Changed", Toast.LENGTH_LONG).show();

    }
}
