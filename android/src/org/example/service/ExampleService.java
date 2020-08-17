package org.example.service;

import org.qtproject.qt5.android.bindings.QtService;
import android.content.Context;
import android.content.Intent;
import android.app.Notification;
import android.app.PendingIntent;
import android.os.IBinder;
import android.util.Log;
import org.qtproject.qt5.android.QtNative;

public class ExampleService extends QtService {
    public static void startService(Context ctx) {
        ctx.startService(new Intent(ctx, ExampleService.class));
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intent notificationIntent = new Intent(this, ExampleService.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,
            0,
            notificationIntent,
            0);
        Notification notification = new Notification.Builder(this)
                .setContentTitle("Example Service")
                .setContentText("Example Foreground Service")
                .setSmallIcon(R.drawable.done24px)
                .setContentIntent(pendingIntent)
                .build();
        Log.d("Example", "Starting as foreground service");
        // id - random number. doesn't really matter
        startForeground(1797, notification);
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
