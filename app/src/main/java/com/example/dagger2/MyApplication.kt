package com.example.dagger2

import android.app.Application
import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton

class MyApplication:Application() {
    @Singleton
    @Inject
    lateinit var UserRegistrationComponent:UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()

        UserRegistrationComponent=DaggerUserRegistrationComponent.factory().create(3,"Aman")


    }
}


@Component
interface ApplicationComponent {

}