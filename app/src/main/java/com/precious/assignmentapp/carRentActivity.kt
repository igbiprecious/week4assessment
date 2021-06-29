package com.precious.assignmentapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.precious.assignmentapp.databinding.ActivityCarRentBinding

class carRentActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCarRentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarRentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.aboutCarBtn.setOnClickListener {
            val intent = Intent(this,AboutCarActivity::class.java)
            startActivity(intent)
        }

        binding.carImageBtn.setOnClickListener {
            val intent = Intent(this, CarImageActivity::class.java)
            startActivity(intent)
        }

        binding.callBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:09039381434")
            }
            if(intent.resolveActivity(packageManager) != null){
                startActivity(intent)
            }
        }
    }


}