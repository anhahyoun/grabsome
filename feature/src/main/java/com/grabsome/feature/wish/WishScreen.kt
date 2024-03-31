package com.grabsome.feature.wish

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WishRoute() {
    WishScreen()
}

@Composable
fun WishScreen() {
    Text(text = "찜하기", modifier = Modifier.fillMaxSize())
}