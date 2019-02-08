package com.example.android.userinterface

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button.setOnClickListener{
            val userName = nameInput.text.toString()
            val password = passwordInput.text.toString()
            Toast.makeText(this,
                "Name: $userName, Password: $password", Toast.LENGTH_LONG)
                .show()
        }
    }

}
