package com.grabsome.feature.home.search

import androidx.compose.foundation.Image
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.grabsome.core.designsystem.ext.rippleClickable
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.ChevronLeft
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

@Composable
fun SearchRoute(viewModel: SearchViewModel = hiltViewModel()) {
    val recentSearchList by viewModel.recentSearchList.collectAsState()
    SearchScreen(
        recentSearchList = { recentSearchList },
        uiEvent = { event ->
            when (event) {
                SearchUiEvent.OnRemoveAllRecentSearchClick -> viewModel.removeAllRecentSearch()
                is SearchUiEvent.OnRemoveRecentSearchClick -> viewModel.removeRecentSearch(event.text)
            }
        }
    )
}

@Composable
private fun SearchScreen(
    recentSearchList: () -> List<String>,
    uiEvent: (SearchUiEvent) -> Unit
) {
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
                        // TODO
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
        SearchMainScreen(recentSearchList, uiEvent)
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchScreenPreview() {
    SearchScreen(recentSearchList = { listOf("마라탕", "국밥", "탕수육", "비빔면") }, {})
}
