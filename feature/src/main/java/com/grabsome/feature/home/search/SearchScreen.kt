package com.grabsome.feature.home.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SearchRoute(viewModel: SearchViewModel = hiltViewModel()) {
    SearchScreen()
}

@Composable
private fun SearchScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "검색 화면")
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchScreenPreview() {
    SearchScreen()
}
