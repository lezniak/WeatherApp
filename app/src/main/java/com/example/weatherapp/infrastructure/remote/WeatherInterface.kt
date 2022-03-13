package com.example.weatherapp.infrastructure.remote

import com.example.weatherapp.model.CurrentWeather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherInterface {

    @GET("weather")
    fun getCurrentWeather(@Query("q") city: String, @Query("appid") apiId : String) : Call<CurrentWeather>

}