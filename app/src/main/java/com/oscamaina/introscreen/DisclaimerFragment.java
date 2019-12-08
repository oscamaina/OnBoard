package com.oscamaina.introscreen;

//import android.app.Fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DisclaimerFragment extends Fragment {

    private EditText txt_ID;
    private Button button;

    //interface callBack
    onDisclaimerResponseListner DisclaimerResponseListner;

    public interface onDisclaimerResponseListner{
        public void onDisclaimerResponse(String NationalID);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_disclaimer, container, false);

        txt_ID = view.findViewById(R.id.txt_ID);
        button = view.findViewById(R.id.btn_regNext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(txt_ID.getText().toString())){
                    txt_ID.setError("National is required!");
                }
                else {
//                    IncomeSourceFragment incomeSourceFragment = new IncomeSourceFragment();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,
//                            incomeSourceFragment,"disclaimerFrag");
//                    fragmentTransaction.commit();

                    FragmentManager manager = getFragmentManager();
                    IncomeSourceFragment incomeSourceFragment = new IncomeSourceFragment();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, incomeSourceFragment,"incomeSourceFrag");
                    transaction.commit();

//                    String NatID = txt_ID.getText().toString();
//                    DisclaimerResponseListner.onDisclaimerResponse(NatID);
                }
            }
        });


        return view;
    }

    @Override
    //check if interface is implemented by parent Activity
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity = (Activity) context;
        try {
            DisclaimerResponseListner = (onDisclaimerResponseListner)activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString()+"must override on DisclaimerResponse..");
        }

    }
}
