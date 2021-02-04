package com.example.pdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({ // This method will be executed once the timer is over
            // Start your app main activity
            val i = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(i)
            // close this activity
            finish()
        }, 4000)
    }
}
