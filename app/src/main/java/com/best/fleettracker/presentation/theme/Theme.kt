package com.best.fleettracker.presentation.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun FleetTrackerTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(),
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
