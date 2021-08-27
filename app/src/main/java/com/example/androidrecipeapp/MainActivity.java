package com.example.androidrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;
    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Chicken Roll", "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n", "Method", "kads,caskasdkasdkmkads,caskasdkasdkmkads,caskasdkasdkmkads,caskasdkasdkmkads,caskasdkasdkm", R.drawable.chicken_roll));
        recipes1.add(new Recipes("Donut", "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n", "Method", "kads,caskasdkasdkmkads,caskasdkasdkmkads,caskasdkasdkmkads,caskasdkasdkmkads,caskasdkasdkm", R.drawable.donut));

        recipes1.add(new Recipes("dosa", "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n" +
                "kads,caskasdkasdkm,s\n", "Method", "kads,caskasdkasdkmkads,caskasdkasdkmkads,caskasdkasdkmkads,caskasdkasdkmkads,caskasdkasdkm", R.drawable.dosa));
        myrecyclerView = findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this, recipes1);
        myrecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        myrecyclerView.setAdapter(myAdapter);
    }
}