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

        loginButton.setOnClickListener {
            val message = String.format(
                getString(R.string.login_message),
                nameInput.text,
                passwordInput.text
            )
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }

}
