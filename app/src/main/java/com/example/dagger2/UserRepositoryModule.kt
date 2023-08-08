package com.example.dagger2

import dagger.Module
import dagger.Provides


@Module
class UserRepositoryModule() {

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