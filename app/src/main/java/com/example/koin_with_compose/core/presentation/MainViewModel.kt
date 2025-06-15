package com.example.koin_with_compose.core.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.koin_with_compose.feature.domain.Repository
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel
import org.koin.core.annotation.Named

@KoinViewModel
class MainViewModel(
    @Named("RepositoryCashImpl")
    private val repository: Repository
) : ViewModel() {
    init {
        viewModelScope.launch {
            println("we got mainViewModel: ${repository.getData()}")
        }
    }
}