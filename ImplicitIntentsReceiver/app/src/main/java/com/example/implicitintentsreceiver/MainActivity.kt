package com.example.implicitintentsreceiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uri = intent.data
        if (uri != null) {
            val uriString = getString(R.string.uri_label) + uri.toString()
            val textView = findViewById<TextView>(R.id.text_uri_message)
            textView.text = uriString
        }
    }
}
