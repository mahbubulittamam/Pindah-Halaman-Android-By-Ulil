package com.kitkat.ulil.pindahhalamanandroidbyulil;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private Button buttonSatu;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_first, container, false);
        ((FragmentWithActivity) getActivity()).getSupportActionBar().setTitle("Fragment");
        ((FragmentWithActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        buttonSatu = (Button) view.findViewById(R.id.button1);



        return view;


    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        buttonSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            //Second Fragment
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_content, secondFragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();

            }
        });

    }


}