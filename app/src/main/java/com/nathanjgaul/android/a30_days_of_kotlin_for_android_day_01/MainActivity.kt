package com.nathanjgaul.android.a30_days_of_kotlin_for_android_day_01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe (view: View) {
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe (view: View) {
        // Get the value of the text view
        val countString = textView.text.toString()

        // Convert value to number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view
        textView.text = count.toString()
    }

    fun randomMe (view: View) {
        // Create and intent to start a second activity
        val randomIntent = Intent(this, Main2Activity::class.java)

        val countString = textView.text.toString()

        val count = Integer.parseInt(countString)

        // Add count to the extras for the view Intent
        randomIntent.putExtra(Main2Activity.TOTAL_COUNT, count)

        // Start the new activity
        startActivity(randomIntent)
    }
}
