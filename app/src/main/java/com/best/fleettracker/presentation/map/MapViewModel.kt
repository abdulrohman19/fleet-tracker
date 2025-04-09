package com.best.fleettracker.presentation.map

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.best.fleettracker.domain.model.LocationPoint
import com.best.fleettracker.domain.usecase.GetVehicleLocationUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(
    private val getVehicleLocationUseCase: GetVehicleLocationUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(MapState())
    val state: StateFlow<MapState> = _state

    init {
        viewModelScope.launch {
            getVehicleLocationUseCase().collect { location ->
                _state.update { it.copy(currentLocation = location) }
            }
        }
    }
}
