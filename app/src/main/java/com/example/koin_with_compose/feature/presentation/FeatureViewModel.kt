package com.example.koin_with_compose.feature.presentation

import androidx.lifecycle.ViewModel
import com.example.koin_with_compose.feature.domain.Repository
import org.koin.android.annotation.KoinViewModel
import org.koin.core.annotation.Named

@KoinViewModel
class FeatureViewModel(
    @Named("RepositoryImpl")
    private val repository: Repository,
) : ViewModel() {

    suspend fun getData(): String {
        return repository.getData()
    }
}