package com.best.fleettracker.presentation.component

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import com.best.fleettracker.domain.model.SensorData

@Composable
fun SensorDashboard(data: SensorData) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        SpeedCard(data.speed)
        EngineStatus(data.engineOn)
        DoorStatus(data.doorOpen)
    }
}
