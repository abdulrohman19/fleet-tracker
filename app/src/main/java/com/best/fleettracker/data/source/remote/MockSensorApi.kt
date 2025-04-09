package com.best.fleettracker.data.source.remote

import com.best.fleettracker.data.model.SensorDataDto
import retrofit2.http.GET

interface MockSensorApi {
    @GET("sensor")
    suspend fun getMockSensorData(): SensorDataDto
}
