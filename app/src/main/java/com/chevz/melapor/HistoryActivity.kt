package com.chevz.melapor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_history)
        recyclerView.layoutManager = LinearLayoutManager(this)
        
        val data = listOf(
            "📋 Laporan Jalan Rusak - Jl. Merdeka",
            "🚨 Laporan Kecelakaan - Jl. Sudirman", 
            "🔦 Laporan Lampu Mati - Jl. Pahlawan",
            "🚰 Laporan Pipa Bocor - Jl. Veteran",
            "🗑️ Laporan Sampah Menumpuk - Jl. Ahmad Yani"
        )
         
        recyclerView.adapter = HistoryAdapter(data) { selectedItem ->
            startActivity(Intent(this, DetailActivity::class.java).apply {
                putExtra("judul", selectedItem)
            })
        }
    }
}
