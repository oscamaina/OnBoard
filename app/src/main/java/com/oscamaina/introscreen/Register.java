package com.oscamaina.introscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;


public class Register extends AppCompatActivity implements DisclaimerFragment.onDisclaimerResponseListner{

    Button btnBack;
    EditText txt_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        //hide action bar
        getSupportActionBar().hide();

        btnBack = findViewById(R.id.btn_regback);

        if (findViewById(R.id.fragment_container) != null)
        {
            if (savedInstanceState != null)
            {
                return;
            }
            DisclaimerFragment disclaimerFragment = new DisclaimerFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,
                disclaimerFragment,"disclaimerFrag");
            fragmentTransaction.commit();

        }

    }

//    FragmentManager manager = getFragmentManager();
//    FragmentTransaction transaction = manager.beginTransaction();
//            transaction.add(R.id.fragment_container, disclaimerFragment,"disclaimerFrag");
//            transaction.commit();
////
//    public void Back(View view) {
//        Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
//        startActivity(mainActivity);
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.btn_regback:
//                Intent landActivity = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(landActivity);
//                break;
//            case R.id.btn_regNext:
//                if (TextUtils.isEmpty(txt_ID.getText().toString())){
//                    txt_ID.setError("National is required!");
//                }
//                else {
//                    Intent detailsActivity = new Intent(getApplicationContext(), Personaldetails.class);
//                    startActivity(detailsActivity);
//                    break;
//                }
//
//        }
//    }

//    public void onRadioButtonClicked(View view) {
//        RadioGroup radioGroup = findViewById(R.id.Radiogroup);
//        RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
//        Toast.makeText(this, radioButton.getText() + " is selected", Toast.LENGTH_SHORT).show();
//    }

    public void Back(View view) {
        Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(mainActivity);
    }

    @Override
    public void onDisclaimerResponse(String NationalID) {

    }
}