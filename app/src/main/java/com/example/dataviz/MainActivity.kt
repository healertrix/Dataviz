package com.example.dataviz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    private lateinit var button:Button
    private lateinit var spinner: Spinner
    var courses = arrayOf<String?>("a.csv","b.csv")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         spinner =findViewById(R.id.spinner)
        button =findViewById(R.id.button)
    val adapter = ArrayAdapter.createFromResource(this,R.array.csv,android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spinner.adapter = adapter


    }
}


