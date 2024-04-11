@file:OptIn(ExperimentalLayoutApi::class, ExperimentalLayoutApi::class)

package com.grabsome.feature.home.filter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.component.chips.Chips
import com.grabsome.core.designsystem.component.chips.ChipsSelectType
import com.grabsome.core.designsystem.component.chips.ChipsType
import com.grabsome.core.designsystem.component.controls.CheckBox
import com.grabsome.core.designsystem.component.controls.CheckBoxSize
import com.grabsome.core.designsystem.component.controls.Slider
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
            text = "",
            onValueChange = {}
        )
    }
}

@Composable
fun HomeCountFilterCard() {
    // todo 네이밍 Participants로??
    // todo sliderPosition, isUnlimitedParticipants 값 뷰모델로 이동
    var sliderPosition by remember { mutableStateOf(1f..10f) }
    var isUnlimitedParticipants by rememberSaveable { mutableStateOf(true) }

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
        CheckBox(
            modifier = Modifier.padding(vertical = 16.dp),
            checked = isUnlimitedParticipants,
            label = "인원 무관",
            checkBoxSize = CheckBoxSize.MEDIUM
        ) {
            isUnlimitedParticipants = isUnlimitedParticipants.not()
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "선호하는 인원",
                style = typography.titleXSmall,
                color = color.neutral600,
            )
            Text(
                text = if (isUnlimitedParticipants) "무관" else "${sliderPosition.start.toInt()} ~ ${sliderPosition.endInclusive.toInt()}명",
                style = typography.titleMedium,
                color = color.blue300,
            )
        }

        Slider(
            modifier = Modifier.fillMaxWidth(),
            value = sliderPosition,
            onValueChange = { range -> sliderPosition = range },
            steps = 8,
            valueRange = 1f..10f,
            enabled = !isUnlimitedParticipants
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 12.dp),
                text = "1명",
                style = typography.bodySmall,
                color = color.neutral400
            )
            Text(
                modifier = Modifier.padding(horizontal = 12.dp),
                text = "5명",
                style = typography.bodySmall,
                color = color.neutral400
            )
            Text(
                modifier = Modifier.padding(horizontal = 12.dp),
                text = "10명",
                style = typography.bodySmall,
                color = color.neutral400
            )
        }
    }
}

@Composable
fun HomeGenderFilterCard() {
    val filterList = listOf("성별무관", "남자", "여자")
    var selectedFilter by rememberSaveable { mutableStateOf(filterList.first()) }

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
        FlowRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            filterList.forEach { text ->
                Chips(
                    text = text,
                    isActive = selectedFilter == text,
                    type = ChipsType.CHOICE,
                    selectType = ChipsSelectType.SINGLE
                ) {
                    selectedFilter = text
                }
            }
        }
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
