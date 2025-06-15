package com.example.koin_with_compose.feature.data

import com.example.koin_with_compose.feature.data.api.SomeApi
import com.example.koin_with_compose.feature.domain.Repository
import org.koin.core.annotation.Named
import org.koin.core.annotation.Single

@Single
@Named("RepositoryImpl")
class RepositoryImpl(
    private val api: SomeApi,
) : Repository {
    override suspend fun getData(): String {
        api
        return "data"
    }
}