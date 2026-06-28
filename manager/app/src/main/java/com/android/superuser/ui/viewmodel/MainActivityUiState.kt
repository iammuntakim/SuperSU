package com.android.superuser.ui.viewmodel

import androidx.compose.runtime.Immutable
import com.android.superuser.ui.UiMode
import com.android.superuser.ui.theme.AppSettings

@Immutable
data class MainActivityUiState(
    val appSettings: AppSettings,
    val pageScale: Float,
    val enableBlur: Boolean,
    val enableFloatingBottomBar: Boolean,
    val enableFloatingBottomBarBlur: Boolean,
    val uiMode: UiMode,
)
