package com.example.kidapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class LessonActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_activity);

    }
    public void letterClick(View view) {
        Button b = (Button)view;
        String letter=b.getText().toString();
        Intent intent = new Intent(LessonActivity.this, LessonActivity2.class);
       intent.putExtra("letter",letter);
        startActivity(intent);
    }

}
