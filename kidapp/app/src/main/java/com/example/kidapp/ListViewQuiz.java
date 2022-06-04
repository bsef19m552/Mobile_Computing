package com.example.kidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewQuiz extends AppCompatActivity {

    Button button2;
    private int score;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        score=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_quiz);


        listView=findViewById(R.id.listQuiz);
        //arraylist creation
        ArrayList<Quiz> arrayList = new ArrayList<Quiz>();
        arrayList.add(new Quiz(
                "Q1","First alphabet is",
                "A","B","C","D",R.id.radioA
        ));
        arrayList.add(new Quiz(
                "Q2","Window starts from alphabet:"
                ,"Q","W","N","C",R.id.radioB
        ));
        arrayList.add(new Quiz(
                "Q3","My name starts with:"
                ,"A","K","S","N",R.id.radioC
        ));
        arrayList.add(new Quiz(
                "Q4","The number of alphabets are"
                ,"23","26","20","30",R.id.radioB
        ));
        arrayList.add(new Quiz(
                "Q5","Cat Starts with"
                ,"C","O","X","N",R.id.radioA
        ));

        QuizLayout adapter = new QuizLayout(this,arrayList);
        listView.setAdapter(adapter);
        button2=findViewById(R.id.button11);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int ind=0;ind<arrayList.size();ind++){
                    if(arrayList.get(ind).isCorrect()) score++;
                }
                Intent intent = new Intent(ListViewQuiz.this,ResultActivity.class);
                intent.putExtra("score",score);
                startActivity(intent);
            }
        });
    }
}
