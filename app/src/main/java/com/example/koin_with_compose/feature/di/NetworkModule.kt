package com.example.koin_with_compose.feature.di

import com.example.koin_with_compose.feature.data.api.SomeApi
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {
    @Single
    fun provideApi(): SomeApi {
        return Retrofit.Builder()
            .baseUrl(SomeApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SomeApi::class.java)
    }
}