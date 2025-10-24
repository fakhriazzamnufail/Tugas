package com.example.tugas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnHome = findViewById<Button>(R.id.btnHome)

        btnHome.setOnClickListener {
            val intent = Intent(this, Activity_Profile::class.java)
            //pindah ke ProfileActivity
            startActivity(intent)
        }

    }
}