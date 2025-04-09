package com.best.fleettracker.domain.usecase

import com.best.fleettracker.domain.model.LocationPoint
import com.best.fleettracker.domain.repository.SensorRepository
import kotlinx.coroutines.flow.Flow

class GetVehicleLocationUseCase(
    private val repository: SensorRepository
) {
    operator fun invoke(): Flow<LocationPoint> = repository.getVehicleLocationStream()
}
