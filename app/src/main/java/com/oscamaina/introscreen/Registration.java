package com.oscamaina.introscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Registration extends AppCompatActivity implements View.OnClickListener{
    Button btnBack, btnNext;
    EditText txt_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        //hide action bar
        getSupportActionBar().hide();

        btnBack = findViewById(R.id.btn_regback);
        btnNext = findViewById(R.id.btn_regNext);
        txt_ID = findViewById(R.id.txt_ID);

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
                if (TextUtils.isEmpty(txt_ID.getText().toString())){
                txt_ID.setError("National is required!");
            }
                else {
                    Intent detailsActivity = new Intent(getApplicationContext(), Personaldetails.class);
                    startActivity(detailsActivity);
                    break;
                }

    }
}

    public void onRadioButtonClicked(View view) {
        RadioGroup radioGroup = findViewById(R.id.Radiogroup);
        RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
        Toast.makeText(this, radioButton.getText() + " is selected", Toast.LENGTH_SHORT).show();
    }
}
