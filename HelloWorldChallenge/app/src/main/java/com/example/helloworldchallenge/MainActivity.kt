package com.example.helloworldchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "Hello World")
        try {
            throw IllegalArgumentException("omg...")
        } catch (e: IllegalArgumentException) {
            Log.e("MainActivity", "Exception detected", e)
        }
    }
}
