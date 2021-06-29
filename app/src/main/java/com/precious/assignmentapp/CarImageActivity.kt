package com.precious.assignmentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.precious.assignmentapp.databinding.ActivityCarImageBinding

class CarImageActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCarImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.aboutCarr.setOnClickListener {
            val intent = Intent(this, AboutCarActivity::class.java)
            startActivity(intent)
        }

        binding.carRental.setOnClickListener {
            val intent2 = Intent(this, carRentActivity::class.java)
            startActivity(intent2)
        }
    }
}