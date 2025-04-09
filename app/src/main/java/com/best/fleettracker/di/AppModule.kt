package com.best.fleettracker.di

import com.best.fleettracker.data.repository.FakeSensorRepository
import com.best.fleettracker.domain.repository.SensorRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSensorRepository(): SensorRepository {
        return FakeSensorRepository()
    }
}
