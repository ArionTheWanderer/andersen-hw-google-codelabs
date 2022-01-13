package com.example.twoactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.content.Intent
import android.util.Log


class SecondActivity : AppCompatActivity() {

    private lateinit var mReply: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView: TextView = findViewById(R.id.text_message)
        mReply = findViewById(R.id.editText_second)
        textView.text = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }

    fun returnReply(view: android.view.View) {
        val reply = mReply.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        Log.d(LOG_TAG, "End SecondActivity")
        finish()
    }

    companion object {
        @JvmStatic
        private val LOG_TAG = SecondActivity::class.java.simpleName

        @JvmStatic
        val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"
    }
}
