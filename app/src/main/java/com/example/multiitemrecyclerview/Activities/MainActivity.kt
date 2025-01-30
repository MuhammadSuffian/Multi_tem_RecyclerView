package com.example.multiitemrecyclerview.Activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiitemrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initliation()
    }
    fun initliation(){
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRecycleView.setOnClickListener(){
            startActivity(Intent(this, recycleView::class.java))
        }
        binding.btnMultItemRecycleView.setOnClickListener(){
            startActivity(Intent(this, multiItemRecycleView::class.java))
        }
    }
}