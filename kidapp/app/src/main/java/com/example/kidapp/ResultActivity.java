package com.example.kidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity  extends AppCompatActivity {

    TextView yourScore,remarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        yourScore=findViewById(R.id.yourScore);
        remarks=findViewById(R.id.remarks);

        setup();
    }
    private void setup()
    {
        int score = getIntent().getIntExtra("score",0);
        yourScore.setText(yourScore.getText().toString().concat(String.valueOf(score)));
        String rem="";
        if(score==0) rem+="Very Poor";
        else if(score==1) rem+="Work Hard";
        else if(score==2) rem+="Average ";
        else if(score==3) rem+="Good";
        else if(score==4) rem+="V.Good";
        else if(score==5) {
            rem+="Excellent Work";
        }
        remarks.setText(remarks.getText().toString().concat(rem));
    }
}
