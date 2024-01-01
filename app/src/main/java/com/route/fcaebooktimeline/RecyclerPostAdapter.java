package com.route.fcaebooktimeline;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerPostAdapter extends RecyclerView.Adapter<RecyclerPostAdapter.ViewHolder> {
    List<Post> posts;

    public RecyclerPostAdapter(List<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.name.setText(post.username);
        holder.profileImg.setImageResource(post.profileImage);
        holder.postImg.setImageResource(post.postImage);
    }

    @Override
    public int getItemCount() {
        if (posts == null) return 0;
        else
            return posts.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        CircleImageView profileImg;
        ImageView postImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_user_name);
            profileImg = itemView.findViewById(R.id.img_profile);
            postImg = itemView.findViewById(R.id.imv_post_photo);
        }
    }
}
