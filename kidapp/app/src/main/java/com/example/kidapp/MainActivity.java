package com.example.kidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
     Button repobutton, lessonbutton, quizbutton , customizedButton, customizedQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repobutton=findViewById(R.id.button3);
        repobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String repoAddress = "https://github.com/bsef19m552/Mobile_Computing.git";
                openWebPage(repoAddress);
            }
        });
        lessonbutton = findViewById(R.id.button);
        lessonbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,   LessonActivity.class);
                startActivity(intent);
            }
        });
        quizbutton=findViewById(R.id.button2);
        quizbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });
        customizedButton = findViewById(R.id.button4);
        customizedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListLesson.class);
                startActivity(intent);
            }
        });
        customizedQuiz = findViewById(R.id.button7);
        customizedQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewQuiz.class);
                startActivity(intent);
            }
        });

    }

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}