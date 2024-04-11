package com.grabsome.core.designsystem.component.button

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

data class OutlineButtonStyle(
    val size: OutlineButtonSize = OutlineButtonSize.SMALL,
    val color: OutlineButtonColor = OutlineButtonColor.BLUE
)

enum class OutlineButtonSize(
    val textStyle: TextStyle,
    val height: Dp
) {
    SMALL(
        textStyle = typography.labelMedium,
        height = 40.dp
    ),
    MEDIUM(
        textStyle = typography.labelLarge,
        height = 48.dp
    ),
    LARGE(
        textStyle = typography.labelXLarge,
        height = 56.dp
    )
}

enum class OutlineButtonColor(
    val textColor: Color,
    val borderColor: Color
) {
    GRAY(color.neutral900, color.neutral300),
    BLUE(color.blue300, color.blue300),
    RED(color.red400, color.red400)
}