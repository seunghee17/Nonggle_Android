package com.example.nonggleresume.navigation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation3.runtime.NavKey

// 하단 탭별 백스택 유지를 위해
// 화면 이동 히스토리 추적, 관리
class TopLevelBackStack<T : NavKey>(private val startKey: T) {
    // startKey -> 앱시작시 기본으로 활성화되는 루트탭 한번 정해지면 갱신되지 않는다
    // 예를 들어 Home, Search, Profile 네비게이션 탭이 있다면 각 탭별로 자기만의 백스택 리스트를 가진다는 의미
    private val topLevelBackStacks: HashMap<T, SnapshotStateList<T>> = hashMapOf(
        startKey to mutableStateListOf(startKey)
    )

    // 지금 활성화된 탭이 무엇인지 compose ui가 자동으로 리컴포지션 하도록 state 관리
    // 즉 현재 사용자가 보고있는 탭
    var topLevelKey by mutableStateOf(startKey)
        private set

    // 여러 탭의 스택을 하나로 함쳐서 보여준다.
    val backStack = mutableStateListOf<T>(startKey)

    private fun updateBackStack() {
        backStack.clear()
        val currentStack = topLevelBackStacks[topLevelKey] ?: emptyList()

        if (topLevelKey == startKey) {
            backStack.addAll(currentStack)
        } else {
            val startStack = topLevelBackStacks[startKey] ?: emptyList()
            backStack.addAll(startStack + currentStack)
        }
    }

    fun switchTopLevel(key: T) {
        if (topLevelBackStacks[key] == null) {
            topLevelBackStacks[key] = mutableStateListOf(key)
        }
        topLevelKey = key
        updateBackStack()
    }

    // 하단 탭 클릭시 해당 탭의 스택 활성화 없으면 새로 만들고 있으면 복원
    fun add(key: T) {
        topLevelBackStacks[topLevelKey]?.add(key)
        updateBackStack()
    }

    // 현재 탭의 스택에서 pop
    fun removeLast() {
        val currentStack = topLevelBackStacks[topLevelKey] ?: return

        if (currentStack.size > 1) {
            currentStack.removeLastOrNull()
        } else if (topLevelKey != startKey) {
            topLevelKey = startKey
        }
        updateBackStack()
    }

    fun replaceStack(vararg keys: T) {
        topLevelBackStacks[topLevelKey] = mutableStateListOf(*keys)
        updateBackStack()
    }
}