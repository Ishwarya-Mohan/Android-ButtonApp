package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<TextView>(R.id.textView)

       val but1 = findViewById<Button>(R.id.button15)
        val but2 = findViewById<Button>(R.id.button16)
        val but3 = findViewById<Button>(R.id.button17)

       // but1.setOnClickListener{

            // (l.View)
       //     tv.setText("Button1 is clicked")
       // }
        but1.setOnClickListener{
            tv.setText("Red is clicked")
        }
        but2.setOnClickListener{
            tv.setText("Green is clicked")
        }
        but3.setOnClickListener{
            tv.setText("Blue is clicked")
        }
           // Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show() }
        
    }




}