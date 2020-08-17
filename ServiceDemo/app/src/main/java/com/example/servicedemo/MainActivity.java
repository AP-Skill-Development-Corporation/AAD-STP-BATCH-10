package com.example.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startservicce(View view)
    {

        Intent start=new Intent(this,MyService.class);

        startService(start);
    }

    public void stopservice(View view)
    {
        Intent stop=new Intent(this,MyService.class);
        stopService(stop);

    }
}
