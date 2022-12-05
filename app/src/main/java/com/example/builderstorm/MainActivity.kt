package com.example.builderstorm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.builderstorm.activity.AddBuilderStormActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler(Looper.myLooper()!!).postDelayed(Runnable {
            val i = Intent(this@MainActivity, AddBuilderStormActivity::class.java)
            startActivity(i)
            finish()
        }, 3000)
    }
}