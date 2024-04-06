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
            address = "판교동",
            nickname = "최진국",
            job = "삼성",
            placeName = "식당 상호명",
            date = "3/15(금) 오후 7:30",
            body = "내용입니다.",
            imageUrlList = listOf(
                "https://i.namu.wiki/i/6kfaPjBWrl5WQtOkig8o4LaUp2-l1mFGZENCTrS7Q6gT9erdnNEXDLZv9QvbaTeOJfuAwD1ws9DfdtPgj2Zi9Q.webp",
                "https://mblogthumb-phinf.pstatic.net/MjAyMTA0MTJfMjU2/MDAxNjE4MjI4MTMwNjk2.fyRQi14ULqu0L0LjOxfBXGVMUC6zwI7ThQ_OGVU2EWQg.yU5ntI2FtP2oNkKUK0lWZDqmwRCsIlTyf7Rn78jGM0gg.JPEG.ghkdwjdtka/IMG_2379.JPG?type=w800"
            ),
            commentCount = 0,
            wishCount = 7,
            viewCount = 10,
            isManager = false,
            category = "음식점",
            state = "모집중"
        )
        _homeCardList.value = List(10) {
            model
        }
    }

    fun sendUiEvent(event: HomeUiEvent) {
        when (event) {
            is HomeUiEvent.TabClick -> clickHomeTab(event.selectedTab)
            is HomeUiEvent.FilterClick -> {
                // TODO
            }

            is HomeUiEvent.ContentClick -> {
                // TODO 상세 페이지 이동
            }
        }
    }

    private fun clickHomeTab(tabType: HomeTabType) {
        _selectedHomeTab.value = tabType
        val name = if (tabType == HomeTabType.RECENT) "최진국" else "인진국"
        val model = HomeCardModel(
            address = "판교동",
            nickname = name,
            job = "삼성",
            placeName = "식당 상호명",
            date = "3/15(금) 오후 7:30",
            body = "내용입니다.",
            imageUrlList = listOf(
                "https://i.namu.wiki/i/6kfaPjBWrl5WQtOkig8o4LaUp2-l1mFGZENCTrS7Q6gT9erdnNEXDLZv9QvbaTeOJfuAwD1ws9DfdtPgj2Zi9Q.webp",
                "https://mblogthumb-phinf.pstatic.net/MjAyMTA0MTJfMjU2/MDAxNjE4MjI4MTMwNjk2.fyRQi14ULqu0L0LjOxfBXGVMUC6zwI7ThQ_OGVU2EWQg.yU5ntI2FtP2oNkKUK0lWZDqmwRCsIlTyf7Rn78jGM0gg.JPEG.ghkdwjdtka/IMG_2379.JPG?type=w800"
            ),
            commentCount = 0,
            wishCount = 7,
            viewCount = 10,
            isManager = false,
            category = "음식점",
            state = "모집중"
        )
        _homeCardList.value = List(10) { model }
    }

}