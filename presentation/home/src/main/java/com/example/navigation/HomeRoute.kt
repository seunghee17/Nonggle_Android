package com.example.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

//Route 자체를 직렬화 가능한 객체로 만들기 위해
// Backstack에 쌓일 key를 정의하기 위한 작업
// 홈화면
@Serializable
data object HomeRoute: NavKey

@Serializable
data object ResumeWritingRoute: NavKey