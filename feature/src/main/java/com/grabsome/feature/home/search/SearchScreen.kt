package com.grabsome.feature.home.search

import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.grabsome.common.event.UiEvent
import com.grabsome.core.designsystem.component.button.OutlineButton
import com.grabsome.core.designsystem.component.button.OutlineButtonSize
import com.grabsome.core.designsystem.component.button.OutlineButtonStyle
import com.grabsome.core.designsystem.component.inputfield.SearchField
import com.grabsome.core.designsystem.ext.rippleClickable
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.ChevronLeft
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun SearchRoute(
    viewModel: SearchViewModel = hiltViewModel(),
    onSearchResult: (String) -> Unit
) {
    val searchState by viewModel.searchState.collectAsState()
    SearchScreen(
        searchState,
        uiEvent = { event ->
            when (event) {
                SearchUiEvent.OnRemoveAllRecentSearchClick -> viewModel.removeAllRecentSearch()
                is SearchUiEvent.OnRemoveRecentSearchClick -> viewModel.removeRecentSearch(event.text)
                is SearchUiEvent.SearchParam -> onSearchResult(event.param)
            }
        }
    )
}

@Composable
private fun SearchScreen(
    searchState: SearchUiState,
    uiEvent: (UiEvent) -> Unit
) {
    val dispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 2.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .rippleClickable {
                        dispatcher?.onBackPressed()
                    }
                    .size(40.dp)
                    .padding(8.dp),
                imageVector = GrabsomeIcons.ChevronLeft,
                contentDescription = "뒤로가기",
                colorFilter = ColorFilter.tint(color = color.neutral900),
            )
            Text(
                text = "검색",
                style = typography.titleLarge,
                color = color.neutral900,
                modifier = Modifier
                    .padding(end = 40.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
        when (searchState) {
            is SearchUiState.SearchMain -> {
                val recentList by searchState.recentList.collectAsState()
                SearchMainScreen({ recentList }, uiEvent)
            }

            is SearchUiState.SearchResult -> {
                SearchResultScreen(cardList = searchState.cardList, uiEvent = uiEvent)
            }

            SearchUiState.SearchResultEmpty -> TODO()
        }
    }
}

@Composable
fun SearchInput(uiEvent: (SearchUiEvent) -> Unit) {
    var searchInputText by rememberSaveable {
        mutableStateOf("")
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        SearchField(
            modifier = Modifier.weight(1f),
            text = searchInputText,
            placeholder = "검색어를 입력해주세요"
        ) {
            searchInputText = it
        }
        OutlineButton(
            text = "검색",
            style = OutlineButtonStyle(size = OutlineButtonSize.SMALL),
            enabled = searchInputText.isNotEmpty()
        ) {
            uiEvent.invoke(SearchUiEvent.SearchParam(searchInputText))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchScreenPreview() {
    SearchScreen(SearchUiState.SearchMain(MutableStateFlow(listOf("마라탕", "국밥", "탕수육", "비빔면")))) {}
}
