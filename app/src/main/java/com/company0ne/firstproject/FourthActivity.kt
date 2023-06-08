package com.company0ne.firstproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class FourthActivity : AppCompatActivity() {

    lateinit var userName: TextView
    lateinit var userEmail: TextView
    lateinit var userAge: TextView
    lateinit var userMobile: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable the back button in the action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setContentView(R.layout.activity_fourth)
        userName = findViewById(R.id.showUserName)
        userEmail = findViewById(R.id.showUserEmail)
        userAge= findViewById(R.id.showUserAge)
        userMobile = findViewById(R.id.showUserMobile)



        //retrieving string data
        val name = intent.getStringExtra("userName")
        val email = intent.getStringExtra("userEmail")
        val age = intent.getStringExtra("userAge")
        val mobile = intent.getStringExtra("userMobile")
        val gender = intent.getStringExtra("gender")


        // Display the data in TextViews or other UI elements
        //display userName
        val userName: TextView = findViewById(R.id.showUserName)
        userName.text = name
        //display userEmail
        val userEmail: TextView = findViewById(R.id.showUserEmail)
        userEmail.text = email
        //display userAge
        val userAge: TextView = findViewById(R.id.showUserAge)
        userAge.text = age
        //display userMobile
        val userMobile : TextView = findViewById(R.id.showUserMobile)
        userMobile.text= mobile
        //display Gender
        val genderTextView: TextView = findViewById(R.id.showUserGender)
        genderTextView.text = gender

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle back button clicks
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}




