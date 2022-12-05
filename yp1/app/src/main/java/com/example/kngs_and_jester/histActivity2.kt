package com.example.kngs_and_jester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class histActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hist2)
    }
    fun button_Click(view: View) {

        val intent: Intent = Intent(
            this@histActivity2,MainActivity::class.java)

        startActivity(intent)
    }
}