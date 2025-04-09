package com.best.fleettracker.presentation.map

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.android.gms.maps.model.LatLng
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MapScreen(viewModel: MapViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsState()

    GoogleMap(modifier = Modifier.fillMaxSize()) {
        Marker(
            position = LatLng(state.currentLocation.latitude, state.currentLocation.longitude),
            title = "Vehicle"
        )
    }
}
