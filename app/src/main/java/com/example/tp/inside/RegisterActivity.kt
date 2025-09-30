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
        btnConfirmar.setOnClickListener { navigateToLogin() }

        toolbar = findViewById(R.id.toolbar)




    }
    private fun navigateToLogin() {
        val confirmarPass = findViewById<EditText>(R.id.idConfirmarPasswordRegister)
        val pass = findViewById<EditText>(R.id.idPasswordRegister)
        if (confirmarPass.text.toString() == pass.text.toString()) {
            val emValue = findViewById<EditText>(R.id.idEmailRegister)
            val email = emValue.text.toString()
            val password = pass.text.toString()
            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)
        }else{
            Toast.makeText(this, "Las passwords no concuerdan", Toast.LENGTH_LONG).show()
        }
    }
}