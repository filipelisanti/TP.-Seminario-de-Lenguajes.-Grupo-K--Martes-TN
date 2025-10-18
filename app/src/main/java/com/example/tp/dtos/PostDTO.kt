package com.example.tp.dtos

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostDTO(
    @Json(name = "request") val request: Request,
    @Json(name = "location") val location: Location,
    @Json(name = "current") val current: Current
)

@JsonClass(generateAdapter = true)
data class Request(
    @Json(name = "type") val type: String,
    @Json(name = "query") val query: String,
    @Json(name = "language") val language: String,
    @Json(name = "unit") val unit: String
)

@JsonClass(generateAdapter = true)
data class Location(
    @Json(name = "name") val name: String,
    @Json(name = "country") val country: String,
    @Json(name = "region") val region: String,
    @Json(name = "lat") val lat: String,
    @Json(name = "lon") val lon: String,
    @Json(name = "timezone_id") val timezoneId: String,
    @Json(name = "localtime") val localtime: String,
    @Json(name = "localtime_epoch") val localtimeEpoch: Long,
    @Json(name = "utc_offset") val utcOffset: String
)

@JsonClass(generateAdapter = true)
data class Current(
    @Json(name = "observation_time") val observationTime: String,
    @Json(name = "temperature") val temperature: Int,
    @Json(name = "weather_code") val weatherCode: Int,
    @Json(name = "weather_icons") val weatherIcons: List<String>,
    @Json(name = "weather_descriptions") val weatherDescriptions: List<String>,
    @Json(name = "wind_speed") val windSpeed: Int,
    @Json(name = "wind_degree") val windDegree: Int,
    @Json(name = "wind_dir") val windDir: String,
    @Json(name = "pressure") val pressure: Int,
    @Json(name = "precip") val precip: Int,
    @Json(name = "humidity") val humidity: Int,
    @Json(name = "cloudcover") val cloudcover: Int,
    @Json(name = "feelslike") val feelslike: Int,
    @Json(name = "uv_index") val uvIndex: Int,
    @Json(name = "visibility") val visibility: Int,
    @Json(name = "is_day") val isDay: String
)