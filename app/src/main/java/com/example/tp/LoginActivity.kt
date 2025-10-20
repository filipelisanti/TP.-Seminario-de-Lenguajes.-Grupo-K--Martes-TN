package com.example.tp

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.edit
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp.inside.AppDatabase
import com.example.tp.inside.IniciarSesionActivity
import com.example.tp.inside.RegisterActivity
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

        createNotificationChannel()

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

        val preferencias = getSharedPreferences(getString(R.string.sp_credenciales), MODE_PRIVATE)
        val usuarioGuardado = preferencias.getString(getString(R.string.user1), "")
        val passGuardado = preferencias.getString(getString(R.string.pass1), "")

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

    private var pendingUsername: String? = null

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == 101) {
            val username = pendingUsername
            pendingUsername = null

            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                mostrarNotificacionRecordarUsuario()
                Handler(Looper.getMainLooper()).postDelayed({
                    username?.let { navigateToIniciarSesion(it) }
                }, 500)
            } else {
                Toast.makeText(this, "Permiso de notificaciones denegado", Toast.LENGTH_SHORT).show()
                username?.let { navigateToIniciarSesion(it) }
            }
        }
    }

    private fun mostrarTemp(): Int = Random.nextInt(15, 30)

    private fun login(usuario: String, password: String) {
        val db = AppDatabase.getDatabase(this)
        val usuarioDao = db.usuarioDao()

        val usuarioEncontrado = usuarioDao.login(usuario, password)

        if (usuarioEncontrado != null) {
            if (CvRecordarUsuario.isChecked) {
                val preferencias = getSharedPreferences(getString(R.string.sp_credenciales), MODE_PRIVATE)
                preferencias.edit {
                    putString(getString(R.string.user1), usuario)
                    putString(getString(R.string.pass1), password)
                }


                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    if (checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS)
                        != PackageManager.PERMISSION_GRANTED
                    ) {

                        pendingUsername = usuarioEncontrado.user
                        requestPermissions(arrayOf(android.Manifest.permission.POST_NOTIFICATIONS), 101)
                        return
                    }
                }


                mostrarNotificacionRecordarUsuario()
                Handler(Looper.getMainLooper()).postDelayed({
                    navigateToIniciarSesion(usuarioEncontrado.user)
                }, 500)
            } else {

                navigateToIniciarSesion(usuarioEncontrado.user)
            }
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

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "CANAL_RECORDAR",
                "Recordar Usuario",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "Canal para notificaciones de recordar usuario"
                enableLights(true)
                enableVibration(true)
            }
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun mostrarNotificacionRecordarUsuario() {
        val builder = NotificationCompat.Builder(this, "CANAL_RECORDAR")
            .setSmallIcon(R.drawable.weather)
            .setContentTitle("Se activó el Recordar Usuario")
            .setContentText("Tu usuario y contraseña serán recordados.")
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)

        with(NotificationManagerCompat.from(this)) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU ||
                checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS)
                == PackageManager.PERMISSION_GRANTED) {
                notify(1001, builder.build())
            }
        }
    }

}