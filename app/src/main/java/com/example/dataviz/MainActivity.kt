package com.example.dataviz

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var button:Button
    private lateinit var spinner: Spinner
    private lateinit var data:TextView
    var courses = arrayOf<String?>("a.csv","b.csv")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data =findViewById(R.id.sampleData)
         spinner =findViewById(R.id.spinner)
        button =findViewById(R.id.button)
    val adapter = ArrayAdapter.createFromResource(this,R.array.csv,android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spinner.adapter = adapter



        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val text: String = spinner.selectedItem.toString()
                data.text = text
            }

        }


    }
}






