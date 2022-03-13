package com.example.weatherapp.di

import com.example.weatherapp.infrastructure.remote.WeatherInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ModuleApp {
    val BASE_URL = "https://api.openweathermap.org/data/2.5/"

    @Provides
    @Singleton
    fun getRetroServiceInstance(retrofit: Retrofit): WeatherInterface{
        return retrofit.create(WeatherInterface::class.java)
    }

    @Provides
    @Singleton
    fun getRetroInstance(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}