package com.example.kidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class ListLesson extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_lesson);

        ArrayList<Alphabet> arrayList = new ArrayList<Alphabet>();
        arrayList.add(new Alphabet("A", R.drawable.a));
        arrayList.add(new Alphabet("B", R.drawable.b));
        arrayList.add(new Alphabet("C", R.drawable.c));
        arrayList.add(new Alphabet("D", R.drawable.d));
        arrayList.add(new Alphabet("E", R.drawable.e));
        arrayList.add(new Alphabet("F", R.drawable.f));
        arrayList.add(new Alphabet("G", R.drawable.g));
        arrayList.add(new Alphabet("H", R.drawable.h));
        arrayList.add(new Alphabet("I", R.drawable.ii));
        arrayList.add(new Alphabet("J", R.drawable.j));
        arrayList.add(new Alphabet("K", R.drawable.k));
        arrayList.add(new Alphabet("L", R.drawable.l));
        arrayList.add(new Alphabet("M", R.drawable.m));
        arrayList.add(new Alphabet("N", R.drawable.n));
        arrayList.add(new Alphabet("O", R.drawable.o));
        arrayList.add(new Alphabet("P", R.drawable.p));
        arrayList.add(new Alphabet("Q", R.drawable.q));
        arrayList.add(new Alphabet("R", R.drawable.r));
        arrayList.add(new Alphabet("S", R.drawable.s));
        arrayList.add(new Alphabet("T", R.drawable.t));
        arrayList.add(new Alphabet("U", R.drawable.u));
        arrayList.add(new Alphabet("V", R.drawable.v));
        arrayList.add(new Alphabet("W", R.drawable.w));
        arrayList.add(new Alphabet("X", R.drawable.x));
        arrayList.add(new Alphabet("Y", R.drawable.y));
        arrayList.add(new Alphabet("Z", R.drawable.z));
        ListVIew adapter = new ListVIew(this,arrayList);
        ListView listView = findViewById(R.id.customizedList);
        listView.setAdapter(adapter);











    }
}