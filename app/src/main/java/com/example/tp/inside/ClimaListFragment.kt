package com.example.tp.inside.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.restapi.endpoints.ApiEndpoints
import com.example.tp.R
import com.example.tp.configurations.RetrofitClient
import com.example.tp.dtos.PostDTO
import com.example.tp.inside.IniciarSesionActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class ClimaListFragment : Fragment() {

    private lateinit var tvEstadoCarga: TextView
    private lateinit var btnSalir: Button

    private var completedCalls = 0
    private var successfulCalls = 0

    private data class DistritoView(
        val nombre: String,
        var textView: TextView? = null,
        var button: Button? = null,
        var card: CardView? = null,
        var climaData: PostDTO? = null
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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_clima_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        initViews(view)


        setupListeners()


        cargarTodosLosClimas()
    }

    private fun initViews(view: View) {
        tvEstadoCarga = view.findViewById(R.id.tvEstadoCarga)
        btnSalir = view.findViewById(R.id.idBtnSalir)


        distritos[0].apply {
            textView = view.findViewById(R.id.tvLanus)
            button = view.findViewById(R.id.btnVerMasLanus)
            card = view.findViewById(R.id.cardLanus)
        }
        distritos[1].apply {
            textView = view.findViewById(R.id.tvLomasDeZamora)
            button = view.findViewById(R.id.btnVerMasLomas)
            card = view.findViewById(R.id.cardLomas)
        }
        distritos[2].apply {
            textView = view.findViewById(R.id.tvQuilmes)
            button = view.findViewById(R.id.btnVerMasQuilmes)
            card = view.findViewById(R.id.cardQuilmes)
        }
        distritos[3].apply {
            textView = view.findViewById(R.id.tvAvellaneda)
            button = view.findViewById(R.id.btnVerMasAvellaneda)
            card = view.findViewById(R.id.cardAvellaneda)
        }
        distritos[4].apply {
            textView = view.findViewById(R.id.tvTemperley)
            button = view.findViewById(R.id.btnVerMasTemperley)
            card = view.findViewById(R.id.cardTemperley)
        }
        distritos[5].apply {
            textView = view.findViewById(R.id.tvPalermo)
            button = view.findViewById(R.id.btnVerMasPalermo)
            card = view.findViewById(R.id.cardPalermo)
        }
        distritos[6].apply {
            textView = view.findViewById(R.id.tvNunez)
            button = view.findViewById(R.id.btnVerMasNunez)
            card = view.findViewById(R.id.cardNunez)
        }
        distritos[7].apply {
            textView = view.findViewById(R.id.tvPuertoMadero)
            button = view.findViewById(R.id.btnVerMasPuertoMadero)
            card = view.findViewById(R.id.cardPuertoMadero)
        }
        distritos[8].apply {
            textView = view.findViewById(R.id.tvRetiro)
            button = view.findViewById(R.id.btnVerMasRetiro)
            card = view.findViewById(R.id.cardRetiro)
        }
        distritos[9].apply {
            textView = view.findViewById(R.id.tvBanfield)
            button = view.findViewById(R.id.btnVerMasBanfield)
            card = view.findViewById(R.id.cardBanfield)
        }
    }

    private fun setupListeners() {
        btnSalir.setOnClickListener {
            (activity as? IniciarSesionActivity)?.cerrarSesion()
        }


        distritos.forEachIndexed { index, distrito ->
            distrito.button?.setOnClickListener {
                distrito.climaData?.let { clima ->
                    abrirDetalleDistrito(distrito.nombre, clima)
                }
            }
        }
    }


    private fun cargarTodosLosClimas() {
        Log.d("API_TEST", " Iniciando carga de ${distritos.size} distritos con Coroutines...")
        tvEstadoCarga.text = "Cargando datos de ${distritos.size} distritos..."

        // Reiniciar contadores
        completedCalls = 0
        successfulCalls = 0
        viewLifecycleOwner.lifecycleScope.launch {
            distritos.forEachIndexed { index, distrito ->

                delay(index * 3000L)

                obtenerClimaDistrito(distrito, index)
            }
        }
    }

    private suspend fun obtenerClimaDistrito(distrito: DistritoView, position: Int) {
        try {
            Log.d("API_TEST", " Llamada ${position + 1}/10 iniciada para: ${distrito.nombre}")


            val response: Response<PostDTO> = withContext(Dispatchers.IO) {
                val api = RetrofitClient.retrofit.create(ApiEndpoints::class.java)
                api.getCurrentWeather(
                    apiKey = "8f135b552ef7865374c89f7cd38b926e",
                    location = "${distrito.nombre}, Buenos Aires"
                ).execute()
            }


            if (response.isSuccessful) {
                val post = response.body()
                if (post != null) {
                    distrito.climaData = post

                    val climaResumen = """
                         ${post.current.temperature}°C (Sensación: ${post.current.feelslike}°C)
                         ${post.current.weatherDescriptions.joinToString()}
                         Humedad: ${post.current.humidity}%
                         Viento: ${post.current.windSpeed} km/h ${post.current.windDir}
                    """.trimIndent()

                    distrito.textView?.text = climaResumen
                    distrito.button?.isEnabled = true
                    successfulCalls++

                    Log.d("API_TEST", " Datos recibidos para ${distrito.nombre}")
                } else {
                    distrito.textView?.text = " No se recibieron datos"
                    distrito.button?.isEnabled = false
                    Log.e("API_TEST", " Body null para ${distrito.nombre}")
                }
            } else {
                val errorBody = response.errorBody()?.string()
                distrito.textView?.text = " Error ${response.code()}"
                distrito.button?.isEnabled = false

                Log.e("API_TEST", " Error ${response.code()} para ${distrito.nombre}")
                Log.e("API_TEST", "Error body: $errorBody")
            }

        } catch (e: Exception) {
            distrito.textView?.text = " Error de conexión"
            distrito.button?.isEnabled = false

            Log.e("API_TEST", " Error de conexión en ${distrito.nombre}")
            Log.e("API_TEST", "Mensaje: ${e.message}")
            e.printStackTrace()
        } finally {
            actualizarEstado()
        }
    }

    private fun actualizarEstado() {
        completedCalls++
        val estadoTexto = "Cargados: $completedCalls/${distritos.size} | Exitosos: $successfulCalls"
        tvEstadoCarga.text = estadoTexto

        Log.d("API_TEST", " Estado: $estadoTexto")

        if (completedCalls == distritos.size) {
            Log.d("API_TEST", " Todas las llamadas completadas: $successfulCalls exitosas de ${distritos.size}")
            tvEstadoCarga.text = " Carga completa: $successfulCalls/${distritos.size} distritos"
        }
    }

    private fun abrirDetalleDistrito(nombreDistrito: String, climaData: PostDTO) {
        val detalleFragment = ClimaDetalleFragment.newInstance(nombreDistrito, climaData)

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, detalleFragment)
            .addToBackStack(null)
            .commit()
    }
}