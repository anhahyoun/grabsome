package com.grabsome.core.designsystem.component.inputfield

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.theme.typography.typography

enum class SearchFieldSize(val padding: PaddingValues, val textStyle: TextStyle, val height: Dp) {
    Medium(
        padding = PaddingValues(vertical = 8.dp, horizontal = 16.dp),
        textStyle = typography.titleXSmall,
        height = 40.dp
    ),
    Large(
        padding = PaddingValues(vertical = 12.dp, horizontal = 16.dp),
        textStyle = typography.titleMedium,
        height = 48.dp
    )
}