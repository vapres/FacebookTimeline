package com.route.fcaebooktimeline

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class RecyclerViewAdapter(var stories: List<Story>?) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_story, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val story = stories!![position]
        Log.e("Story", "adapter$story")
        holder.name.text = story.username
        holder.profileImg.setImageResource(story.userProfileImage)
        holder.storyImg.setImageResource(story.storyImage)
    }

    override fun getItemCount(): Int {
        return stories?.size?:0
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView
        var profileImg: CircleImageView
        var storyImg: ImageView

        init {
            name = itemView.findViewById(R.id.tv_username)
            profileImg = itemView.findViewById(R.id.cimv_profile)
            storyImg = itemView.findViewById(R.id.imv_story)
        }
    }
}
