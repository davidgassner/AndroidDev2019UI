package com.example.android.userinterface

import android.graphics.drawable.Drawable
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
            displayImageAsset("monster01.webp")
        }

        button2.setOnClickListener{
            displayImageAsset("monster02.webp")
        }

        button3.setOnClickListener{
            displayImageAsset("monster03.webp")
        }

    }

//    private fun displayImageResource(resId: Int) {
//        monsterImage.setImageResource(resId)
//    }

    private fun displayImageAsset(fileName: String) {
        assets.open(fileName).use {
            val drawable = Drawable.createFromStream(it, null)
            monsterImage.setImageDrawable(drawable)
        }
    }

}
