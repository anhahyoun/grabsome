package com.grabsome.core.designsystem.component.controls

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.theme.color.color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Slider(
    modifier: Modifier = Modifier,
    value: ClosedFloatingPointRange<Float>,
    enabled: Boolean = true,
    steps: Int = 10,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    onValueChangeFinished: (() -> Unit)? = null,
) {
    RangeSlider(
        modifier = modifier,
        value = value,
        steps = steps,
        enabled = enabled,
        onValueChange = onValueChange,
        valueRange = valueRange,
        colors = SliderDefaults.colors(
            thumbColor = color.blue300,
            activeTrackColor = color.blue300,
            inactiveTrackColor = color.neutral300,
        ),
        startThumb = {
            SliderThumb(enabled)
        },
        endThumb = {
            SliderThumb(enabled)
        },
        track = {
            SliderDefaults.Track(
                colors = SliderDefaults.colors(
                    disabledActiveTrackColor = color.blue300.copy(alpha = 0.4f),
                    disabledInactiveTrackColor = color.neutral300.copy(alpha = 0.4f),
                    disabledActiveTickColor = color.blue300.copy(alpha = 0f),
                    disabledInactiveTickColor = color.neutral300.copy(alpha = 0f),
                    activeTrackColor = color.blue300,
                    inactiveTrackColor = color.neutral300,
                    activeTickColor = color.blue300,
                    inactiveTickColor = color.neutral300,
                ),
                enabled = enabled,
                rangeSliderState = it
            )
        },
        onValueChangeFinished = onValueChangeFinished
    )
}

@Composable
private fun SliderThumb(enabled: Boolean) {
    Box(
        modifier = Modifier
            .size(24.dp)
            .background(color.neutral000, shape = RoundedCornerShape(100.dp))
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(100.dp),
                color = if (enabled) color.neutral300 else color.neutral300.copy(0.4f)
            )
    )
}

@Preview(showBackground = true)
@Composable
private fun SliderPreview() {
    var sliderPosition by remember { mutableStateOf(0f..10f) }
    Slider(
        modifier = Modifier.fillMaxWidth(),
        value = sliderPosition,
        onValueChange = { range -> sliderPosition = range },
        steps = 10,
        enabled = true
    )
}
