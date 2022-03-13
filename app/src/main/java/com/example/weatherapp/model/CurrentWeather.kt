package com.example.weatherapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "currentWeather")
data class CurrentWeather(
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coord,
    val dt: Int,
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val main: Main,
    val name: String,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)