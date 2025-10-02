package com.example.tp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp.inside.IniciarSesionActivity
import com.example.tp.inside.RegisterActivity
import androidx.appcompat.widget.Toolbar
import com.example.tp.inside.AppDatabase
import kotlin.random.Random

class LoginActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var EtUsuario: EditText
    lateinit var EtPass: EditText
    lateinit var CvRecordarUsuario: CheckBox
    var rand = mostrarTemp()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        EtUsuario = findViewById(R.id.idUsuario)
        EtPass = findViewById(R.id.idPassword)
        CvRecordarUsuario = findViewById(R.id.idCheckBox)
        toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)


        val preferencias = getSharedPreferences(resources.getString(R.string.sp_credenciales), MODE_PRIVATE)
        val usuarioGuardado = preferencias.getString(resources.getString(R.string.user1), "")
        val passGuardado = preferencias.getString(resources.getString(R.string.pass1), "")

        if (!usuarioGuardado.isNullOrEmpty() && !passGuardado.isNullOrEmpty()) {
            navigateToIniciarSesion(usuarioGuardado)
        }


        val btnRegistrarse = findViewById<Button>(R.id.idBtnRegistrarse)
        val btnIniciarSesion = findViewById<Button>(R.id.idBtnIniciarSesion)

        btnRegistrarse.setOnClickListener { navigateToRegister() }

        btnIniciarSesion.setOnClickListener {
            if (EtUsuario.text.isNullOrEmpty() || EtPass.text.isNullOrEmpty()) {
                Toast.makeText(this, "Completar Datos", Toast.LENGTH_SHORT).show()
            } else {
                login(EtUsuario.text.toString(), EtPass.text.toString())
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.item_temperatura) {

            Toast.makeText(this, "La temperatura actual es de $rand", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun mostrarTemp():Int {
        val random = Random.nextInt(15,30)
        val valor: Int = random
        return valor
    }

    private fun login(usuario: String, password: String) {
        val db = AppDatabase.getDatabase(this)
        val usuarioDao = db.usuarioDao()

        val usuarioEncontrado = usuarioDao.login(usuario, password)

        if (usuarioEncontrado != null) {
            if (CvRecordarUsuario.isChecked) {
                val preferencias = getSharedPreferences(resources.getString(R.string.sp_credenciales), MODE_PRIVATE)
                preferencias.edit()
                    .putString(resources.getString(R.string.user1), usuario)
                    .putString(resources.getString(R.string.pass1), password)
                    .apply()
            }

            navigateToIniciarSesion(usuarioEncontrado.user)

        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
        }
    }


    private fun navigateToRegister() {
        val intentRegister = Intent(this, RegisterActivity::class.java)
        startActivity(intentRegister)
    }

    private fun navigateToIniciarSesion(usuario: String) {
        val intent = Intent(this, IniciarSesionActivity::class.java)
        intent.putExtra("NOMBRE", usuario)
        startActivity(intent)
        finish()
    }
}
