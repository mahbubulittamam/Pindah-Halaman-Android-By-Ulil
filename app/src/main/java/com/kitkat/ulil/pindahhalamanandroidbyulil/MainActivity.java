package com.kitkat.ulil.pindahhalamanandroidbyulil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview = new TextView(MainActivity.this);
        textview.setTextSize(14);



    } void onCreate(Bundle savedInstanceState)


    public void intent (View view) {
        Intent intent =new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);

    }
    public void fragment (View view) {
        Intent intent =new Intent(MainActivity.this,FragmentWithActivity.class);
        startActivity(intent);

    }

}