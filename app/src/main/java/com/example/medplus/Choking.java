package com.example.medplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Choking extends AppCompatActivity implements View.OnClickListener {

    public CardView img, steps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choking);

        img = (CardView) findViewById(R.id.selectimg);
        steps = (CardView) findViewById(R.id.selectsteps);

        img.setOnClickListener(this);
        steps.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.selectimg :
                i = new Intent(this,ChokingImg.class);
                startActivity(i);
                break;

            case R.id.selectsteps :
                i = new Intent(this,ChokingSteps.class);
                startActivity(i);
                break;
        }

    }
}