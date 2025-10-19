package com.example.tp.inside

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.restapi.endpoints.ApiEndpoints
import com.example.tp.R
import com.example.tp.configurations.RetrofitClient
import com.example.tp.dtos.PostDTO
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class pruebaApiActivity : AppCompatActivity() {

    private lateinit var tvServicioRest: TextView

    // Usamos un mapa para evitar duplicados
    private val weatherData = LinkedHashMap<String, String>()
    private var completedCalls = 0

    // Lista de 10 distritos de Buenos Aires y alrededores
    private val distritos = listOf(
        "Lanús",
        "Lomas de Zamora",
        "Quilmes",
        "Avellaneda",
        "Temperley",
        "Palermo",
        "Núñez",
        "Puerto Madero",
        "Retiro",
        "Banfield"
    )

    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prueba_api)

        tvServicioRest = findViewById(R.id.tvServicioRest)
        tvServicioRest.text = "Cargando datos de ${distritos.size} distritos de Buenos Aires..."

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("API_TEST", "Iniciando llamadas a la API para ${distritos.size} distritos...")

        // Hacer llamadas con delay de 3 segundos entre cada una
        distritos.forEachIndexed { index, distrito ->
            handler.postDelayed({
                obtenerClimaDistrito(distrito)
            }, index * 3000L) // 3000ms = 3 segundos de delay
        }
    }

    private fun obtenerClimaDistrito(distritoOriginal: String) {
        val api = RetrofitClient.retrofit.create(ApiEndpoints::class.java)
        val callGetPost = api.getCurrentWeather(
            apiKey = "119fa73415389902336034b0e5a83304",
            location = "$distritoOriginal, Buenos Aires"
        )

        callGetPost.enqueue(object : Callback<PostDTO> {
            override fun onResponse(call: Call<PostDTO>, response: Response<PostDTO>) {
                runOnUiThread {
                    if (response.isSuccessful) {
                        val post = response.body()
                        if (post != null) {
                            val weatherInfo = """
                                
                                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                                📍 $distritoOriginal
                                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                                🌡️ Temperatura: ${post.current.temperature}°C (Sensación: ${post.current.feelslike}°C)
                                ☁️ Clima: ${post.current.weatherDescriptions.joinToString()}
                                💧 Humedad: ${post.current.humidity}%
                                💨 Viento: ${post.current.windSpeed} km/h ${post.current.windDir}
                                👁️ Visibilidad: ${post.current.visibility} km
                                🕐 Hora: ${post.location.localtime}
                                
                            """.trimIndent()

                            // Usar el nombre ORIGINAL como clave única
                            weatherData[distritoOriginal] = weatherInfo
                            Log.d("API_TEST", "✅ Datos recibidos para $distritoOriginal (API dice: ${post.location.name})")
                        } else {
                            weatherData[distritoOriginal] = "\n❌ $distritoOriginal: No se recibieron datos\n"
                            Log.e("API_TEST", "❌ Body null para $distritoOriginal")
                        }
                    } else {
                        val errorBody = response.errorBody()?.string()
                        weatherData[distritoOriginal] = "\n❌ $distritoOriginal: Error ${response.code()}\n"
                        Log.e("API_TEST", "❌ Error ${response.code()} para $distritoOriginal: $errorBody")
                    }

                    actualizarPantalla()
                }
            }

            override fun onFailure(call: Call<PostDTO>, t: Throwable) {
                runOnUiThread {
                    weatherData[distritoOriginal] = "\n❌ $distritoOriginal: Error de conexión - ${t.message}\n"
                    Log.e("API_TEST", "❌ Error en $distritoOriginal", t)
                    actualizarPantalla()
                }
            }
        })
    }

    private fun actualizarPantalla() {
        completedCalls++

        // Contar cuántos se completaron exitosamente
        val exitosos = weatherData.values.count { !it.contains("❌") }

        // Actualizar el texto con los datos recibidos
        val header = """
            🌍 CLIMA EN BUENOS AIRES Y ALREDEDORES
            Completados: $completedCalls/${distritos.size} | Exitosos: $exitosos
            
        """.trimIndent()

        // Unir todos los valores sin duplicados
        val contenido = weatherData.values.joinToString("\n")
        tvServicioRest.text = header + contenido

        // Mensaje final cuando todas las llamadas terminaron
        if (completedCalls == distritos.size) {
            Log.d("API_TEST", "✅ Todas las llamadas completadas: $exitosos exitosas, ${distritos.size - exitosos} fallidas")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}