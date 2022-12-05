package com.example.kngs_and_jester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button3_Click(view: View) {

        val intent: Intent = Intent(
            this@MainActivity,musicianActivity::class.java)

             startActivity(intent)
        }
    fun button4_Click(view: View) {

        val intent: Intent = Intent(
            this@MainActivity,histActivity2::class.java)

        startActivity(intent)
    }
    }