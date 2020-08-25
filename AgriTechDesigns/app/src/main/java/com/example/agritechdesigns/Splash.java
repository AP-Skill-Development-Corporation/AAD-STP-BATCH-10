package com.example.agritechdesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Splash extends AppCompatActivity {

    private int progress_Status=0;
    private Handler handler=new Handler();

    CircleImageView circleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        circleImageView=findViewById(R.id.profileImage);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        final LinearLayout app_menu=(LinearLayout) findViewById(R.id.app_menu);
        final TextView percentage=findViewById(R.id.textView);
        final ProgressBar progressBar=findViewById(R.id.progressBar2);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(progress_Status<100){
                    progress_Status+=1;
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progress_Status);
                            percentage.setText(progress_Status+"%");
                        }
                    });
                }

            }
        }).start();
    }
}