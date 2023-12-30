package com.route.fcaebooktimeline;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    List<Story> stories;

    public RecyclerViewAdapter(List<Story> stories) {
        this.stories = stories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_timeline, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Story story = stories.get(position);
        if(story!=null) {
            holder.name.setText(story.username);
            holder.profileImg.setImageResource(story.userProfileImage);
            holder.storyImg.setImageResource(story.storyImage);
        }
    }

    @Override
    public int getItemCount() {
        if (stories == null) return 0;
        else
            return stories.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        CircleImageView profileImg;
        ImageView storyImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_username);
            profileImg = itemView.findViewById(R.id.cimv_profile);
            storyImg = itemView.findViewById(R.id.imv_story);
        }
    }
}
