package com.example.data.util

import android.content.Context
import com.example.common.network.Dispatcher
import dagger.hilt.android.qualifiers.ApplicationContext
import com.example.common.network.NonggleDispatchers.IO
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

internal class ConnectivityManagerNetworkMonitor @Inject constructor(
    @ApplicationContext private val context: Context,
    @Dispatcher(IO) private val ioDispatcher: CoroutineDispatcher
) {
}