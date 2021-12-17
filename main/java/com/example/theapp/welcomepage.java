package com.example.theapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.*;

public class welcomepage extends AppCompatActivity {
    TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);

        welcome = findViewById(R.id.welcome);

        Intent w=getIntent();
        String s=w.getExtras().getString("sname");
        welcome.setText("Welcome! " + s);
    }
}