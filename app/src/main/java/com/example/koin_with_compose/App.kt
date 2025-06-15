package com.example.koin_with_compose

import android.app.Application
import com.example.koin_with_compose.core.di.AppModule
import com.example.koin_with_compose.feature.di.NetworkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.ksp.generated.*

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)

            modules(
                AppModule().module,
                NetworkModule().module
            )
        }
    }
}