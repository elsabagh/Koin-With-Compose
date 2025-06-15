package com.example.koin_with_compose.feature.data.api

import retrofit2.http.GET

interface SomeApi {

    @GET("data")
    suspend fun getData(): String

    @GET("premium")
    suspend fun getPremiumData(): String

    companion object {
        const val BASE_URL = "https://example.com/api/"
    }
}