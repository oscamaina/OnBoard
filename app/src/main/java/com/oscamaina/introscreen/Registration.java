package com.oscamaina.introscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registration extends AppCompatActivity implements View.OnClickListener{
    Button btnBack, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        //hide action bar
        getSupportActionBar().hide();

        btnBack = findViewById(R.id.btn_regback);
        btnNext = findViewById(R.id.btn_regNext);

        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_regback:
                Intent landActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(landActivity);
                break;
            case R.id.btn_regNext:
                Intent detailsActivity = new Intent(getApplicationContext(), Personaldetails.class);
                startActivity(detailsActivity);
                break;
    }
}}
