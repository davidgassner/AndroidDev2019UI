package com.example.android.userinterface

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button1.setOnClickListener{
            displayImageResource(R.drawable.monster01)
        }

        button2.setOnClickListener{
            displayImageResource(R.drawable.monster02)
        }

        button3.setOnClickListener{
            displayImageResource(R.drawable.monster03)
        }

    }

    private fun displayImageResource(resId: Int) {
        monsterImage.setImageResource(resId)
    }

}
