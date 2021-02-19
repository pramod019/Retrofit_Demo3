package com.pramodk.myapp3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pramodk.myapp3.R
import com.pramodk.myapp3.model.Post

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var list = emptyList<Post>()

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val profilePic = itemView.findViewById<ImageView>(R.id.img_profile_pic)
        val albumID = itemView.findViewById<TextView>(R.id.txt_album_id)
        val title = itemView.findViewById<TextView>(R.id.txt_title)

        fun bind(post: Post){
            albumID.text = post.albumId.toString()
            title.text = post.title
            Glide.with(profilePic.context)
                .load(post.url)
                .into(profilePic)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return MyViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size


    fun setData(post: List<Post>){
        list = post
        notifyDataSetChanged()
    }
}
