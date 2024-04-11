package com.grabsome.core.designsystem.component.inputfield

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
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
import com.grabsome.core.designsystem.ext.toDp
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.CheckCircleFill
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Magnifyingglass
import com.grabsome.core.designsystem.theme.color.color

@Composable
fun SearchField(
    modifier: Modifier = Modifier,
    text: String,
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
            .fillMaxWidth()
            .height(searchFieldSize.height)
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

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .wrapContentHeight(),
        ) {
            BasicTextField(
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxWidth()
                    .onFocusChanged {
                        focusState = if (it.isFocused) {
                            Focused
                        } else {
                            Unfocused
                        }
                    }
                    .padding(0.dp),
                value = text,
                onValueChange = onValueChange,
                textStyle = searchFieldSize.textStyle.merge(
                    color = when (focusState) {
                        Focused -> color.neutral900
                        Unfocused -> color.neutral300
                        Disable -> color.neutral400
                    }
                ).toDp(),
                singleLine = true,
                cursorBrush = SolidColor(color.blue300),
                enabled = enabled,
            )

            this@Row.AnimatedVisibility(
                visible = text.isEmpty() && placeholder != null,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Text(
                    text = placeholder ?: "",
                    style = searchFieldSize.textStyle.toDp(),
                    color = color.neutral300,
                )
            }
        }

        if (focusState == Focused && text.isNotEmpty()) {
            Image(
                modifier = Modifier
                    .size(16.dp)
                    .rippleClickable {
                        onValueChange.invoke("")
                    },
                imageVector = GrabsomeIcons.CheckCircleFill, // TODO 변경해야함
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
        mutableStateOf("")
    }

    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        SearchField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            text = text,
            placeholder = "한국어",
            onValueChange = { changeText -> text = changeText },
            enabled = true
        )
        SearchField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            text = text,
            placeholder = "placeholder",
            onValueChange = { changeText -> text = changeText },
            enabled = false
        )
    }
}