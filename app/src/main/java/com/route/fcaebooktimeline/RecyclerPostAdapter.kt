package com.route.fcaebooktimeline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class RecyclerPostAdapter(var posts: List<Post>?) : RecyclerView.Adapter<RecyclerPostAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_post, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = posts!![position]
        holder.name.text = post.username
        holder.profileImg.setImageResource(post.profileImage)
        holder.postImg.setImageResource(post.postImage)
    }

    override fun getItemCount(): Int {
        return if (posts == null) 0 else posts!!.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView
        var profileImg: CircleImageView
        var postImg: ImageView

        init {
            name = itemView.findViewById(R.id.tv_user_name)
            profileImg = itemView.findViewById(R.id.img_profile)
            postImg = itemView.findViewById(R.id.imv_post_photo)
        }
    }
}
