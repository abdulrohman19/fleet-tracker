package com.best.fleettracker.presentation.alert

import com.best.fleettracker.domain.model.SensorData

fun evaluateAlert(sensorData: SensorData): List<AlertEvent> {
    val alerts = mutableListOf<AlertEvent>()

    if (sensorData.speed > 80) alerts.add(AlertEvent.SpeedLimitExceeded)
    if (sensorData.doorOpen && sensorData.speed > 0) alerts.add(AlertEvent.DoorOpenWhileMoving)
    if (!sensorData.engineOn && sensorData.speed > 0) alerts.add(AlertEvent.EngineOffWhileMoving)

    return alerts
}
