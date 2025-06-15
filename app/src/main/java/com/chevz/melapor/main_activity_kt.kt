package com.melapor.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        findViewById<Button>(R.id.btn_create_report).setOnClickListener {
            Toast.makeText(this, "Fitur buat laporan akan segera hadir", Toast.LENGTH_LONG).show()
        }
        
        findViewById<Button>(R.id.btn_history).setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
        }
        
        findViewById<Button>(R.id.btn_logout).setOnClickListener {
            Toast.makeText(this, "Terima kasih telah menggunakan MelaporApp", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}