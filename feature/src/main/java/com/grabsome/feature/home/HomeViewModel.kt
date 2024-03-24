package com.grabsome.feature.home

import androidx.lifecycle.ViewModel
import com.grabsome.core.data.model.home.HomeCardModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    private val _selectedHomeTab = MutableStateFlow(HomeTabType.RECENT)
    val selectedHomeTab = _selectedHomeTab.asStateFlow()

    private val _homeCardList = MutableStateFlow<List<HomeCardModel>>(emptyList())
    val homeCardList = _homeCardList.asStateFlow()

    init {
        val model = HomeCardModel(
            profileUrl = "",
            nickname = "최진국",
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
        _homeCardList.value = List(10) {
            model
        }
    }

    fun sendUiEvent(event: HomeUiEvent) {
        when (event) {
            is HomeUiEvent.TabClick -> clickHomeTab(event.selectedTab)
            is HomeUiEvent.FilterClick ->  {
                // TODO
            }
        }
    }

    private fun clickHomeTab(tabType: HomeTabType) {
        _selectedHomeTab.value = tabType
        val name = if (tabType == HomeTabType.RECENT) "최진국" else "인진국"
        val model = HomeCardModel(
            profileUrl = "",
            nickname = name,
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
        _homeCardList.value = List(10) { model }
    }

}