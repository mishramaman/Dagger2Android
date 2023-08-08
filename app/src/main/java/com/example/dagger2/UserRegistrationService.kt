package com.example.dagger2

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

class UserRegistrationService @Inject constructor(@SQLQualifier private val userRepository:UserRepository,
                                                 @MessageQualifier private val notificationService:NotificationService)
{
    fun saveuser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send("mihsuhysatft@gmail.com","Aman@gmail.com","HI THERE")
    }
}