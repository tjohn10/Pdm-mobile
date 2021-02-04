package com.example.pdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var emailET = findViewById<EditText>(R.id.email)
        var passwordET = findViewById<EditText>(R.id.password)
        val registerTV = findViewById<TextView>(R.id.sign_up)
        val loginBtn = findViewById<Button>(R.id.login_btn)

        registerTV.setOnClickListener {
            val intent  = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
        loginBtn.setOnClickListener {
            val intent  = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
