package com.example.dagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface NotificationService{
    fun send(to:String,from:String,body:String)
}
@Singleton
class EmailService @Inject constructor() :NotificationService{

    override fun send(to:String, from:String, body:String){
        Log.d(TAG,"Email sent")

    }
}

class MessageService (val retryCount:Int):NotificationService{
    override fun send(to: String, from: String, body: String){
        Log.d(TAG,"message sent ---- Retry Count ${retryCount}")
    }


}