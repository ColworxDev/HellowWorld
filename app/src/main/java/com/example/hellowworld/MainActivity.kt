package com.example.hellowworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hellowworld.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //private var binding: ActivityMainBinding =
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn1.setOnClickListener {
            binding.layoutContainer.setBackgroundColor(getRandomColor())
        }

        binding.imgBtn.setOnClickListener {
            binding.imgBtn.setBackgroundColor(getRandomColor())
        }
    }


    private fun getRandomColor() : Int {
        return Color.rgb(Random().nextInt(), Random().nextInt(), Random().nextInt())
    }

}