package com.oscamaina.introscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener{
    Button btnBack, btnRegister, btnLogin;
    TextView txt_username, txt_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //hide action bar
        getSupportActionBar().hide();

        btnBack = findViewById(R.id.btn_loginback);
        btnRegister = findViewById(R.id.btn_register);
        btnLogin = findViewById(R.id.btn_login);
        txt_username = findViewById(R.id.txt_username);
        txt_password = findViewById(R.id.txt_password);


        btnBack.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }
    public boolean fieldsverified(){
        boolean verified = false;
        if (TextUtils.isEmpty(txt_username.getText().toString()) || TextUtils.isEmpty(txt_password.getText().toString())){
            if (TextUtils.isEmpty(txt_username.getText().toString()))
                txt_username.setError("Username is required!");
            if (TextUtils.isEmpty(txt_password.getText().toString()))
                txt_password.setError(("Password is required!"));
        }else
            verified = true;

        return verified;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_loginback:
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);
                break;
            case R.id.btn_register:
                Intent registerActivity = new Intent(getApplicationContext(), Registration.class);
                startActivity(registerActivity);
                break;
            case R.id.btn_login:
                fieldsverified();
                break;
    }
}}
