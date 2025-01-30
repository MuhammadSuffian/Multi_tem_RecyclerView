package com.example.multiitemrecyclerview.Activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiitemrecyclerview.ModelClasses.profiles
import com.example.multiitemrecyclerview.Recycleview.RecycleView
import com.example.multiitemrecyclerview.databinding.ActivityRecycleViewBinding

class recycleView : AppCompatActivity() {
    lateinit var binding:ActivityRecycleViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initliation()
    }
    fun initliation(){
        binding= ActivityRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val arrcontact=ArrayList<profiles>()
        val adapter= RecycleView(this,arrcontact)
        binding.rvRecycleView.layoutManager = LinearLayoutManager(this)
        binding.rvRecycleView.adapter=adapter
        arrcontact.add(profiles("Suffian","21","F21-BSSE-138",true))
        arrcontact.add(profiles("Suffian","21","F21-BSSE-138",true))
        arrcontact.add(profiles("Suffian","21","F21-BSSE-138",true))
        arrcontact.add(profiles("Suffian","21","F21-BSSE-138",true))
        adapter.notifyDataSetChanged()
    }
}