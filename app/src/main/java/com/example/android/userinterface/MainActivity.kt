package com.example.android.userinterface

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        addTextView(getString(R.string.hello))
        addTextView(getString(R.string.from))
        addTextView(getString(R.string.android))
    }

    private fun addTextView(label: String) {
        val view = TextView(this)
        view.text = label
        view.textSize = 28f
        view.setTextColor(Color.parseColor("#ff0000"))
        linearLayout.addView(view)
    }

}
