package com.shark.assign22

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText=findViewById(
            R.id.editText
        )
    }

    fun onButtonClicked(view: View) {
        val i = Intent(this, MainActivity2::class.java).apply {
            putExtra("Data",editText.text.toString())
        }
        startActivity(i)
    }
}