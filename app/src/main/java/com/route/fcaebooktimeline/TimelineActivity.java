package com.route.fcaebooktimeline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TimelineActivity extends AppCompatActivity {

    List<Story> storiesList;
    RecyclerView storyRecycler;
    RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        storyRecycler = findViewById(R.id.rv_story);
        createStories();
        adapter = new RecyclerViewAdapter(storiesList);
        storyRecycler.setAdapter(adapter);
    }

    private void createStories() {
        storiesList = new ArrayList<>(3);
        storiesList.add(new Story(1, "Mei", R.drawable.penguin, R.drawable.nature));
        storiesList.add(new Story(2, "Maha", R.drawable.img2, R.drawable.story2));
        storiesList.add(new Story(3, "Farah", R.drawable.story2, R.drawable.img2));

    }
}