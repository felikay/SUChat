package com.example.quotegenerator

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var quoteTextView: TextView

    private val quotes = mutableListOf(
        "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. - Ralph Waldo Emerson",
        "The only way to do great work is to love what you do. - Steve Jobs",
        "The best way to predict the future is to invent it. - Alan Kay"
    )

    private val fonts = mutableListOf(
        Typeface.DEFAULT,
        Typeface.SANS_SERIF,
        Typeface.MONOSPACE
    )

    private val color = mutableListOf(
        Color.BLUE,
        Color.RED,
        Color.MAGENTA
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quoteTextView = findViewById(R.id.quoteTextView)

        displayRandomQuote()
    }

    private fun displayRandomQuote() {
        val randomQuote = quotes.random()
        val randomFont = fonts.random()
        val randomColor = color.random()

        quoteTextView.text = randomQuote
        quoteTextView.typeface = randomFont
        quoteTextView.setTextColor(randomColor)
    }
}