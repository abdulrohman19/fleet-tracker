package com.best.fleettracker.presentation.map

import com.best.fleettracker.domain.model.LocationPoint

data class MapState(
    val currentLocation: LocationPoint = LocationPoint(0.0, 0.0, 0L)
)
