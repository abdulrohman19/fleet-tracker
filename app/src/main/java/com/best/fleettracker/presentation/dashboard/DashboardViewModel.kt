package com.best.fleettracker.presentation.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.best.fleettracker.domain.model.SensorData
import com.best.fleettracker.domain.usecase.GetSensorDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val getSensorDataUseCase: GetSensorDataUseCase
) : ViewModel() {

    private val _sensorData = MutableStateFlow<SensorData?>(null)
    val sensorData: StateFlow<SensorData?> = _sensorData

    init {
        viewModelScope.launch {
            getSensorDataUseCase().collect {
                _sensorData.value = it
            }
        }
    }
}
