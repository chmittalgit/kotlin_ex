package com.example.kotlin_demoex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hlo=findViewById <TextView>(R.id.hlo)
        val one=findViewById<TextView>(R.id.one)
        val two= findViewById<TextView>(R.id.two)

        hlo.setOnClickListener(
            View.OnClickListener {
                intent= Intent(this,SecoundActivity::class.java)
                startActivity(intent)
            }

        )
        one.setOnClickListener(View.OnClickListener {

        })
        two.setOnClickListener(View.OnClickListener {


        })
    }
}