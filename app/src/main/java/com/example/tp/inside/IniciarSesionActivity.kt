package com.example.tp.inside

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp.LoginActivity
import com.example.tp.R

class IniciarSesionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_iniciarsesion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnCerrarSesion = findViewById<Button>(R.id.idBtnSalir)
        btnCerrarSesion.setOnClickListener { navigateToLogin() }
        val btnVerMasLunes =
            findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnVerMasLunes)
        btnVerMasLunes.setOnClickListener { navigateToVerLunes() }
        val btnVerMasMartes =
            findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnVerMasMartes)
        btnVerMasMartes.setOnClickListener { navigateToVerMartes() }
        val btnVerMasMiercoles =
            findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnVerMasMiercoles)
        btnVerMasMiercoles.setOnClickListener { navigateToVerMiercoles() }
        val btnVerMasJueves =
            findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnVerMasJueves)
        btnVerMasJueves.setOnClickListener { navigateToVerJueves() }
        val btnVerMasViernes =
            findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnVerMasViernes)
        btnVerMasViernes.setOnClickListener { navigateToVerViernes() }
        val btnVerMasSabado =
            findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnVerMasSabado)
        btnVerMasSabado.setOnClickListener { navigateToVerSabado() }
        val btnVerMasDomingo =
            findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnVerMasDomingo)
        btnVerMasDomingo.setOnClickListener { navigateToVerDomingo() }
    }

    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToVerLunes() {
        val intent2 = Intent(this, VerMasLunesActivity::class.java)
        startActivity(intent2)
    }

    private fun navigateToVerMartes() {
        val intent3 = Intent(this, VerMasMartesActivity::class.java)
        startActivity(intent3)
    }

    private fun navigateToVerMiercoles() {
        val intent4 = Intent(this, VerMasMiercolesActivity::class.java)
        startActivity(intent4)
    }

    private fun navigateToVerJueves() {
        val intent5 = Intent(this, VerMasJuevesActivity::class.java)
        startActivity(intent5)
    }

    private fun navigateToVerViernes() {
        val intent6 = Intent(this, VerMasViernesActivity::class.java)
        startActivity(intent6)
    }

    private fun navigateToVerSabado() {
        val intent7 = Intent(this, VerMasSabadoActivity::class.java)
        startActivity(intent7)
    }

    private fun navigateToVerDomingo() {
        val intent8 = Intent(this, VerMasDomingoActivity::class.java)
        startActivity(intent8)
    }

}