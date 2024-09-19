package com.example.gitbranchingpract

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gitbranchingpract.model.About

class AboutAdapter(val data: List<About>):
    RecyclerView.Adapter<AboutAdapter.AboutItemViewHolder>() {
    class AboutItemViewHolder(val row: View): RecyclerView.ViewHolder(row){
        val aboutProfileImageView = row.findViewById<ImageView>(R.id.aboutItemImg)
        val aboutNameTextView = row.findViewById<TextView>(R.id.aboutItemName)
        val aboutDescTextView = row.findViewById<TextView>(R.id.aboutItemDesc)
        val showMoreButton = row.findViewById<Button>(R.id.aboutItemShowMoreButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.about_item_view, parent, false)
        return AboutItemViewHolder(layout)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: AboutItemViewHolder, position: Int) {
        holder.aboutNameTextView.text = data.get(position).name
        holder.aboutDescTextView.text = data.get(position).desc
        holder.aboutProfileImageView.setImageResource(data.get(position).imageResId)
        holder.showMoreButton.setOnClickListener(data.get(position).onClickListener)
    }
}