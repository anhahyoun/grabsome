package com.grabsome.feature.home.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.grabsome.core.data.model.home.HomeCardModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.getAndUpdate
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor() : ViewModel() {

    private val _recentSearchList = MutableStateFlow<List<String>>(mutableListOf())
    val recentSearchList: StateFlow<List<String>> = _recentSearchList.asStateFlow()

    private val _searchState: MutableStateFlow<SearchUiState> =
        MutableStateFlow(SearchUiState.SearchMain(recentSearchList))
    val searchState: StateFlow<SearchUiState> = _searchState.asStateFlow()

    init {
        getRecentSearchList()
    }

    private fun getRecentSearchList() {
        _recentSearchList.value = mutableListOf("마라탕", "국밥", "탕수육", "비빔면")
    }

    fun removeRecentSearch(text: String) {
        _recentSearchList.getAndUpdate { list ->
            list.filter { it != text }
        }
    }

    fun removeAllRecentSearch() {
        _recentSearchList.getAndUpdate {
            emptyList()
        }
    }

    fun clickSearch(param: String) {
        viewModelScope.launch {
            delay(300)
            val model = HomeCardModel(
                address = "판교동",
                nickname = "이름",
                job = "직업란",
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
            _searchState.value = SearchUiState.SearchResult(cardList = List(10) { model })
        }
    }
}

sealed class SearchUiState {
    data class SearchMain(val recentList: StateFlow<List<String>>) : SearchUiState()
    data object SearchResultEmpty : SearchUiState()
    data class SearchResult(val cardList: List<HomeCardModel>) : SearchUiState()
}
