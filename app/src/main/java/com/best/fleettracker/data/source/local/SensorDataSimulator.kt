package com.best.fleettracker.data.source.local

import com.best.fleettracker.data.model.SensorDataDto
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

class SensorDataSimulator {

    val sensorDataFlow: Flow<SensorDataDto> = flow {
        while (true) {
            delay(2000) // update every 2 seconds

            emit(
                SensorDataDto(
                    speed = Random.nextInt(0, 120),
                    engineOn = Random.nextBoolean(),
                    doorOpen = Random.nextBoolean(),
                    timestamp = System.currentTimeMillis()
                )
            )
        }
    }
}
