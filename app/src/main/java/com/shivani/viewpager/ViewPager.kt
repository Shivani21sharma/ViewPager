package com.shivani.viewpager

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViewPager(var layouts: ArrayList<Int> ): RecyclerView.Adapter<ViewPager.ViewHolder>() {
    class ViewHolder(var view : View): RecyclerView.ViewHolder(view) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return ViewHolder(view)
    }
    override fun getItemViewType(position: Int): Int {
        return layouts [position]
    }


    override fun getItemCount():Int{
       return layouts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {



    }
}