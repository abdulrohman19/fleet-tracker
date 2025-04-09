package com.best.fleettracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.best.fleettracker.presentation.navigation.FleetNavHost
import com.best.fleettracker.ui.theme.FleetTrackerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FleetTrackerApp()
        }
    }
}

@Composable
fun FleetTrackerApp() {
    FleetTrackerTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            FleetNavHost()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FleetTrackerApp()
}
