package com.grabsome.core.designsystem.ext

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color

@SuppressLint("ModifierFactoryUnreferencedReceiver")
inline fun Modifier.rippleClickable(
    color: Color = com.grabsome.core.designsystem.theme.color.color.neutral900,
    crossinline onClick: () -> Unit
): Modifier = composed {
    clickable(
        indication = rememberRipple(color = color),
        interactionSource = remember { MutableInteractionSource() }) {
        onClick()
    }
}

@SuppressLint("ModifierFactoryUnreferencedReceiver")
inline fun Modifier.noRippleClickable(crossinline onClick: () -> Unit): Modifier = composed {
    clickable(
        indication = null,
        interactionSource = remember { MutableInteractionSource() }) { onClick() }
}
