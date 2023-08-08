package com.example.dagger2

import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class SQLQualifier()
