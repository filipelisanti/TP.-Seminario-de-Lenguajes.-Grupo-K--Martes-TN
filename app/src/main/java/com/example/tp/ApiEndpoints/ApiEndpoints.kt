package com.example.restapi.endpoints

import com.example.tp.dtos.PostDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiEndpoints {
    @GET("current")
    fun getCurrentWeather(
        @Query("access_key") apiKey: String,
        @Query("query") location: String
    ): Call<PostDTO>
}