package com.company0ne.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

//    private val SPLASH_TIME: Long = 3000
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_splash_screen)
//
//    Handler().postDelayed({
//        startActivity(Intent(this,MainActivity::class.java))
//        finish()
//    }, SPLASH_TIME)
//    }
//}


        // Duration of splash screen display (in milliseconds)
        private val SPLASH_DURATION = 2000L

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            // Set the layout for the splash activity
            setContentView(R.layout.activity_splash_screen)

            // Delay the transition to the next activity
            Handler().postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, SPLASH_DURATION)
        }
    }