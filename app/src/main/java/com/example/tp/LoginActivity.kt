package com.example.tp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp.inside.IniciarSesionActivity
import com.example.tp.inside.RegisterActivity
import androidx.appcompat.widget.Toolbar

class LoginActivity : AppCompatActivity() {
    lateinit var toolbar: Toolbar

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

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.item_temperatura){
            Toast.makeText(this, "---", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


    private fun navigateToRegister() {
        val intentRegister = Intent(this, RegisterActivity::class.java)
        startActivity(intentRegister)
    }

    private fun navigateToIniciarSesion() {
        val email1 = findViewById<EditText>(R.id.idUsuario)

        val pass1 = findViewById<EditText>(R.id.idPassword)

        if (email1==null || pass1==null) {
            Toast.makeText(
                this,
                "COMPLETAR DATOS",
                Toast.LENGTH_LONG
            ).show()
        } else {
            val intent = Intent(this, IniciarSesionActivity::class.java)
            startActivity(intent)
        }
    }
}