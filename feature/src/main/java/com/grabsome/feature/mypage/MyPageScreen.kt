package com.grabsome.feature.mypage

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MyPageRoute() {
    MyPageScreen()
}

@Composable
fun MyPageScreen() {
    Text(text = "마이페이지")
}