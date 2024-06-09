package com.sweet.iva.feature.login.phoneEntry.viewmodel

import com.sweet.iva.core.ui.viewmodel.BaseViewModel
import com.sweet.iva.feature.login.phoneEntry.model.PhoneEntryAction
import com.sweet.iva.feature.login.phoneEntry.model.PhoneEntryEvent
import com.sweet.iva.feature.login.phoneEntry.model.PhoneEntryUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by aShirin on 6/9/2024.
 */
@HiltViewModel
class PhoneEntryViewModel @Inject constructor(

) : BaseViewModel<PhoneEntryUiModel, PhoneEntryAction, PhoneEntryEvent>(initialState = PhoneEntryUiModel()) {
    override fun handleAction(action: PhoneEntryAction) {

    }

}