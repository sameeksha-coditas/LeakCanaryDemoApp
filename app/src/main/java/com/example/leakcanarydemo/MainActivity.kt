package com.example.leakcanarydemo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Intent(this,MainActivity2::class.java).also{
            startActivity(it)
        }
    }

    companion object{
        lateinit var context: Context
    }
}