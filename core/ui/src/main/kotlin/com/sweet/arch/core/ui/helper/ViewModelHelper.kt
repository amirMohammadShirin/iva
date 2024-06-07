package com.sweet.arch.core.ui.helper

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.sweet.arch.core.ui.viewmodel.BaseViewModel


@Composable
fun <STATE> BaseViewModel<STATE, *, *>.getComposableState(): State<STATE> {
    return this.uiStateFlow.collectAsStateWithLifecycle(initialValue = this.initialState)
}