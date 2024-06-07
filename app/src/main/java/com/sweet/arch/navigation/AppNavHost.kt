package com.sweet.arch.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.sweet.arch.application.AppState
import com.sweet.arch.core.ui.helper.LocalNavController

@Composable
fun AppNavHost(
    appState: AppState,
    modifier: Modifier = Modifier,
    startDestination: String = ""
) {
    CompositionLocalProvider(LocalNavController provides appState.navController) {
        NavHost(
            navController = appState.navController,
            startDestination = startDestination,
            modifier = modifier
        ) {

        }
    }
}