package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mendapatkan referensi ke TextView dengan ID tvHello
        val tvHello: TextView = findViewById(R.id.tvHello)

        // Mendapatkan referensi ke TextView dengan ID tvName
        val tvName: TextView = findViewById(R.id.tvName)

        // Lakukan operasi lain jika diperlukan
    }
}
