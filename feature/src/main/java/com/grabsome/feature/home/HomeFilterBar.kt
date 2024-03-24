package com.grabsome.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.component.chips.Chips

@Composable
internal fun HomeFilterBar(
    modifier: Modifier = Modifier,
    onClick: (HomeUiEvent) -> Unit,
) {
    LazyRow(
        modifier = modifier.padding(vertical = 8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Chips(
                text = "메뉴", isActive = false
                /** TODO isActive*/
            ) {
                onClick.invoke(HomeUiEvent.FilterClick(FilterType.MENU))
            }
        }
        item {
            Chips(
                text = "지역", isActive = false
                /** TODO isActive*/
            ) {
                onClick.invoke(HomeUiEvent.FilterClick(FilterType.REGION))
            }
        }
        item {
            Chips(
                text = "인원", isActive = false
                /** TODO isActive*/
            ) {
                onClick.invoke(HomeUiEvent.FilterClick(FilterType.COUNT))
            }
        }
        item {
            Chips(
                text = "성별", isActive = false
                /** TODO isActive*/
            ) {
                onClick.invoke(HomeUiEvent.FilterClick(FilterType.GENDER))
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun HomeFilterBarPreview() {
    HomeFilterBar() { _ ->

    }
}