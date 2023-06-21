package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler = findViewById(R.id.Test_recycler);
        int[] ids = new int[2];
        ids[0]=R.drawable.quiz;
        ids[1]=R.drawable.coming;
        recycler.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter( ids);
        recycler.setAdapter(adapter);
    }
}