package com.example.koin_with_compose.feature.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import org.koin.androidx.compose.koinViewModel

@Composable
fun FeatureScreen(
    featureViewModel: FeatureViewModel = koinViewModel()
) {
    LaunchedEffect(Unit) {
        println("we got: ${featureViewModel.getData()}")
    }
}