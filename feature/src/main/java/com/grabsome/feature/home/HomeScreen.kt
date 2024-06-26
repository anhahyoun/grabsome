package com.grabsome.feature.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.grabsome.core.data.model.home.HomeCardModel
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.feature.home.filter.HomeFilterFullDialog

@Composable
fun HomeRoute(
    onSearchClick: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val selectedTab by viewModel.selectedHomeTab.collectAsState()
    val cardList by viewModel.homeCardList.collectAsState()
    HomeScreen(
        selectedType = { selectedTab },
        cardList = cardList,
        uiEvent = { event ->
            when (event) {
                is HomeUiEvent.SearchClick -> {
                    onSearchClick()
                }

                else -> {
                    viewModel.sendUiEvent(event)
                }
            }
        },
    )
}

@Composable
internal fun HomeScreen(
    selectedType: () -> HomeTabType,
    cardList: List<HomeCardModel>,
    uiEvent: (HomeUiEvent) -> Unit
) {
    val openAlertDialog = remember { mutableStateOf(false) }
    when {
        openAlertDialog.value -> {
            HomeFilterFullDialog(
                onDismissRequest = { openAlertDialog.value = false },
            )
        }
    }
    Column(modifier = Modifier.fillMaxSize()) {
        HomeAppBar(selectedTabType = selectedType, uiEvent)
        HomeFilterBar {
            when (it) {
                is HomeUiEvent.FilterClick -> {
                    openAlertDialog.value = true
                }

                else -> {}
            }
            uiEvent(it)
        } // TODO 선택된 필터가 없다면 스크롤 시 gone 처리
        LazyColumn {
            items(cardList) {
                HomeCard(model = it, uiEvent)
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
    val model = HomeCardModel(
        address = "판교동",
        nickname = "최진국",
        job = "삼성",
        placeName = "식당 상호명",
        date = "3/15(금) 오후 7:30",
        body = "내용입니다.",
        imageUrlList = listOf(),
        commentCount = 0,
        wishCount = 7,
        viewCount = 10,
        isManager = false,
        category = "음식점",
        state = "모집중"
    )
    val cardList = List(10) {
        model
    }
    HomeScreen(
        selectedType = { HomeTabType.RECENT },
        cardList = cardList,
        uiEvent = {}
    )
}
