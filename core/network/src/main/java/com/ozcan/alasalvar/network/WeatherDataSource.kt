package com.ozcan.alasalvar.network

import com.ozcan.alasalvar.network.model.WeatherDetailDto
import com.ozcan.alasalvar.network.model.WeatherDto

interface WeatherDataSource {
    suspend fun getWeatherData(
        cityName: String?,
        lat: Double?,
        lon: Double?,
    ): WeatherDto

    suspend fun getWeatherDetail(lat: Double, lon: Double): WeatherDetailDto
}