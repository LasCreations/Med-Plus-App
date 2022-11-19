package com.example.medplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    Button button;
    Button buttonsecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Major Emergency", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MajorEmergency.class);
                startActivity(intent);
            }
        });



        buttonsecond = findViewById(R.id.button2);
        buttonsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Minor Emergency", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MinorEmergency.class);
                startActivity(intent);
            }
        });

    }



}