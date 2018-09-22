package com.kitkat.ulil.pindahhalamanandroidbyulil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Second Activity");
        setContentView(R.layout.activity_second);
    }
}
