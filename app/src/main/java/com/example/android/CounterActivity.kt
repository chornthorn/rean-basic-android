package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.android.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCounterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCounterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var counter = 0
//        binding.counter = counter

        binding.incrementBtn.setOnClickListener {

            if (counter == 10) {
                Toast.makeText(this, "Counter cannot be greater than 10", Toast.LENGTH_SHORT).show()
                return@setOnClickListener // return@setOnClickListener is used to return from the lambda expression
            }

            counter++
            binding.counter = counter
        }

        binding.decrementBtn.setOnClickListener {

            if (counter == 0) {
                Toast.makeText(this, "Counter cannot be less than 0", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            counter--
            binding.counter = counter
        }
    }
}