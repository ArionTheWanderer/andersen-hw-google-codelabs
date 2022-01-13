package com.example.twoactivitieschallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var mHeadingTextView: TextView
    private lateinit var mArticleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        mHeadingTextView = findViewById(R.id.article_heading)
        mArticleTextView = findViewById(R.id.article)
        val extraCode = intent.extras?.getInt(MainActivity.EXTRA_CODE)
        setText(extraCode)
    }

    private fun setText(extraCode: Int?) {
        var title: String = ""
        var article: String = ""
        when(extraCode) {
            MainActivity.FIRST_TEXT_CODE -> {
                title = getString(R.string.article_1_title)
                article = getString(R.string.article_1_text)
            }
            MainActivity.SECOND_TEXT_CODE -> {
                title = getString(R.string.article_2_title)
                article = getString(R.string.article_2_text)
            }
            MainActivity.THIRD_TEXT_CODE -> {
                title = getString(R.string.article_3_title)
                article = getString(R.string.article_3_text)
            }
        }
        mHeadingTextView.text = title
        mArticleTextView.text = article
    }
}
