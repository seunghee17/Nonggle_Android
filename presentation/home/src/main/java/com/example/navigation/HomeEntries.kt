package com.example.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.home.HomeScreen
import com.example.resume_writing.ResumeWritingScreen


fun EntryProviderScope<NavKey>.registerHomeEntries(
    onNavigateToResume: () -> Unit
) {
    entry<HomeRoute> {
        HomeScreen(onNavigateToResume = onNavigateToResume)
    }
    entry<ResumeWritingRoute> {
        ResumeWritingScreen()
    }
}

