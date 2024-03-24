package com.grabsome.core.designsystem.component.chips

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Checkmark
import com.grabsome.core.designsystem.icon.grabsomeiconpack.ChevronDown
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Plus
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Xmark
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

@Composable
fun Chips(
    modifier: Modifier = Modifier,
    type: ChipsType = ChipsType.FILTER,
    selectType: ChipsSelectType = ChipsSelectType.MULTIPLE,
    size: ChipsSize = ChipsSize.MEDIUM,
    text: String,
    isActive: Boolean,
    onClick: () -> Unit
) {
    when (type) {
        ChipsType.FILTER -> ChipsFilter(
            modifier = modifier,
            size = size,
            text = text,
            isActive = isActive,
            onClick = onClick
        )

        ChipsType.CHOICE -> ChipsChoice(
            modifier = modifier,
            selectType = selectType,
            size = size,
            text = text,
            isActive = isActive,
            onClick = onClick
        )
    }
}

@Composable
private fun ChipsFilter(
    modifier: Modifier = Modifier,
    size: ChipsSize,
    text: String,
    isActive: Boolean,
    onClick: () -> Unit
) {

    val activeModifier = if (isActive) {
        Modifier
            .background(color = color.neutral900)
            .padding(
                horizontal = 16.dp,
                vertical = when (size) {
                    ChipsSize.MEDIUM -> 8.dp
                    ChipsSize.LARGE -> 12.dp
                }
            )
    } else {
        Modifier
            .border(1.dp, shape = RoundedCornerShape(100.dp), color = color.neutral300)
            .padding(
                horizontal = 16.dp,
                vertical = when (size) {
                    ChipsSize.MEDIUM -> 8.dp
                    ChipsSize.LARGE -> 12.dp
                }
            )
    }
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(100.dp))
            .clickable(onClick = onClick)
            .then(activeModifier),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            color = if (isActive) color.neutral000 else color.neutral900,
            style = if (isActive) typography.labelMedium else typography.labelSmall
        )
        Image(
            imageVector = if (isActive) GrabsomeIcons.Xmark else GrabsomeIcons.ChevronDown,
            contentDescription = "필터 아이콘",
            modifier = Modifier.size(16.dp),
            colorFilter = ColorFilter.tint(color.neutral400)
        )
    }

}

@Composable
private fun ChipsChoice(
    modifier: Modifier = Modifier,
    selectType: ChipsSelectType,
    size: ChipsSize,
    text: String,
    isActive: Boolean,
    onClick: () -> Unit
) {
    val activeModifier = if (isActive) {
        modifier
            .border(1.dp, shape = RoundedCornerShape(100.dp), color = color.blue300)
            .padding(
                horizontal = 16.dp,
                vertical = when (size) {
                    ChipsSize.MEDIUM -> 8.dp
                    ChipsSize.LARGE -> 12.dp
                }
            )
    } else {
        modifier
            .border(1.dp, shape = RoundedCornerShape(100.dp), color = color.neutral300)
            .padding(
                horizontal = 16.dp,
                vertical = when (size) {
                    ChipsSize.MEDIUM -> 8.dp
                    ChipsSize.LARGE -> 12.dp
                }
            )
    }
    Row(
        modifier = modifier
            .clip(shape = RoundedCornerShape(100.dp))
            .clickable(onClick = onClick)
            .then(activeModifier),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            color = when {
                selectType == ChipsSelectType.SINGLE && isActive -> color.blue300
                else -> color.neutral900
            },
            style = if (isActive) typography.labelMedium else typography.labelSmall
        )
        if (selectType == ChipsSelectType.MULTIPLE) {
            Image(
                imageVector = if (isActive) GrabsomeIcons.Checkmark else GrabsomeIcons.Plus,
                contentDescription = "필터 아이콘",
                modifier = Modifier.size(16.dp),
                colorFilter = ColorFilter.tint(if (isActive) color.blue300 else color.neutral400)
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
private fun ChipsPreview() {
    Row(modifier = Modifier.padding(10.dp), horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        ChipsType.entries.forEach {
            Chips(
                type = it,
                selectType = ChipsSelectType.MULTIPLE,
                size = ChipsSize.MEDIUM,
                text = "텍스트",
                isActive = true
            ) {

            }
        }
    }

}
