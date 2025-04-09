package com.best.fleettracker.presentation.alert

sealed class AlertEvent(val message: String) {
    object SpeedLimitExceeded : AlertEvent("Speed is too high!")
    object DoorOpenWhileMoving : AlertEvent("Door is open while vehicle is moving!")
    object EngineOffWhileMoving : AlertEvent("Engine is off but speed is not zero!")
}
