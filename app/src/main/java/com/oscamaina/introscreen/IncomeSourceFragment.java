package com.oscamaina.introscreen;

//import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class IncomeSourceFragment extends Fragment {

    private Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_income_source, container, false);

        button = view.findViewById(R.id.btn_sourceNxt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager manager = getFragmentManager();
                PersonalDetailsFragment personalDetailsFragment = new PersonalDetailsFragment();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, personalDetailsFragment,"personalDetailsFrag");
                transaction.commit();

            }
        });

        return view;
    }

}
