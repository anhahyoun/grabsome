package com.grabsome.core.designsystem.ext

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

@Composable
fun TextStyle.toDp(): TextStyle {
    return this.copy(
        fontSize = with(LocalDensity.current) { Dp(this@toDp.fontSize.value).toSp() }
    )
}
