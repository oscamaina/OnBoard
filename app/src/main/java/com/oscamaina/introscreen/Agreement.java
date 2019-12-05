package com.oscamaina.introscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class Agreement extends AppCompatActivity {

    Button btnContinue;
    Switch swtTerms, swtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
        //hide action bar
        getSupportActionBar().hide();

        btnContinue = findViewById(R.id.btn_continue);
        swtTerms = findViewById(R.id.swt_terms);
        swtData = findViewById(R.id.swt_data);

        //click listner on button continue
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (swtTerms.isChecked() && swtData.isChecked()){
                Intent agreeActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(agreeActivity);
            }else {

                }
            }
        });
    }
}
