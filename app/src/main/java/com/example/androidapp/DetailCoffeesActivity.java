package com.example.androidapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailCoffeesActivity extends AppCompatActivity {
    TextView fullName;
    TextView email;
    TextView City;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_detail);

        fullName  = (TextView) findViewById(R.id.fullName);
        email = (TextView) findViewById(R.id.email);
        City =  (TextView) findViewById(R.id.City);

        String tmpName = getIntent().getStringExtra("fullName");
        String tmpEmail = getIntent().getStringExtra("email");
        String tmpCity = getIntent().getStringExtra("City");

        fullName.setText(tmpName);
        email.setText(tmpEmail);
        City.setText(tmpCity);
    }
}