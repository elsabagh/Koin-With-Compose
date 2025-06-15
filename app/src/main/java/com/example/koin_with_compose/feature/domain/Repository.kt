package com.example.koin_with_compose.feature.domain

interface Repository {
    suspend fun getData(): String
}