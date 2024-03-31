package com.grabsome.feature.home.filter

import com.grabsome.common.event.UiEvent

sealed class HomeFilterUiEvent : UiEvent {
    data object CloseClick : HomeFilterUiEvent()
}