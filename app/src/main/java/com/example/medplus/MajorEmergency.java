package com.example.medplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MajorEmergency extends AppCompatActivity implements View.OnClickListener {

public CardView major1, major2, major3, major4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major_emergency);

        major1 = (CardView) findViewById(R.id.stroke);
        major2 = (CardView) findViewById(R.id.seizure);
        major3 = (CardView) findViewById(R.id.heart);
        major4 = (CardView) findViewById(R.id.electrocution);



        major1.setOnClickListener(this);
        major2.setOnClickListener(this);
        major3.setOnClickListener(this);
        major4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.stroke :
                i = new Intent(this, Stroke.class);
                startActivity(i);
                break;

                case R.id.seizure :
                i = new Intent(this, Seizure.class);
                startActivity(i);
                break;

                case R.id.heart :
                i = new Intent(this, HeartAttack.class);
                startActivity(i);
                break;

                case R.id.electrocution :
                i = new Intent(this, Electrocution.class);
                startActivity(i);
                break;

        }
    }
}