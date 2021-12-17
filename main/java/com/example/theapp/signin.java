package com.example.theapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;

public class signin extends AppCompatActivity {
    EditText signup_username, signup_password, signup_number, signup_email;
    ImageButton signup_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        signup_button = findViewById(R.id.signup_button);
        signup_username = findViewById(R.id.signup_username);
        signup_password = findViewById(R.id.signup_password);
        signup_email = findViewById(R.id.signup_email);
        signup_number = findViewById(R.id.signup_number);

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent w=new Intent(getApplicationContext(),welcomepage.class);
                String n1 = signup_username.getText().toString();
                w.putExtra("sname",n1);
                startActivity(w);
            }
        });


    }
}