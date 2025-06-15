package com.example.koin_with_compose.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.koin_with_compose.core.presentation.ui.theme.KoinWithComposeTheme
import com.example.koin_with_compose.feature.presentation.FeatureScreen
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KoinWithComposeTheme {
                val mainViewModel: MainViewModel = koinViewModel()
                FeatureScreen()
            }
        }
    }
}
