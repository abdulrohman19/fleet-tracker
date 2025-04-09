package com.best.fleettracker.util

import com.google.android.gms.maps.model.LatLng
import com.best.fleettracker.domain.model.LocationPoint

object LocationUtils {

    fun LocationPoint.toLatLng(): LatLng {
        return LatLng(this.latitude, this.longitude)
    }

    fun getDummyPath(): List<LocationPoint> {
        return listOf(
            LocationPoint(-6.2, 106.8, System.currentTimeMillis()),
            LocationPoint(-6.21, 106.81, System.currentTimeMillis()),
            LocationPoint(-6.22, 106.82, System.currentTimeMillis()),
            LocationPoint(-6.23, 106.83, System.currentTimeMillis()),
            LocationPoint(-6.24, 106.84, System.currentTimeMillis())
        )
    }
}
