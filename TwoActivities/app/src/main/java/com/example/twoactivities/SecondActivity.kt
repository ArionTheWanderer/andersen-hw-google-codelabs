package com.example.twoactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.content.Intent




class SecondActivity : AppCompatActivity() {

    private lateinit var mReply: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView: TextView = findViewById(R.id.text_message)
        mReply = findViewById(R.id.editText_second)
        textView.text = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
    }

    fun returnReply(view: android.view.View) {
        val reply = mReply.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        finish()
    }

    companion object {
        @JvmStatic
        val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"
    }
}
