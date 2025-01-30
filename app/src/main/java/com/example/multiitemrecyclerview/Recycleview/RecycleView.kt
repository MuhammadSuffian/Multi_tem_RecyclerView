package com.example.multiitemrecyclerview.Recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.multiitemrecyclerview.ModelClasses.profiles
import com.example.multiitemrecyclerview.R

class RecycleView(private val context: Context,private val arrcontact:ArrayList<profiles>  ): RecyclerView.Adapter<RecycleView.ViewHolder>() {
    inner class ViewHolder(profiles: View):RecyclerView.ViewHolder(profiles){
        val name=profiles.findViewById<TextView>(R.id.tv_name)
        val age=profiles.findViewById<TextView>(R.id.tv_age)
        val roll=profiles.findViewById<TextView>(R.id.tv_roll)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=  LayoutInflater.from(context).inflate(R.layout.profile_list, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text=arrcontact[position].Name
        holder.age.text=arrcontact[position].Age
        holder.roll.text=arrcontact[position].Rollno
    }

    override fun getItemCount(): Int {
        return arrcontact.size
    }
}