package com.sweet.arch.main.viewmodel

import androidx.lifecycle.viewModelScope
import com.sweet.arch.core.ui.viewmodel.BaseViewModel
import com.sweet.arch.main.model.MainAction
import com.sweet.arch.main.model.MainEvent
import com.sweet.arch.main.model.MainViewState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject


internal class MainViewModel @Inject constructor() :
    BaseViewModel<MainViewState, MainAction, MainEvent>(
        initialState = MainViewState()
    ) {

    override fun handleAction(action: MainAction) {
        when (action) {
            is MainAction.FetchStartUpData -> {
                callApi()
            }
        }
    }

    fun getStartupData() {
        process(MainAction.FetchStartUpData)
    }

    private fun callApi() {
        viewModelScope.launch(Dispatchers.IO) {
            delay(1000)
            updateState(this@MainViewModel::mutateToShowContent)
        }
    }

    private fun mutateToShowContent(currentState: MainViewState) =
        currentState.copy(loading = false)

}

