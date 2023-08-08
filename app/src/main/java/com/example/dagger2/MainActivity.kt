package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject
import javax.inject.Singleton

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    @Inject
    lateinit var userRegistrationService: UserRegistrationService
    @Inject
    lateinit var emailService: EmailService
    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val component=DaggerUserRegistrationComponent.factory().create(3,"Aman Mishra")
            //.notificationServiceModule(NotificationServiceModule(3))
           // .userRepositoryModule( UserRepositoryModule("Aman") )

        val component=(actionBar as MyApplication).UserRegistrationComponent
        component.inject(this)




        userRegistrationService.saveuser("mihsrtf","agysgtysgy")
       emailService.send("hshgsyucg","vgvcgdsgc","bcdcgfdscsgcv")
        emailService1.send("hshgsyucg","vgvcgdsgc","bcdcgfdscsgcv")


    }
}