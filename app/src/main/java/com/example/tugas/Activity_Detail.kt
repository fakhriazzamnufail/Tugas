package com.example.tugas

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        val name = intent.getStringExtra("EXTRA_NAME")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val alamat = intent.getStringExtra("EXTRA_ALAMAT")

        //hasilnya
        tvResult.text ="Nama: $name\nEmail: $email\nAlamat: $alamat"

    }
}