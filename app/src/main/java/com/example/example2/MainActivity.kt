package com.example.example2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSubmit(view: View) {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        var tvAge = findViewById<TextView>(R.id.tvAge)
        var inputYear = findViewById<TextView>(R.id.inputYear)
        tvAge.text = "Age: " + (currentYear - inputYear.text.toString().toInt())
    }
}