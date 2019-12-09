package com.oscamaina.introscreen;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalDetailsFragment extends Fragment {

    private Button button;


    public PersonalDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personal_details, container, false);


        button = view.findViewById(R.id.btn_detailsNext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager manager = getFragmentManager();
                SummaryFragment summaryFragment = new SummaryFragment();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, summaryFragment,"summaryFrag");
                transaction.commit();

            }
        });
        return view;
    }

}
