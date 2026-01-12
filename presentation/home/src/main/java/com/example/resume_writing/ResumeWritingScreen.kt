package com.example.resume_writing

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ResumeWritingNavEntry() {

}

@Composable
internal fun ResumeWritingScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(100) {
                Text(text = "이력서 작성화면")
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ResumeWritingScreenPreview() {

}