package com.oscamaina.introscreen;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        //hide action bar
        getSupportActionBar().hide();


        DisclaimerFragment disclaimerFragment = new DisclaimerFragment();

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, disclaimerFragment,"disclaimerFrag");
        transaction.commit();




    }

}
