package com.example.sharedprefernces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText name,email,password;
   Button register,login;
   SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize the idsR.id
        name=findViewById(R.id.username);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        register=findViewById(R.id.register);
        login=findViewById(R.id.login);
        preferences=getSharedPreferences("apssdc",MODE_PRIVATE);
    }

    public void register(View view) {
        String uname = name.getText().toString();
        String upassword = password.getText().toString();
        SharedPreferences.Editor editor = preferences.edit();
        if (uname.equals("")) {
            Toast.makeText(this, "please enter the username", Toast.LENGTH_SHORT).show();
        } else if (upassword.equals("")) {
            Toast.makeText(this, "pleae enter the password", Toast.LENGTH_SHORT).show();
        } else {
            editor.putString("name", uname);
            editor.putString("password", upassword);
            editor.apply();
            Toast.makeText(this, "UserRegister succesfully", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, LoginPage.class);
            startActivity(i);
        }
    }

    public void login(View view) {
        Intent i = new Intent(this,LoginPage.class);
        startActivity(i);
    }
}
