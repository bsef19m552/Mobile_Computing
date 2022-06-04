package com.example.kidapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class ListVIew extends ArrayAdapter<Alphabet> {

    ListVIew(Activity context, ArrayList<Alphabet> arrayList) {
        super(context, 0,arrayList);}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Alphabet letter = getItem(position);
        convertView = LayoutInflater.from(getContext()).
                inflate(R.layout.letter_layout,null,true);

        ImageView imageView=convertView.findViewById(R.id.letterImage);
        TextView textView=convertView.findViewById(R.id.letterName);;

        imageView.setImageResource(letter.getImgId());
        textView.setText(letter.getName());
        return convertView;
    }


}
