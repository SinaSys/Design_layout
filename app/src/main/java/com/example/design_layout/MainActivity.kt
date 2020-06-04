package com.example.design_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowToast.setOnClickListener {
            //write your code
            Log.i("MainActivity", "Button was clicked !")
            Toast.makeText(applicationContext,"Button was clicked !",Toast.LENGTH_LONG).show()

        }
    }
}
