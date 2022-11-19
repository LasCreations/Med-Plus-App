package com.example.medplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MinorEmergency extends AppCompatActivity implements View.OnClickListener {

    public CardView minor1, minor2, minor3, minor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor_emergency);

        minor1 = (CardView) findViewById(R.id.cuts);
        minor2 = (CardView) findViewById(R.id.choking);
        minor3 = (CardView) findViewById(R.id.fractures);
        minor4 = (CardView) findViewById(R.id.sprain);



        minor1.setOnClickListener(this);
        minor2.setOnClickListener(this);
        minor3.setOnClickListener(this);
        minor4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cuts:
                i = new Intent(this, MinorCuts.class);
                startActivity(i);
                break;

            case R.id.choking:
                i = new Intent(this, Choking.class);
                startActivity(i);
                break;

            case R.id.fractures:
                i = new Intent(this, Fractures.class);
                startActivity(i);
                break;

            case R.id.sprain:
                i = new Intent(this, Sprain.class);
                startActivity(i);
                break;


        }
    }
}