package com.best.fleettracker.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.best.fleettracker.presentation.dashboard.DashboardScreen
import com.best.fleettracker.presentation.map.MapScreen

@Composable
fun FleetNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "dashboard") {
        composable("dashboard") {
            DashboardScreen()
        }
        composable("map") {
            MapScreen()
        }
    }
}
