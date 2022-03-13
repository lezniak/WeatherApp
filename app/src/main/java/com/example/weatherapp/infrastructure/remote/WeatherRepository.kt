package com.example.weatherapp.infrastructure.remote

import android.util.Log
import com.example.weatherapp.model.CurrentWeather
import retrofit2.Call
import com.example.weatherapp.infrastructure.remote.WeatherInterface
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val weatherInterface: WeatherInterface) {
    val API_KEY = "fac565ced28e4a7a90693b755b35b12a"
    fun makeApiCall(query: String){
        val call : Call<CurrentWeather> = weatherInterface.getCurrentWeather(query,API_KEY)
        call?.enqueue(object :Callback<CurrentWeather>{
            override fun onResponse(
                call: Call<CurrentWeather>?,
                response: Response<CurrentWeather>?
            ) {
                if(response!!.isSuccessful){
                    Log.d("TEST",response.body().name)
                }
            }

            override fun onFailure(call: Call<CurrentWeather>?, t: Throwable?) {
                Log.d("TAg","BLAD")
            }

        })
    }
}