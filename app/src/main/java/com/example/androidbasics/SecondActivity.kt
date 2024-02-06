package com.example.androidbasics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        /* Intent
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            Intent(this,ThirdActivity::class.java).also {
                startActivity(it)
            }
        }

         */

        /* Passing data
        //val name = intent.getStringExtra("EXTRA_NAME")
        //val age = intent.getIntExtra("EXTRA_AGE",0)
        //val country = intent.getStringExtra("EXTRA_COUNTRY")
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        //val personString = "$name is $age years old and lives in $country"
        val tvPerson = findViewById<TextView>(R.id.tvPerson)
        tvPerson.text = person.toString()
         */

    }

}