package com.example.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.setting.SettingScreen

fun EntryProviderScope<NavKey>.registerSettingEntries() {
    entry<SettingRoute> {
        SettingScreen()
    }
}