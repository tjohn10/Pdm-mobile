package com.example.pdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nameET = findViewById<EditText>(R.id.name)
        val emailET = findViewById<EditText>(R.id.email)
        val phoneET = findViewById<EditText>(R.id.phone_num)
        val passET = findViewById<EditText>(R.id.password)
        val cPassET = findViewById<EditText>(R.id.confirm_password)
        val registerBtn = findViewById<Button>(R.id.signup_btn)
        val loginTV = findViewById<TextView>(R.id.login_txt)

        loginTV.setOnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
