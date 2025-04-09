package com.best.fleettracker.util

import java.text.SimpleDateFormat
import java.util.*

fun Long.toReadableTime(): String {
    val formatter = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    return formatter.format(Date(this))
}

fun Boolean.toOnOff(): String = if (this) "ON" else "OFF"

fun Boolean.toOpenClose(): String = if (this) "OPEN" else "CLOSED"
