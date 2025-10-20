package com.example.tp.inside.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tp.R
import com.example.tp.dtos.PostDTO
import com.google.gson.Gson

class ClimaDetalleFragment : Fragment() {

    private lateinit var tvDistritoNombre: TextView
    private lateinit var tvTemperatura: TextView
    private lateinit var tvSensacion: TextView
    private lateinit var tvDescripcion: TextView
    private lateinit var tvHumedad: TextView
    private lateinit var tvViento: TextView
    private lateinit var tvPresion: TextView
    private lateinit var tvVisibilidad: TextView
    private lateinit var tvUvIndex: TextView
    private lateinit var tvNubosidad: TextView
    private lateinit var btnVolver: Button

    companion object {
        private const val ARG_DISTRITO = "distrito"
        private const val ARG_CLIMA_DATA = "clima_data"

        fun newInstance(distrito: String, climaData: PostDTO): ClimaDetalleFragment {
            val fragment = ClimaDetalleFragment()
            val args = Bundle().apply {
                putString(ARG_DISTRITO, distrito)
                // Serializar el objeto PostDTO a JSON
                putString(ARG_CLIMA_DATA, Gson().toJson(climaData))
            }
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_clima_detalle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        cargarDatos()

        btnVolver.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    private fun initViews(view: View) {
        tvDistritoNombre = view.findViewById(R.id.tvDistritoNombre)
        tvTemperatura = view.findViewById(R.id.tvTemperatura)
        tvSensacion = view.findViewById(R.id.tvSensacion)
        tvDescripcion = view.findViewById(R.id.tvDescripcion)
        tvHumedad = view.findViewById(R.id.tvHumedad)
        tvViento = view.findViewById(R.id.tvViento)
        tvPresion = view.findViewById(R.id.tvPresion)
        tvVisibilidad = view.findViewById(R.id.tvVisibilidad)
        tvUvIndex = view.findViewById(R.id.tvUvIndex)
        tvNubosidad = view.findViewById(R.id.tvNubosidad)
        btnVolver = view.findViewById(R.id.btnVolver)
    }

    private fun cargarDatos() {
        val distrito = arguments?.getString(ARG_DISTRITO) ?: ""
        val climaJson = arguments?.getString(ARG_CLIMA_DATA) ?: ""

        val climaData = Gson().fromJson(climaJson, PostDTO::class.java)

        tvDistritoNombre.text = "📍 $distrito"
        tvTemperatura.text = "${climaData.current.temperature}°C"
        tvSensacion.text = "Sensación térmica: ${climaData.current.feelslike}°C"
        tvDescripcion.text = climaData.current.weatherDescriptions.joinToString(", ")
        tvHumedad.text = " Humedad: ${climaData.current.humidity}%"
        tvViento.text = " Viento: ${climaData.current.windSpeed} km/h ${climaData.current.windDir}"
        tvPresion.text = " Presión: ${climaData.current.pressure} mb"
        tvVisibilidad.text = " Visibilidad: ${climaData.current.visibility} km"
        tvUvIndex.text = "️ Índice UV: ${climaData.current.uvIndex}"
        tvNubosidad.text = "️ Nubosidad: ${climaData.current.cloudcover}%"
    }
}