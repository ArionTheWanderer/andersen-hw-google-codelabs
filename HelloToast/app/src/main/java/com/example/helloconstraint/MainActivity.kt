package com.example.helloconstraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {
    private var mCount = 0
        set(value) {
            field = value
            mShowCount.text = value.toString()
        }

    lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
    }

    fun showToast(view: android.view.View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }

    fun countUp(view: android.view.View) {
        mCount++
        if (mCount % 2 == 0) {
            view.backgroundTintList = AppCompatResources.getColorStateList(this, R.color.color_even)
        } else {
            view.backgroundTintList = AppCompatResources.getColorStateList(this, R.color.color_odd)
        }
        findViewById<Button>(R.id.button_zero).backgroundTintList = AppCompatResources.getColorStateList(this, R.color.color_zero_active)
    }

    fun resetCount(view: android.view.View) {
        mCount = 0
        findViewById<Button>(R.id.button_count).backgroundTintList = AppCompatResources.getColorStateList(this, R.color.color_even)
        view.backgroundTintList = AppCompatResources.getColorStateList(this, R.color.color_zero_inactive)
    }
}
