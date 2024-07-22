package com.grabsome.feature.home.search

import com.grabsome.common.event.UiEvent

sealed class SearchUiEvent : UiEvent {
    data class OnRemoveRecentSearchClick(val text: String) : SearchUiEvent()
    data object OnRemoveAllRecentSearchClick : SearchUiEvent()
}