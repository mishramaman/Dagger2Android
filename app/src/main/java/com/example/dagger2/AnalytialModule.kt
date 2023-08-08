package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class AnalytialModule {
    @Provides
    fun getAnalyticalService():AnalyticalService{
        return MixPanel()
    }
}