package com.best.fleettracker.domain.model

data class SensorData(
    val speed: Int,
    val engineOn: Boolean,
    val doorOpen: Boolean,
    val timestamp: Long
)
