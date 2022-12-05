package com.example.kngs_and_jester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class musicianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musician)
    }
    fun button3_Click(view: View) {

        val intent: Intent = Intent(
            this@musicianActivity,MainActivity::class.java)

        startActivity(intent)
    }
}