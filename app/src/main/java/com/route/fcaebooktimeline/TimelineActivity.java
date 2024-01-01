package com.route.fcaebooktimeline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TimelineActivity extends AppCompatActivity {

    List<Story> storiesList;
    List<Post>postsList;
    RecyclerView storyRecycler;
    RecyclerViewAdapter adapter;

    RecyclerView postRecycler;
    RecyclerPostAdapter postAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        storyRecycler = findViewById(R.id.rv_story);
        createStories();
        adapter = new RecyclerViewAdapter(storiesList);
        storyRecycler.setAdapter(adapter);
        ///
        postRecycler = findViewById(R.id.rv_post);
        createPosts();
        postAdapter = new RecyclerPostAdapter(postsList);
        postRecycler.setAdapter((postAdapter));
    }

    private void createPosts() {
        postsList = new ArrayList<>(10);
        for(int i=0; i<10; i++){
            postsList.add(new Post("Android", R.drawable.android_img, R.drawable.android_developer));
        }
    }

    private void createStories() {
        storiesList = new ArrayList<>(10);
       for(int i=0; i<10; i++){
           storiesList.add(new Story(i, "Mei Habib", R.drawable.penguin, R.drawable.nature));
       }
    }
}