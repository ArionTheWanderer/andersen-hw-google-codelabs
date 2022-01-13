package com.example.counterhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var mCount = 0
        set(value) {
            field = value
            mTvCount.text = value.toString()
        }

    lateinit var mTvCount: TextView
    lateinit var mBtnCount: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTvCount = findViewById(R.id.tv_count)
        mBtnCount = findViewById(R.id.btn_count)
        val savedCount = savedInstanceState?.getInt(KEY_COUNT)
        mCount = savedCount ?: 0
        mBtnCount.setOnClickListener {
            mCount++
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_COUNT, mCount)
    }

    companion object {
        @JvmStatic
        private val KEY_COUNT = "COUNT"
    }
}
