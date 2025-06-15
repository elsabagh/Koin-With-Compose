package com.example.koin_with_compose.feature.data

import android.content.SharedPreferences
import com.example.koin_with_compose.feature.domain.Repository
import org.koin.core.annotation.Named
import org.koin.core.annotation.Single

@Single
@Named("RepositoryCashImpl")
class RepositoryCashImpl(
    private val preference: SharedPreferences,
) : Repository {
    override suspend fun getData(): String {
        preference
        return "data from cash"
    }
}