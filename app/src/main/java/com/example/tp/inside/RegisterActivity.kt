package com.example.tp.inside

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp.LoginActivity
import com.example.tp.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnConfirmar = findViewById<Button>(R.id.btnConfirmar)

        btnConfirmar.setOnClickListener { navigateToLogin() }

    }
    private fun navigateToLogin(){

        var pass = findViewById<EditText>(R.id.idPasswordRegister)
        var emValue = findViewById<EditText>(R.id.idEmailRegister)
        var email = emValue.text.toString()
        var password = pass.text.toString()
        var intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("validEmail",email)
        intent.putExtra("validPass",password)
        startActivity(intent)
    }
}