package com.sweet.iva.core.common.dispatcher

import kotlinx.coroutines.CoroutineDispatcher

interface DispatcherProvider {

    val ui: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher

}