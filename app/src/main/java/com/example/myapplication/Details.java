package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.Objects;

public class Details extends AppCompatActivity {
    TextView lyricsContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        lyricsContent = findViewById(R.id.contentofStory);
        Intent i = getIntent();
        String title = i.getStringExtra("lyricsTitle");
        String content = i.getStringExtra("lyricsContents");
        //getSupportActionBar().setTitle(title);
        lyricsContent.setText(content);
        lyricsContent.setMovementMethod(new ScrollingMovementMethod());

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}