package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.myButton)
        val myTextView = findViewById<TextView>(R.id.myTextView)

        button.setOnClickListener {
            myTextView.text = "Hello. My name is Isabella"
        }
    }
}