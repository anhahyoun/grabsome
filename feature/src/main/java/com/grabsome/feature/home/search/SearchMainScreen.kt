package com.grabsome.feature.home.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.component.button.OutlineButton
import com.grabsome.core.designsystem.component.button.OutlineButtonSize
import com.grabsome.core.designsystem.component.button.OutlineButtonStyle
import com.grabsome.core.designsystem.component.inputfield.SearchField
import com.grabsome.core.designsystem.ext.rippleClickable
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Xmark
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

@Composable
fun SearchMainScreen(
    recentSearchList: () -> List<String>,
    uiEvent: (SearchUiEvent) -> Unit
) {
    val list = recentSearchList()
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            SearchInput(uiEvent = uiEvent)
        }
        if (list.isNotEmpty()) {
            item { RecentSearchesTitle(uiEvent) }
            items(list) {
                RecentSearches(it, uiEvent)
            }
        }
    }
}

@Composable
private fun RecentSearchesTitle(uiEvent: (SearchUiEvent) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "최근 검색어",
            style = typography.titleXSmall,
            color = color.neutral600
        )
        Text(
            modifier = Modifier
                .rippleClickable {
                    uiEvent(SearchUiEvent.OnRemoveAllRecentSearchClick)
                }
                .padding(vertical = 9.dp),
            text = "전체 삭제",
            style = typography.labelXSmall,
            color = color.neutral400
        )
    }
}

@Composable
private fun RecentSearches(
    text: String,
    uiEvent: (SearchUiEvent) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = typography.titleMedium,
            color = color.neutral900
        )
        Image(
            imageVector = GrabsomeIcons.Xmark,
            modifier = Modifier
                .rippleClickable {
                    uiEvent(SearchUiEvent.OnRemoveRecentSearchClick(text))
                }
                .padding(start = 16.dp, top = 8.dp, bottom = 8.dp)
                .size(24.dp),
            contentDescription = "삭제",
            colorFilter = ColorFilter.tint(color.neutral400)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchMainScreenPreview() {
    SearchMainScreen({ listOf("마라탕", "국밥", "탕수육", "비빔면") }, {})
}
