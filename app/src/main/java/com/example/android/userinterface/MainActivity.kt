package com.example.android.userinterface

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button1.setOnClickListener {
            displayImage(R.drawable.monster01)
        }

        button2.setOnClickListener {
            displayImage(R.drawable.monster02)
        }

        button3.setOnClickListener {
            displayImage(R.drawable.monster03)
        }

    }

    private fun displayImage(resId: Int) {
        monsterImage.setImageResource(resId)
    }

}
