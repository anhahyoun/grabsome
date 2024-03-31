package com.grabsome.feature.mypage

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyPageRoute() {
    MyPageScreen()
}

@Composable
fun MyPageScreen() {
    Text(text = "마이페이지", modifier = Modifier.fillMaxSize())
}