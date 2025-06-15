package com.example.koin_with_compose.core.di

import android.content.Context
import android.content.SharedPreferences
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
@ComponentScan("com.example.koin_with_compose")
class AppModule{
    @Single
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences("my_prefs", Context.MODE_PRIVATE)
    }
}