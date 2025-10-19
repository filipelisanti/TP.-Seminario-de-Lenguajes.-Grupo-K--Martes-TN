package com.example.tp.inside

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.restapi.endpoints.ApiEndpoints
import com.example.tp.LoginActivity
import com.example.tp.R
import com.example.tp.configurations.RetrofitClient
import com.example.tp.dtos.PostDTO
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class IniciarSesionActivity : AppCompatActivity() {

    // TextViews para cada distrito
    private lateinit var tvEstadoCarga: TextView
    private lateinit var tvLanus: TextView
    private lateinit var tvLomasDeZamora: TextView
    private lateinit var tvQuilmes: TextView
    private lateinit var tvAvellaneda: TextView
    private lateinit var tvTemperley: TextView
    private lateinit var tvPalermo: TextView
    private lateinit var tvNunez: TextView
    private lateinit var tvPuertoMadero: TextView
    private lateinit var tvRetiro: TextView
    private lateinit var tvBanfield: TextView

    private var completedCalls = 0
    private var successfulCalls = 0

    // Lista de distritos y sus TextViews correspondientes
    private data class DistritoView(
        val nombre: String,
        var textView: TextView? = null
    )

    private val distritos = mutableListOf(
        DistritoView("Lanús"),
        DistritoView("Lomas de Zamora"),
        DistritoView("Quilmes"),
        DistritoView("Avellaneda"),
        DistritoView("Temperley"),
        DistritoView("Palermo"),
        DistritoView("Núñez"),
        DistritoView("Puerto Madero"),
        DistritoView("Retiro"),
        DistritoView("Banfield")
    )

    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_iniciarsesion)

        // Inicializar TextViews
        tvEstadoCarga = findViewById(R.id.tvEstadoCarga)
        tvLanus = findViewById(R.id.tvLanus)
        tvLomasDeZamora = findViewById(R.id.tvLomasDeZamora)
        tvQuilmes = findViewById(R.id.tvQuilmes)
        tvAvellaneda = findViewById(R.id.tvAvellaneda)
        tvTemperley = findViewById(R.id.tvTemperley)
        tvPalermo = findViewById(R.id.tvPalermo)
        tvNunez = findViewById(R.id.tvNunez)
        tvPuertoMadero = findViewById(R.id.tvPuertoMadero)
        tvRetiro = findViewById(R.id.tvRetiro)
        tvBanfield = findViewById(R.id.tvBanfield)

        // Asignar TextViews a los distritos
        distritos[0].textView = tvLanus
        distritos[1].textView = tvLomasDeZamora
        distritos[2].textView = tvQuilmes
        distritos[3].textView = tvAvellaneda
        distritos[4].textView = tvTemperley
        distritos[5].textView = tvPalermo
        distritos[6].textView = tvNunez
        distritos[7].textView = tvPuertoMadero
        distritos[8].textView = tvRetiro
        distritos[9].textView = tvBanfield

        val btnSalir = findViewById<Button>(R.id.idBtnSalir)
        btnSalir.setOnClickListener {
            cerrarSesion()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("API_TEST", "🔍 Iniciando llamadas a la API para ${distritos.size} distritos...")
        tvEstadoCarga.text = "Cargando datos de ${distritos.size} distritos..."

        // Hacer llamadas con delay de 6 segundos entre cada una
        distritos.forEachIndexed { index, distrito ->
            handler.postDelayed({
                obtenerClimaDistrito(distrito, index)
            }, index * 6000L)
        }
    }

    private fun obtenerClimaDistrito(distrito: DistritoView, position: Int) {
        val api = RetrofitClient.retrofit.create(ApiEndpoints::class.java)
        val callGetPost = api.getCurrentWeather(
            apiKey = "30520112e4ff38f7c0c74e00412c3f50",
            location = "${distrito.nombre}, Buenos Aires"
        )

        Log.d("API_TEST", "📡 Llamada ${position + 1}/10 iniciada para: ${distrito.nombre}")

        callGetPost.enqueue(object : Callback<PostDTO> {
            override fun onResponse(call: Call<PostDTO>, response: Response<PostDTO>) {
                runOnUiThread {
                    if (response.isSuccessful) {
                        val post = response.body()
                        if (post != null) {
                            val climaResumen = """
                                🌡️ ${post.current.temperature}°C (Sensación: ${post.current.feelslike}°C)
                                ☁️ ${post.current.weatherDescriptions.joinToString()}
                                💧 Humedad: ${post.current.humidity}%
                                💨 Viento: ${post.current.windSpeed} km/h ${post.current.windDir}
                            """.trimIndent()

                            distrito.textView?.text = climaResumen
                            successfulCalls++
                            Log.d("API_TEST", "✅ Datos recibidos para ${distrito.nombre}")
                        } else {
                            distrito.textView?.text = "❌ No se recibieron datos"
                            Log.e("API_TEST", "❌ Body null para ${distrito.nombre}")
                        }
                    } else {
                        val errorBody = response.errorBody()?.string()
                        distrito.textView?.text = "❌ Error ${response.code()}"

                        Log.e("API_TEST", "❌ Error ${response.code()} para ${distrito.nombre}")
                        Log.e("API_TEST", "Error body: $errorBody")
                    }

                    actualizarEstado()
                }
            }

            override fun onFailure(call: Call<PostDTO>, t: Throwable) {
                runOnUiThread {
                    distrito.textView?.text = "❌ Error de conexión"

                    Log.e("API_TEST", "❌ Error de conexión en ${distrito.nombre}")
                    Log.e("API_TEST", "Mensaje: ${t.message}")
                    t.printStackTrace()

                    actualizarEstado()
                }
            }
        })
    }

    private fun actualizarEstado() {
        completedCalls++
        tvEstadoCarga.text = "Cargados: $completedCalls/${distritos.size} | Exitosos: $successfulCalls"

        if (completedCalls == distritos.size) {
            Log.d("API_TEST", "✅ Todas las llamadas completadas: $successfulCalls exitosas de ${distritos.size}")
            tvEstadoCarga.text = "✅ Carga completa: $successfulCalls/${distritos.size} distritos"
        }
    }

    private fun cerrarSesion() {
        Log.d("SESION", "Cerrando sesión...")

        // 1. Borrar SharedPreferences (usando el MISMO nombre que en LoginActivity)
        val preferencias = getSharedPreferences(getString(R.string.sp_credenciales), Context.MODE_PRIVATE)
        val editor = preferencias.edit()
        editor.clear()
        editor.apply()

        Log.d("SESION", "SharedPreferences borrado")

        // 2. Ir al LoginActivity y limpiar el stack de activities
        val intent = Intent(this, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)

        // 3. Cerrar esta activity
        finish()

        Log.d("SESION", "Redirigido a LoginActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}