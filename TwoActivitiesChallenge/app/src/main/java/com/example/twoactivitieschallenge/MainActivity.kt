package com.example.twoactivitieschallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnOne: Button
    private lateinit var btnTwo: Button
    private lateinit var btnThree: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOne = findViewById(R.id.btn_one)
        btnTwo = findViewById(R.id.btn_two)
        btnThree = findViewById(R.id.btn_three)
        btnOne.setOnClickListener {
            createIntentToSecondActivity(FIRST_TEXT_CODE)
        }
        btnTwo.setOnClickListener {
            createIntentToSecondActivity(SECOND_TEXT_CODE)
        }
        btnThree.setOnClickListener {
            createIntentToSecondActivity(THIRD_TEXT_CODE)
        }
    }

    private fun createIntentToSecondActivity(TEXT_CODE: Int) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(EXTRA_CODE, TEXT_CODE)
        startActivity(intent)
    }

    companion object {
        @JvmStatic
        val EXTRA_CODE = "com.example.twoactivitieschallenge.extra.CODE"

        @JvmStatic
        val FIRST_TEXT_CODE = 1

        @JvmStatic
        val SECOND_TEXT_CODE = 2

        @JvmStatic
        val THIRD_TEXT_CODE = 3
    }
}
