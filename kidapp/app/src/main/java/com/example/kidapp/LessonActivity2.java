package com.example.kidapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LessonActivity2  extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_activity2);
        textView = findViewById(R.id.textView2);
        imageView = findViewById(R.id.imageView2);
        Intent intent = getIntent();
        String letter = intent.getStringExtra("letter");
        textView.setText(letter);
        if (letter.equals("A")) {
            imageView.setImageResource(R.drawable.a);
    } else if (letter.equals("B")) {
        imageView.setImageResource(R.drawable.b);
    } else if (letter.equals("C")) {
        imageView.setImageResource(R.drawable.c);
    } else if (letter.equals("D") ) {
        imageView.setImageResource(R.drawable.d);
    } else if (letter.equals("E") ) {
        imageView.setImageResource(R.drawable.e);
    } else if (letter.equals("G") ) {

        imageView.setImageResource(R.drawable.g);
    } else if (letter.equals("H")) {
        imageView.setImageResource(R.drawable.h);
    } else if (letter.equals("I") ) {
        imageView.setImageResource(R.drawable.ii);
    } else if (letter.equals("J") ) {
        imageView.setImageResource(R.drawable.j);
    } else if (letter.equals("K")) {
        imageView.setImageResource(R.drawable.k);
    } else if (letter.equals("L") ) {
        imageView.setImageResource(R.drawable.l);
    }
        else if (letter.equals("M")){
            imageView.setImageResource(R.drawable.m);

        }
        else if (letter.equals("N")){
            imageView.setImageResource(R.drawable.n);

        }
        else if (letter.equals("O")){
            imageView.setImageResource(R.drawable.o);

        }
        else if (letter.equals("P")){
            imageView.setImageResource(R.drawable.p);

        }
        else if (letter.equals("Q")){
            imageView.setImageResource(R.drawable.q);

        }
        else if (letter.equals("R")){
            imageView.setImageResource(R.drawable.r);

        }
        else if (letter.equals("S")){
            imageView.setImageResource(R.drawable.s);

        }
       else if (letter.equals("T")){
            imageView.setImageResource(R.drawable.t);

        }
        else if (letter.equals("U")){
            imageView.setImageResource(R.drawable.u);

        }
        else if (letter.equals("V")){
            imageView.setImageResource(R.drawable.v);

        }
        else if (letter.equals("W")){
            imageView.setImageResource(R.drawable.w);

        }
        else if (letter.equals("X")){
            imageView.setImageResource(R.drawable.x);

        }
        else if (letter.equals("Y")){
            imageView.setImageResource(R.drawable.y);

        }
        else if (letter.equals("Z")){
            imageView.setImageResource(R.drawable.z);

        }
    }
}
