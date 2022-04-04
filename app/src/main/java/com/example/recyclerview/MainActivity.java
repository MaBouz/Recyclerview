package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    String[] titleArray;
    String[] subtitleArray;

    Integer[] drawableArray = {R.drawable.ic_favorite, R.drawable.ic_home, R.drawable.ic_search,
            R.drawable.ic_favorite, R.drawable.ic_home, R.drawable.ic_search,R.drawable.ic_favorite, R.drawable.ic_home, R.drawable.ic_search};

    EquipeAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView)findViewById(R.id.rv);
        titleArray = getResources().getStringArray(R.array.array_titre);
        subtitleArray = getResources().getStringArray(R.array.array_sous_titre);
        ad = new EquipeAdapter(MainActivity.this,drawableArray,titleArray,subtitleArray);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
        rv.setAdapter(ad);

    }
}