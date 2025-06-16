package com.chevz.melapor.R

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        
        val detailText = findViewById<TextView>(R.id.detail_text)
        val judul = intent.getStringExtra("judul") ?: "Tidak ada data"
        
        detailText.text = "Detail: $judul\n\nLokasi: Jakarta Selatan\nTanggal: 13/06/2025\nStatus: Dalam Proses\n\nDeskripsi: Laporan ini sedang ditangani oleh petugas terkait."
    }
}
