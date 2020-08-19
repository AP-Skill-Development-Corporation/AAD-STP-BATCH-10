package com.example.sharedprefernces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
     EditText et_name,et_pasword;
     SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        et_name=findViewById(R.id.uname);
        et_pasword=findViewById(R.id.upassword);
        preferences=getSharedPreferences("apssdc",MODE_PRIVATE);
    }

    public void submit(View view) {
        String user_given_name=et_name.getText().toString();
        String user_given_pasword=et_pasword.getText().toString();
        String reg_user_name=preferences.getString("name","");
        String reg_user_password=preferences.getString("password","");
        if(user_given_name.equals(reg_user_name)&& user_given_pasword.equals(reg_user_password)){
            Toast.makeText(this, "user login succesfully", Toast.LENGTH_SHORT).show();
        
        }
        else{
            Toast.makeText(this, "user wrong details", Toast.LENGTH_SHORT).show();
        }
    }
}
