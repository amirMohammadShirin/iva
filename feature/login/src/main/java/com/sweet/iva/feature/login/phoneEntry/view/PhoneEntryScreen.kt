package com.sweet.iva.feature.login.phoneEntry.view

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.sweet.iva.core.ui.navigation.ApplicationRoutes
import com.sweet.iva.core.ui.view.BaseScreen
import com.sweet.iva.feature.login.phoneEntry.model.PhoneEntryAction
import com.sweet.iva.feature.login.phoneEntry.model.PhoneEntryEvent
import com.sweet.iva.feature.login.phoneEntry.model.PhoneEntryUiModel
import com.sweet.iva.feature.login.phoneEntry.viewmodel.PhoneEntryViewModel

/**
 * Created by aShirin on 6/9/2024.
 */
class PhoneEntryScreen : BaseScreen<PhoneEntryUiModel, PhoneEntryAction, PhoneEntryEvent>(
    name = "ورود",
    route = ApplicationRoutes.loginEntryScreenRoute
) {
    @Composable
    override fun viewModel(): PhoneEntryViewModel = hiltViewModel()

    @Composable
    override fun Content(state: PhoneEntryUiModel) {

    }

}