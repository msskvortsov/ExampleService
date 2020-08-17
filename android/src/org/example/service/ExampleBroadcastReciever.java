package org.example.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import org.example.service.ExampleService;

public class ExampleBroadcastReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Example", "BroadcastReciever.onReceive: starting service");
        Intent serviceIntent = new Intent(context.getApplicationContext(), ExampleService.class);
        context.startService(serviceIntent);
    }
}
