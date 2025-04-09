package com.best.fleettracker.presentation.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.best.fleettracker.presentation.component.SensorDashboard

@Composable
fun DashboardScreen(viewModel: DashboardViewModel = hiltViewModel()) {
    val sensorData by viewModel.sensorData.collectAsState()

    Column(Modifier.padding(16.dp)) {
        sensorData?.let {
            SensorDashboard(it)
        }
    }
}
