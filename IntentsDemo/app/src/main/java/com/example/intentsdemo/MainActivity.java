package com.example.intentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg=findViewById(R.id.et1);

    }

    public void movescreen(View view)
    {

        Intent i=new Intent(this,SecondScreen.class);
        startActivity(i);

    }

    public void googledata(View view)
    {

        Uri u=Uri.parse("http://www.google.com");

        Intent i1=new Intent(Intent.ACTION_VIEW,u);

        startActivity(i1);

    }

    public void messagedata(View view)
    {
       String m= msg.getText().toString();

       Intent i2=new Intent(this,SecondScreen.class);

       i2.putExtra("gopal",m);

       startActivity(i2);



    }
}
