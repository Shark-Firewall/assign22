package com.shark.assign22

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY_NAME="name"
    }

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
            putExtra(KEY_NAME,send(editText.text.toString()))
        }
        startActivity(i)
    }
}