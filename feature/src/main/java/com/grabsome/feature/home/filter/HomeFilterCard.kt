@file:OptIn(ExperimentalLayoutApi::class)

package com.grabsome.feature.home.filter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.component.chips.Chips
import com.grabsome.core.designsystem.component.chips.ChipsType
import com.grabsome.core.designsystem.component.inputfield.SearchField
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

@Composable
fun HomeMenuFilterCard(menuList: List<String>) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "메뉴",
            style = typography.titleLarge,
            color = color.neutral900,
            modifier = Modifier.fillMaxWidth(),
        )
        FlowRow(
            modifier = Modifier.padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            menuList.forEach {
                Chips(text = it, isActive = false, type = ChipsType.CHOICE) {

                }
            }
        }
    }
}

@Composable
fun HomeRegionFilterCard() {
    Column(
        modifier = Modifier
            .padding(vertical = 16.dp, horizontal = 16.dp)
            .fillMaxWidth(),
    ) {
        Text(
            text = "지역",
            style = typography.titleLarge,
            color = color.neutral900,
            modifier = Modifier.fillMaxWidth(),
        )
        SearchField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            placeholder = "주소로 검색",
            value = "",
            onValueChange = {}
        )
    }
}

@Composable
fun HomeCountFilterCard() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "인원",
            style = typography.titleLarge,
            color = color.neutral900,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Composable
fun HomeGenderFilterCard() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "성별",
            style = typography.titleLarge,
            color = color.neutral900,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeMenuFilterPreview() {
    HomeMenuFilterCard(listOf("한식", "양식", "중식", "일식", "아시안", "샐러드"))
}

@Preview(showBackground = true)
@Composable
private fun HomeRegionFilterCardPreview() {
    HomeRegionFilterCard()
}

@Preview(showBackground = true)
@Composable
private fun HomeCountFilterCardPreview() {
    HomeCountFilterCard()
}

@Preview(showBackground = true)
@Composable
private fun HomeGenderFilterCardPreview() {
    HomeGenderFilterCard()
}
