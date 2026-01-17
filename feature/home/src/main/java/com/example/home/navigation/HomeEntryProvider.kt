package com.example.home.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.home.HomeScreen
import com.example.navigation.Navigator

fun EntryProviderScope<NavKey>.homeEntryProvider(navigator: Navigator) {
    entry<HomeNavKey> {
        HomeScreen (
            onBackClick = { navigator.goBack() },
        )
    }
}