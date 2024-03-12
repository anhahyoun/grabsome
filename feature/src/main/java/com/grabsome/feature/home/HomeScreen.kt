package com.grabsome.feature.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.data.model.home.HomeCardModel
import com.grabsome.core.designsystem.theme.color.color

@Composable
fun HomeRoute() {
    HomeScreen()
}

@Composable
internal fun HomeScreen() {
    val model = HomeCardModel(
        profileUrl = "",
        nickname = "김이나",
        profileDescription = "삼성",
        placeName = "식당 상호명",
        writeDate = "16분전",
        title = "타이틀입니다.",
        body = "내용입니다.",
        imageUrlList = listOf(),
        commentCount = 0,
        wishCount = 7,
        viewCount = 10,
        isManager = false
    )
    val list = List(10) {
        model
    }
    val state = rememberScrollState()
    Column(modifier = Modifier.fillMaxSize()) {
        HomeAppBar(selectedTabType = HomeTabType.RECENT)
        Column(Modifier.verticalScroll(state)) {
            list.forEach {
                HomeCard(model = it)
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 8.dp),
                    thickness = 1.dp,
                    color = color.neutral300
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}