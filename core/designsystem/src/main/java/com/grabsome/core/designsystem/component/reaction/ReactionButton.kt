package com.grabsome.core.designsystem.component.reaction

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.common.ext.getStringCount
import com.grabsome.core.designsystem.R
import com.grabsome.core.designsystem.ext.rippleClickable
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Bubble
import com.grabsome.core.designsystem.icon.grabsomeiconpack.BubbleFill
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

@Composable
fun ReactionButton(
    modifier: Modifier = Modifier,
    alignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    icon: ImageVector,
    fillIcon: ImageVector,
    count: Int,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .rippleClickable { onClick.invoke() }
            .padding(4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp, alignment),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.size(16.dp),
            imageVector = if (count == 0) icon else fillIcon,
            contentDescription = "icon",
            colorFilter = ColorFilter.tint(if (count == 0) color.neutral600 else color.blue300)
        )
        if (count > 0) {
            Text(
                text = count.getStringCount(),
                style = typography.labelSmall,
                color = color.neutral600
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ReactionButtonPreview() {
    ReactionButton(
        icon = GrabsomeIcons.Bubble,
        fillIcon = GrabsomeIcons.BubbleFill,
        count = 100,
    ) {

    }
}
