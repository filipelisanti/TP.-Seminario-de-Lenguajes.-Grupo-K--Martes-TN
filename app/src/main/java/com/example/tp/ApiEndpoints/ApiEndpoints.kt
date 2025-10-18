package com.example.restapi.endpoints

import com.example.tp.dtos.PostDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiEndpoints {

    @GET("/posts")
    fun getPosts(): Call<List<PostDTO>>

    @GET("current")
    fun getCurrentWeather(
        @Query("access_key") accessKey: String,
        @Query("query") query: String
    ): Call<PostDTO>
}