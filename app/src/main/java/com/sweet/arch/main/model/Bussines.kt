package com.sweet.arch.main.model

import com.sweet.arch.core.ui.model.IAction
import com.sweet.arch.core.ui.model.IEvent
import com.sweet.arch.core.ui.model.IMutation


internal sealed interface MainAction : IAction {
    data object FetchStartUpData : MainAction
}

internal sealed interface MainMutation : IMutation {
    data object StartUpDataFetched : MainMutation
}

internal sealed interface MainEvent : IEvent