package com.example.kngs_and_jester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AlbomsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alboms)
    }    fun button3_Click(view: View) {

        val intent: Intent = Intent(
            this@AlbomsActivity,MainActivity::class.java)

        startActivity(intent)
    }
}