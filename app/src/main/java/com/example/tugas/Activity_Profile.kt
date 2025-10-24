package com.example.tugas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnDaftar = findViewById<Button>(R.id.btnDaftar)
        val inputName = findViewById<EditText>(R.id.inputName)
        val inputEmail = findViewById<EditText>(R.id.inputEmail)
        val inputAlamat = findViewById<EditText>(R.id.inputAlamat)

        btnDaftar.setOnClickListener {
            val name = inputName.text.toString()
            val email = inputEmail.text.toString()
            val alamat = inputAlamat.text.toString()

            val intent = Intent(this, Activity_Detail::class.java)
            intent.putExtra("EXTRA_NAME", name)
            intent.putExtra("EXTRA_EMAIL", email)
            intent.putExtra("EXTRA_ALAMAT", alamat)

            startActivity(intent)
        }

    }
}