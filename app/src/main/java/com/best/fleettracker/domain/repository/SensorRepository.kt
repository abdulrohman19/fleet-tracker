package com.best.fleettracker.domain.repository

import com.best.fleettracker.domain.model.SensorData
import com.best.fleettracker.domain.model.LocationPoint
import kotlinx.coroutines.flow.Flow

interface SensorRepository {
    fun getSensorDataStream(): Flow<SensorData>
    fun getVehicleLocationStream(): Flow<LocationPoint>
}
