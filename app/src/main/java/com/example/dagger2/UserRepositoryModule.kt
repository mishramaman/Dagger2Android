package com.example.dagger2

import dagger.Module
import dagger.Provides


@Module
class UserRepositoryModule() {
    //Modules are created for abstract classes or interfaces to tell how the object will be created using provider//

    @FirebaseQualifier
    @Provides
    fun getFirebase():UserRepository {
        return FirebaseRepository()
    }
    @SQLQualifier
    @Provides
    fun getSQLRepo():UserRepository{
        return SQLRepository()
    }

}