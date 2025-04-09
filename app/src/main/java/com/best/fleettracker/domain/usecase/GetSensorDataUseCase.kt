package com.best.fleettracker.domain.usecase

import com.best.fleettracker.domain.model.SensorData
import com.best.fleettracker.domain.repository.SensorRepository
import kotlinx.coroutines.flow.Flow

class GetSensorDataUseCase(
    private val repository: SensorRepository
) {
    operator fun invoke(): Flow<SensorData> = repository.getSensorDataStream()
}
