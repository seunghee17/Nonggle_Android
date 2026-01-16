package com.example.nonggleresume.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.ui.graphics.vector.ImageVector

data class TopLevelNavItem(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    @StringRes val iconTextId: Int,
    @StringRes val titleTextId: Int,
)

val HOME = TopLevelNavItem(
    selectedIcon = Icons.Filled.Home,
    unselectedIcon = Icons.Outlined.Refresh,
    iconTextId = forYouR.string.feature_foryou_api_title,
    titleTextId = R.string.app_name,
)