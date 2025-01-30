package com.example.multiitemrecyclerview.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiitemrecyclerview.ModelClasses.profiles
import com.example.multiitemrecyclerview.Recycleview.MultiItemRecycleview
import com.example.multiitemrecyclerview.databinding.ActivityMultiItemRecycleViewBinding

class multiItemRecycleView : AppCompatActivity() {
    lateinit var binding:ActivityMultiItemRecycleViewBinding
    var arrContacts=ArrayList<profiles>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initliation()
    }
    fun initliation(){
        binding= ActivityMultiItemRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MultiItemRecycleview(this, arrContacts)
        binding.recyclerView.adapter = adapter
        arrContacts.add(profiles("Alice", "22", "Student 101", true))  // Student
        arrContacts.add(profiles("Bob", "35", "Teacher 203", false))  // Teacher
        arrContacts.add(profiles("Charlie", "19", "Student 102", true))
        arrContacts.add(profiles("David", "40", "Teacher 305", false))
        adapter.notifyDataSetChanged()
    }
}