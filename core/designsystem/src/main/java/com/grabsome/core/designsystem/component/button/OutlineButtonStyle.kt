package com.grabsome.core.designsystem.component.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

data class OutlineButtonStyle(
    val size: OutlineButtonSize = OutlineButtonSize.SMALL,
    val color: OutlineButtonColor = OutlineButtonColor.BLUE
)

enum class OutlineButtonSize(
    val textStyle: TextStyle,
    val paddingValues: PaddingValues
) {
    SMALL(
        textStyle = typography.labelMedium,
        paddingValues = PaddingValues(horizontal = 16.dp, vertical = 11.5.dp)
    ),
    MEDIUM(
        textStyle = typography.labelLarge,
        paddingValues = PaddingValues(horizontal = 16.dp, vertical = 14.dp)
    ),
    LARGE(
        textStyle = typography.labelXLarge,
        paddingValues = PaddingValues(horizontal = 16.dp, vertical = 17.dp)
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