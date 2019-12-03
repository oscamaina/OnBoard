package com.oscamaina.introscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnAbout, btnRegister, btnLogin, btnContact, btnPayment, btnEqury, btnFaqs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide action bar
        getSupportActionBar().hide();

        btnAbout = findViewById(R.id.btn_about);
        btnRegister = findViewById(R.id.btn_register);
        btnLogin = findViewById(R.id.btn_login);
        btnContact = findViewById(R.id.btn_contact);
        btnPayment = findViewById(R.id.btn_payment);
        btnEqury = findViewById(R.id.btn_equiry);
        btnFaqs = findViewById(R.id.btn_faqs);

        btnAbout.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        btnContact.setOnClickListener(this);
        btnPayment.setOnClickListener(this);
        btnEqury.setOnClickListener(this);
        btnFaqs.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_faqs:
                Intent faqActivity = new Intent(getApplicationContext(), Faqs.class);
                startActivity(faqActivity);
                break;
            case R.id.btn_about:
                Intent abtActivity = new Intent(getApplicationContext(), About.class);
                startActivity(abtActivity);
                break;
        }

    }
}
