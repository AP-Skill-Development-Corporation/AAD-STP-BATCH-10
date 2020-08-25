package com.example.agritechdesigns;

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

    public void first1(View view) {
        Intent i=new Intent(getApplicationContext(),First.class);
        startActivity(i);
    }

    public void third1(View view) {
        Intent i1=new Intent(getApplicationContext(),Second.class);
        startActivity(i1);
    }

    public void second1(View view) {
        Intent i2=new Intent(getApplicationContext(),Third.class);
        startActivity(i2);
    }

    public void fouth1(View view)
    {
        Intent i3=new Intent(getApplicationContext(),Fourth.class);
        startActivity(i3);
    }

    public void fifth1(View view)
    {
        Intent i4=new Intent(getApplicationContext(),Fifth.class);
        startActivity(i4);
    }

    public void sixth1(View view) {
        Intent i5=new Intent(getApplicationContext(),Sixth.class);
        startActivity(i5);
    }

    public void seventh1(View view) {
        Intent i6=new Intent(getApplicationContext(),Seventh.class);
        startActivity(i6);
    }

    public void eight(View view) {
        Intent i7=new Intent(getApplicationContext(),Eight1.class);
        startActivity(i7);
    }

    public void nine(View view) {
        Intent i8=new Intent(getApplicationContext(),Nine.class);
        startActivity(i8);
    }

    public void ten(View view)
    {
        Intent i9=new Intent(getApplicationContext(),Tenth.class);
        startActivity(i9);
    }


    public void leventhone(View view)
    {
        Intent i9=new Intent(getApplicationContext(),Eleventh.class);
        startActivity(i9);
    }

    public void twelve(View view) {
        Intent i9=new Intent(getApplicationContext(),Twelth.class);
        startActivity(i9);
    }

    public void splash(View view) {
        Intent i9=new Intent(getApplicationContext(),Splash.class);
        startActivity(i9);
    }

    public void thirtheen(View view)
    {
        Intent i9=new Intent(getApplicationContext(),Thirtheen.class);
        startActivity(i9);
    }

    public void fiftheenth(View view) {
        Intent i9=new Intent(getApplicationContext(),Fifteenth.class);
        startActivity(i9);
    }

    public void sixteenth(View view) {
        Intent i9=new Intent(getApplicationContext(),Sixteenth.class);
        startActivity(i9);
    }

    public void seventeenth(View view) {
        Intent i9=new Intent(getApplicationContext(),Seventeenth.class);
        startActivity(i9);
    }

    public void eigheenth(View view) {
        Intent i9=new Intent(getApplicationContext(),Eighteenth.class);
        startActivity(i9);
    }
}
