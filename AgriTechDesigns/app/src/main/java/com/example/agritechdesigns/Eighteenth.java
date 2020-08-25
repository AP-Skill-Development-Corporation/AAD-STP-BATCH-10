package com.example.agritechdesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Eighteenth extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteenth);
        imageView=findViewById(R.id.image);
        Glide.with(getApplicationContext()).load(R.drawable.car).into(imageView);

    }
}
