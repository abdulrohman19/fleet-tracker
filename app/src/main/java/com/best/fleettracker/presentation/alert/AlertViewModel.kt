package com.best.fleettracker.presentation.alert

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.best.fleettracker.domain.usecase.GetSensorDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlertViewModel @Inject constructor(
    private val getSensorDataUseCase: GetSensorDataUseCase
) : ViewModel() {

    private val _alerts = MutableStateFlow<List<AlertEvent>>(emptyList())
    val alerts: StateFlow<List<AlertEvent>> = _alerts

    init {
        viewModelScope.launch {
            getSensorDataUseCase().collect { sensor ->
                _alerts.value = evaluateAlert(sensor)
            }
        }
    }
}
