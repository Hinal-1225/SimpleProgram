package com.example.simple_program

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         var message = ""
        btnInsert.setOnClickListener {
            message = edtMessage.text.toString()
            Toast.makeText(this, " Inserted ", Toast.LENGTH_SHORT).show()
        }

        btnDisplay.setOnClickListener {
            Toast.makeText(this, "$message", Toast.LENGTH_SHORT).show()
        }
        btnDisplayText.setOnClickListener{
            edtDMessage.setText("$message")
        }
    }
}