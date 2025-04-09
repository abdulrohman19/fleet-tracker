package com.best.fleettracker.presentation.component

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpeedCard(speed: Int) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text("Speed", style = MaterialTheme.typography.labelLarge)
            Text("$speed km/h", style = MaterialTheme.typography.headlineMedium)
        }
    }
}
