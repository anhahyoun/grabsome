package com.grabsome.feature.home

import com.grabsome.common.event.UiEvent
import com.grabsome.core.data.model.home.HomeCardModel

sealed class HomeUiEvent : UiEvent {
    data class TabClick(val selectedTab: HomeTabType) : HomeUiEvent()
    data class FilterClick(val selectedFilter: FilterType) : HomeUiEvent()
    data class ContentClick(val item: HomeCardModel) : HomeUiEvent()
    data object SearchClick : HomeUiEvent()
}

enum class FilterType {
    MENU, REGION, COUNT, GENDER
}