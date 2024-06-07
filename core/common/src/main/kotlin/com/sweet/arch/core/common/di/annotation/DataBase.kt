package com.sweet.arch.core.common.di.annotation

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER)
annotation class DataBase
