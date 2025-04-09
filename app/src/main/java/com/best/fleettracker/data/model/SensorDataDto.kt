package com.best.fleettracker.data.model

data class SensorDataDto(
    val speed: Int,
    val engineOn: Boolean,
    val doorOpen: Boolean,
    val timestamp: Long
)
