package com.kitkat.ulil.pindahhalamanandroidbyulil;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.FragmentManager;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {




//title bar atau action bar

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        ((FragmentWithActivity) getActivity()).getSupportActionBar().setTitle("Fragment");
        ((FragmentWithActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //tombol back
        setHasOptionsMenu(true);

        return view;

    }

    @Override
    //tombol back
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);



    }

    //end of title bar atau action bar



}
