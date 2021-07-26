package com.example.hanyamencobagithub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonNext : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonNext = findViewById(R.id.btnNext)

        buttonNext.setOnClickListener {
            val maju = Intent(this, MainActivity2::class.java)
            startActivity(maju)
        }



    }
}