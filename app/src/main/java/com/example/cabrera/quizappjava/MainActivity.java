package com.example.cabrera.quizappjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.cabrera.quizappjava.Adapters.CategoryAdapter;
import com.example.cabrera.quizappjava.Common.SpaceDecoration;
import com.example.cabrera.quizappjava.DBHelpers.DBHelper;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recycler_category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Quiz 2019");
        setSupportActionBar(toolbar);

        recycler_category = findViewById(R.id.recycler_category);
        recycler_category.setHasFixedSize(true);
        recycler_category.setLayoutManager(new GridLayoutManager(this, 2));

        CategoryAdapter adapter = new CategoryAdapter(MainActivity.this, DBHelper.getInstance(this).getAllCategories());
        int spaceInPixel = 4;
        recycler_category.addItemDecoration(new SpaceDecoration(spaceInPixel));
        recycler_category.setAdapter(adapter);

    }
}
