package com.example.tp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp.inside.IniciarSesionActivity
import com.example.tp.inside.RegisterActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val btnRegistrarse = findViewById<Button>(R.id.idBtnRegistrarse)
        val btnIniciarSesion = findViewById<Button>(R.id.idBtnIniciarSesion)
        btnRegistrarse.setOnClickListener { navigateToRegister() }
        btnIniciarSesion.setOnClickListener { navigateToIniciarSesion() }
    }

    private fun navigateToRegister() {
        val intentRegister = Intent(this, RegisterActivity::class.java)
        startActivity(intentRegister)
    }

    private fun navigateToIniciarSesion() {
        val email1 = findViewById<EditText>(R.id.idUsuario)
        val emailVerification = intent.extras?.getString("validEmail")
        val pass1 = findViewById<EditText>(R.id.idPassword)
        val validPassword = intent.extras?.getString("validPass")
        if (pass1.text.toString() != validPassword) {
            Toast.makeText(
                this,
                "Password no registrado, por favor cree una cuenta",
                Toast.LENGTH_LONG
            ).show()
        } else if (email1.text.toString() != emailVerification) {
            Toast.makeText(
                this,
                "Email no registrado, por favor cree una cuenta",
                Toast.LENGTH_LONG
            ).show()

        } else {
            val intent = Intent(this, IniciarSesionActivity::class.java)
            startActivity(intent)
        }
    }
}