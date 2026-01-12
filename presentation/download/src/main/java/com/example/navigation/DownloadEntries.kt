package com.example.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.download.DownloadScreen

fun EntryProviderScope<NavKey>.registerDownloadEntries() {
    entry<DownloadRoute> {
        DownloadScreen()
    }
}
