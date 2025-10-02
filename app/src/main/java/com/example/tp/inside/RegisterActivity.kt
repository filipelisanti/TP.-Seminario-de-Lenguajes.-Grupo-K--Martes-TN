package com.example.tp.inside

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp.LoginActivity
import com.example.tp.R
import androidx.appcompat.widget.Toolbar
import kotlin.toString

class RegisterActivity : AppCompatActivity() {
    lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)

        btnConfirmar.setOnClickListener {
            val pass = findViewById<EditText>(R.id.idPasswordRegister)
            val emValue = findViewById<EditText>(R.id.idEmailRegister)
            val email = emValue.text.toString()
            val password = pass.text.toString()
            val confirmarPass = findViewById<EditText>(R.id.idConfirmarPasswordRegister)

            if (confirmarPass.text.toString() != pass.text.toString()) {
                Toast.makeText(this, "Las passwords no concuerdan", Toast.LENGTH_LONG).show()
            } else {


                val dao = AppDatabase.getDatabase(applicationContext).usuarioDao()
                val existente = dao.getUsuarioByName(email)


                if (existente != null) {
                    Toast.makeText(this, "El usuario ya existe", Toast.LENGTH_SHORT).show()
                } else {
                    var nuevoUser = Usuario(email, password)
                    dao.insert(nuevoUser)
                    Toast.makeText(this, "Usuario creado correctamente", Toast.LENGTH_SHORT).show()
                    navigateToLogin()
                }
            }
        }

        toolbar = findViewById(R.id.toolbar)


    }

    private fun navigateToLogin() {

        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}