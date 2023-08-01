package com.example.greetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.greetings.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener {
            val nameText = binding.editText.text
            Toast.makeText(this, "HELLO ${nameText}!!", Toast.LENGTH_LONG).show()
        }
    }
}
