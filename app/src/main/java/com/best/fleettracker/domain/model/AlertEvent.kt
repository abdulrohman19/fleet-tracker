package com.best.fleettracker.domain.model

sealed class AlertEvent {
    object SpeedLimitExceeded : AlertEvent()
    object DoorOpenWhileMoving : AlertEvent()
    object EngineToggled : AlertEvent()
}
