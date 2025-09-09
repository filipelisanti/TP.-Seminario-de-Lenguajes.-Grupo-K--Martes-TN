package com.example.tp.inside

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp.R

class VerMasLunesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ver_mas_lunes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnVolver = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnVolver)
        btnVolver.setOnClickListener { navigateToIniciarSesion() }
    }
    private fun navigateToIniciarSesion(){
        val intent = Intent(this, IniciarSesionActivity::class.java)
        startActivity(intent)
    }
}