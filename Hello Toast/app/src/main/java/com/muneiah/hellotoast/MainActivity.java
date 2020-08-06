package com.muneiah.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView data;
Button c_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data=findViewById(R.id.tv);
        c_button=findViewById(R.id.countBtn);

    }

    public void showToastMessage(View view) {
        //Toast.makeText(this,"welcome to app development",Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Welcome to app development", Toast.LENGTH_SHORT).show();
    }
}
