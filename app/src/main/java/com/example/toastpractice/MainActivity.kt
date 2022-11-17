package com.example.toastpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun display(view: View) {

Toast.makeText(getApplicationContext(),"welcome home" ,Toast.LENGTH_SHORT).show()




    }

    fun displayMessage(view: View) {
        Toast.makeText(getApplicationContext(),"Hello world" ,Toast.LENGTH_LONG).show()
    }
}