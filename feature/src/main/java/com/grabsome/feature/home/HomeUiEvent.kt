package com.grabsome.feature.home

import com.grabsome.common.event.UiEvent

sealed class HomeUiEvent : UiEvent {
    data class TabClick(val selectedTab: HomeTabType) : HomeUiEvent()
}