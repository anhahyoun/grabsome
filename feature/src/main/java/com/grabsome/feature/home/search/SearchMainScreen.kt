package com.grabsome.feature.home.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.component.button.OutlineButton
import com.grabsome.core.designsystem.component.button.OutlineButtonSize
import com.grabsome.core.designsystem.component.button.OutlineButtonStyle
import com.grabsome.core.designsystem.component.inputfield.SearchField

@Composable
fun SearchMainScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        SearchInput()
    }
}

@Composable
fun SearchInput() {
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
            // TODO 검색 결과 이동
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchMainScreenPreview() {
    SearchMainScreen()
}