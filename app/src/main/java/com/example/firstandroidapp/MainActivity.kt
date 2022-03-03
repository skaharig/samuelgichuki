package com.example.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val textViewName = findViewById<TextView>(R.id.textViewName)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val textViewCount=findViewById<TextView>(R.id.textViewCount)
        val buttonSubtract=findViewById<Button>(R.id.buttonSubtract)

        textViewCount.text=count.toString()

        buttonAdd.setOnClickListener {
            val newNumber = add()
            textViewCount.text=newNumber.toString()
        }
        buttonSubtract.setOnClickListener {
            val newNumber = subtract()
            textViewCount.text = newNumber.toString()
        }
    }
    private fun add(): Int {
        val newNumber = count++
        return newNumber
    }
    private fun subtract(): Int{
        val newNumber=count++
        return newNumber








    }
}