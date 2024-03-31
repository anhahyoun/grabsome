package com.grabsome.core.designsystem.component.controls

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.component.controls.CheckBoxSize.LARGE
import com.grabsome.core.designsystem.component.controls.CheckBoxSize.MEDIUM
import com.grabsome.core.designsystem.component.controls.CheckBoxSize.SMALL
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

@Composable
fun CheckBox(
    modifier: Modifier = Modifier,
    label: String? = null,
    checked: Boolean,
    enabled: Boolean = true,
    checkBoxSize: CheckBoxSize = SMALL,
    onCheckedChange: (Boolean) -> Unit
) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        GDSCheckbox(
            checked = checked,
            onCheckedChange = onCheckedChange,
            checkBoxSize = checkBoxSize,
            enabled = enabled,
        )
        if (label != null) {
            Text(
                text = label,
                style = when (checkBoxSize) {
                    SMALL, MEDIUM -> typography.titleXSmall
                    LARGE -> typography.titleMedium
                },
                color = if (enabled) color.neutral900 else color.neutral400
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CheckBoxPreview() {
    var checked by remember {
        mutableStateOf(true)
    }
    CheckBox(
        checked = checked,
        enabled = false,
        label = "라벨"
    ) { changeChecked ->
        checked = changeChecked
    }
}