package com.route.fcaebooktimeline

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class TimelineActivity : AppCompatActivity() {

    lateinit var storiesList: List<Story>
    lateinit var postsList: List<Post>
    private lateinit var storyRecycler: RecyclerView
    private lateinit var adapter: RecyclerViewAdapter

    private lateinit var postRecycler: RecyclerView
    private lateinit var postAdapter: RecyclerPostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timeline)

        storyRecycler = findViewById(R.id.rv_story)
        createStories()
        adapter = RecyclerViewAdapter(storiesList)
        storyRecycler.adapter = adapter

        postRecycler = findViewById(R.id.rv_post)
        createPosts()
        postAdapter = RecyclerPostAdapter(postsList)
        postRecycler.adapter = postAdapter
    }

    private fun createPosts() {
        postsList = ArrayList()
        for (i in 0 until 10) {
            (postsList as ArrayList<Post>).add(Post("Android", R.drawable.android_img, R.drawable.android_developer))
        }
    }

    private fun createStories() {
        storiesList = ArrayList()
        for (i in 0 until 10) {
            (storiesList as ArrayList<Story>).add(Story(i, "Mei Habib", R.drawable.penguin, R.drawable.nature))
        }
    }

}
