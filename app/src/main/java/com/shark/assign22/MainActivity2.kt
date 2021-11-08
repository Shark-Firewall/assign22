package com.shark.assign22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView=findViewById(R.id.secondTextView)
        val rec=intent.getSerializableExtra(MainActivity.KEY_NAME) as send
        textView.text=rec.name
    }
}