package com.kitkat.ulil.pindahhalamanandroidbyulil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class FragmentWithActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Fragment");
        setContentView(R.layout.activity_fragment_with);
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();


        FirstFragment FirstFragment = new FirstFragment();

        transaction.add(R.id.frame_content, FirstFragment);
        transaction.addToBackStack("FirstFragment");

        transaction.commit();



    }


    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            this.finish();
        } else {
            getFragmentManager().popBackStack();
        }
    }

}