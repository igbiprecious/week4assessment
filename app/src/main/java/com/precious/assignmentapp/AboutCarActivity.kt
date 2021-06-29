package com.precious.assignmentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.precious.assignmentapp.databinding.ActivityAboutCarBinding

class AboutCarActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAboutCarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutCarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.carRent.setOnClickListener {
            val intent = Intent(this, carRentActivity::class.java)
            startActivity(intent)
        }

        binding.carImage.setOnClickListener {
            val intent = Intent(this, CarImageActivity::class.java)
            startActivity(intent)
        }
    }
}