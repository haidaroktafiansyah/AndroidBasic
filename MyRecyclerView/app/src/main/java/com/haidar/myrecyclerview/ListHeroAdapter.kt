package com.haidar.myrecyclerview

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListHeroAdapter (private val listHero:ArrayList<Hero>): RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHeroAdapter.ListViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ListHeroAdapter.ListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName:TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail:TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto:ImageView = itemView.findViewById(R.id.img_item_photo)
    }
    
}