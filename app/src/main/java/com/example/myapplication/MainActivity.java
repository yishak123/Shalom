package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
 RecyclerView recyclerView;
 Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] titles=getResources().getStringArray(R.array.lyrics_title);
        String[] contents= getResources().getStringArray(R.array.lyrics_contents);

        recyclerView = findViewById(R.id.lyricslistView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Adapter(this,titles,contents);
        recyclerView.setAdapter(adapter);
    }
}