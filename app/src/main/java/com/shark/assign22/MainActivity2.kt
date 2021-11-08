package com.shark.assign22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intentValue = intent.getStringExtra("Data")
        findViewById<TextView>(R.id.secondTextView).apply{
            text = intentValue.toString()
        }
    }
}