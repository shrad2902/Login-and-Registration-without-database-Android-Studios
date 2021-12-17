package com.example.theapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    ImageButton signupb, loginb;
    EditText login_username, login_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signupb = findViewById(R.id.signupb);
        loginb = findViewById(R.id.loginb);
        login_username = findViewById(R.id.login_username);
        login_password = findViewById(R.id.login_password);


        signupb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), signin.class);
                startActivity(i);
            }
        });

        loginb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = login_username.getText().toString();
                String password = login_password.getText().toString();

                Boolean checklogin = (username.equals("shrad2902") && password.equals("ss"));
                if (checklogin == true) {
                    Intent y = new Intent(getApplicationContext(), welcomepage.class);
                    String n1 = login_username.getText().toString();
                    y.putExtra("sname",n1);
                    startActivity(y);
                } else {
                    Intent n = new Intent(getApplicationContext(), error.class);
                    startActivity(n);
                }
            }
        });
    }
}
