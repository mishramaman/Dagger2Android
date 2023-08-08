package com.example.dagger2

import android.util.Log

interface AnalyticalService {
    fun trackEvent(eventName:String,eventType:String)
}

class MixPanel():AnalyticalService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG,"Mixpanel - $eventName - $eventType")
    }
}

class Firebase():AnalyticalService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG,"Firebase -$eventName-$eventType")
    }
}