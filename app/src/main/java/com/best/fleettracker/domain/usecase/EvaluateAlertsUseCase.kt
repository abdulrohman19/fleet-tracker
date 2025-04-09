package com.best.fleettracker.domain.usecase

import com.best.fleettracker.domain.model.AlertEvent
import com.best.fleettracker.domain.model.SensorData

class EvaluateAlertsUseCase {

    operator fun invoke(sensorData: SensorData): List<AlertEvent> {
        val alerts = mutableListOf<AlertEvent>()

        if (sensorData.speed > 80) {
            alerts.add(AlertEvent.SpeedLimitExceeded)
        }

        if (sensorData.doorOpen && sensorData.speed > 0) {
            alerts.add(AlertEvent.DoorOpenWhileMoving)
        }

        alerts.add(AlertEvent.EngineToggled)

        return alerts
    }
}
