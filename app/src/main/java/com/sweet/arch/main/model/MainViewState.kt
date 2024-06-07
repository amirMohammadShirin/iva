package com.sweet.arch.main.model

import com.sweet.arch.DarkThemeConfig
import com.sweet.arch.ThemeBrand
import com.sweet.arch.core.ui.model.IViewState

internal data class MainViewState(
    val loading: Boolean = true,
    val darkThemeConfig: DarkThemeConfig = DarkThemeConfig.FOLLOW_SYSTEM,
    val themeBrand: ThemeBrand = ThemeBrand.DEFAULT,
    val useDynamicColor: Boolean = false,
) : IViewState
