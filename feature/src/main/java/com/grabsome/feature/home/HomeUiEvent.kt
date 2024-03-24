package com.grabsome.feature.home

import com.grabsome.common.event.UiEvent

sealed class HomeUiEvent : UiEvent {
    data class TabClick(val selectedTab: HomeTabType) : HomeUiEvent()
    data class FilterClick(val selectedFilter: FilterType) : HomeUiEvent()
}

enum class FilterType {
    MENU, REGION, COUNT, GENDER
}