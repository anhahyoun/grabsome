package com.grabsome.core.designsystem.component.inputfield

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.component.inputfield.InputFieldState.Disable
import com.grabsome.core.designsystem.component.inputfield.InputFieldState.Focused
import com.grabsome.core.designsystem.component.inputfield.InputFieldState.Unfocused
import com.grabsome.core.designsystem.ext.rippleClickable
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.CheckCircleFill
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Magnifyingglass
import com.grabsome.core.designsystem.theme.color.color

@Composable
fun SearchField(
    modifier: Modifier = Modifier,
    value: String,
    placeholder: String? = null,
    searchFieldSize: SearchFieldSize = SearchFieldSize.Medium,
    enabled: Boolean = true,
    onValueChange: (String) -> Unit,
) {
    var focusState by rememberSaveable {
        mutableStateOf(if (enabled) Unfocused else Disable)
    }

    Row(
        modifier = modifier
            .background(
                when (focusState) {
                    Focused -> color.neutral000
                    Unfocused -> color.neutral100
                    Disable -> color.neutral200
                }
            )
            .border(
                width = 1.dp,
                color = when (focusState) {
                    Focused -> color.blue300
                    Unfocused, Disable -> color.neutral300
                },
                shape = RoundedCornerShape(8.dp)
            )
            .padding(searchFieldSize.padding),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        Image(
            modifier = Modifier
                .padding(end = 8.dp)
                .size(16.dp),
            imageVector = GrabsomeIcons.Magnifyingglass,
            contentDescription = "검색 아이콘",
            colorFilter = ColorFilter.tint(color = color.neutral400)
        )

        BasicTextField(
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged {
                    focusState = if (it.isFocused) {
                        Focused
                    } else {
                        Unfocused
                    }
                }
                .padding(0.dp),
            value = value,
            onValueChange = onValueChange,
            textStyle = searchFieldSize.textStyle.merge(
                color = when (focusState) {
                    Focused -> color.neutral900
                    Unfocused -> color.neutral300
                    Disable -> color.neutral400
                }
            ),
            singleLine = true,
            cursorBrush = SolidColor(color.blue300),
            enabled = enabled
        )
        if (focusState == Focused && value.isNotEmpty()) {
            Image(
                modifier = Modifier
                    .size(16.dp)
                    .rippleClickable {
                        onValueChange.invoke("")
                    },
                imageVector = GrabsomeIcons.CheckCircleFill,
                contentDescription = "검색어 삭제",
                colorFilter = ColorFilter.tint(color = color.neutral400)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchFieldPreview() {
    var text by remember {
        mutableStateOf("안녕")
    }

    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        SearchField(
            value = text,
            onValueChange = { changeText -> text = changeText },
            enabled = true
        )
        SearchField(
            value = text,
            onValueChange = { changeText -> text = changeText },
            enabled = false
        )
    }
}