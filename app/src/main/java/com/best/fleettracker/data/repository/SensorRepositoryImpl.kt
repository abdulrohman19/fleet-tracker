package com.best.fleettracker.data.repository

import com.best.fleettracker.data.source.local.SensorDataSimulator
import com.best.fleettracker.domain.model.SensorData
import com.best.fleettracker.domain.repository.SensorRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SensorRepositoryImpl(
    private val simulator: SensorDataSimulator
) : SensorRepository {
    override fun getSensorDataStream(): Flow<SensorData> {
        return simulator.sensorDataFlow.map { dto ->
            SensorData(
                speed = dto.speed,
                engineOn = dto.engineOn,
                doorOpen = dto.doorOpen,
                timestamp = dto.timestamp
            )
        }
    }
}
