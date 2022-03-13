package com.example.weatherapp.gui.MainScreen

import androidx.compose.runtime.saveable.rememberSaveable
import androidx.lifecycle.ViewModel
import com.example.weatherapp.infrastructure.remote.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(repository: WeatherRepository): ViewModel() {
init {
    repository.makeApiCall("London")
}
}