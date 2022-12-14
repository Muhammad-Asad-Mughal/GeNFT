package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Dashboard extends AppCompatActivity {

    TextView  email1;
    TextView pass1;
    TextView dice;
    int min = 1;
    int max = 6;
    Random random = new Random();
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String pass = intent.getStringExtra("pass");
        email1 = findViewById(R.id.email1);
        pass1 = findViewById(R.id.password1);
        email1.setText(email);
        pass1.setText(pass);

    }

    public void roll(View view) {
        dice = findViewById(R.id.dice);
        number = random.nextInt(max + min)+ min;
        dice.setText("Rolling.....");
        new Handler().postDelayed(() -> {
            dice.setText(String.valueOf(number));
        },800);

    }
}