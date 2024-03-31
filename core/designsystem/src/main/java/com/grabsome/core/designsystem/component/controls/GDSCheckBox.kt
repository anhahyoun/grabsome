package com.grabsome.core.designsystem.component.controls

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Checkmark
import com.grabsome.core.designsystem.theme.color.color

@Composable
internal fun GDSCheckbox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    checkBoxSize: CheckBoxSize = CheckBoxSize.SMALL,
    onCheckedChange: (Boolean) -> Unit
) {
    val checkboxColor: Color by animateColorAsState(
        when {
            !enabled -> color.neutral300
            checked -> color.blue300
            else -> color.neutral000
        }
    )

    val checkboxBorderColor: Color by animateColorAsState(
        when {
            !enabled && checked -> color.neutral300
            !enabled && !checked -> color.neutral400
            checked -> color.blue300
            isError -> color.red400
            else -> color.neutral300
        }
    )

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .toggleable(
                enabled = enabled,
                value = checked,
                role = Role.Checkbox,
                onValueChange = onCheckedChange
            )
    ) {
        Box(
            modifier = Modifier
                .size(checkBoxSize.size.dp)
                .background(color = checkboxColor, shape = RoundedCornerShape(4.dp))
                .border(
                    width = 1.dp,
                    color = checkboxBorderColor,
                    shape = RoundedCornerShape(4.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            androidx.compose.animation.AnimatedVisibility(
                visible = checked,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Image(
                    imageVector = GrabsomeIcons.Checkmark,
                    contentDescription = null,
                    colorFilter = if (enabled) ColorFilter.tint(color.neutral000) else ColorFilter.tint(
                        color.neutral400
                    )
                )
            }
        }
    }
}

@Preview
@Composable
private fun GDSCheckboxPreview() {
    var checked by remember {
        mutableStateOf(true)
    }
    GDSCheckbox(checked = checked, enabled = false) { changeChecked ->
        checked = changeChecked
    }
}
