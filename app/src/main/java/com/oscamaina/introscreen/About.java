package com.oscamaina.introscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //hide action bar
        getSupportActionBar().hide();
    }
}
