package com.grabsome.feature.home.search

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.getAndUpdate
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor() : ViewModel() {

    private val _recentSearchList = MutableStateFlow<List<String>>(mutableListOf())
    val recentSearchList: StateFlow<List<String>> = _recentSearchList.asStateFlow()

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
}
