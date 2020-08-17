package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    NotificationManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

    }

    public void getnotify(View view)
    {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            NotificationChannel channel=new
                    NotificationChannel("channel_id","android_channel",NotificationManager.IMPORTANCE_DEFAULT);

            manager.createNotificationChannel(channel);

        }


        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"channel_id");

        builder.setContentTitle("APSSDC");

        builder.setContentText("APSSDC ANDROID WORKSHOP");

        builder.setSmallIcon(R.mipmap.ic_launcher_round);

        builder.setAutoCancel(true);

        manager.notify(1,builder.build());






    }
}
