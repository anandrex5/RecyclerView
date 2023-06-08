package com.company0ne.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Enable the back button in the action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val button : Button= findViewById(R.id.userData)

        //retrieving string data
        val countryName = intent.getStringExtra("countryName")
        val countryDetails = intent.getStringExtra("countryDetails")


        // Display the data in TextViews or other UI elements
        val countryNameTextView: TextView = findViewById(R.id.textViewCountryName)
        val countryDetailsTextView: TextView = findViewById(R.id.textViewDetails)


        countryNameTextView.text = countryName
        countryDetailsTextView.text = countryDetails

        button.setOnClickListener {

            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)

        }
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

