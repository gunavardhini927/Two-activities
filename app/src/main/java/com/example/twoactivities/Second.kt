package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val  button = findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
               finish()
    }
}}