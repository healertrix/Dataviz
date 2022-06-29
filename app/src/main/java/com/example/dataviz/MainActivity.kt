package com.example.dataviz

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader

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

                val minput = InputStreamReader(assets.open("a.csv"))
                val reader = BufferedReader(minput)

                var line : String?
                var displayData : String = ""

                while (reader.readLine().also { line = it } != null){
                    val row : List<String> = line!!.split(",")
                    displayData = displayData + row[0] + "\t" + row[1] + "\n"
                }
                    data.text = displayData


//                data.text = text
            }

        }


    }
}






