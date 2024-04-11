package com.grabsome.core.designsystem.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.theme.color.color

@Composable
fun OutlineButton(
    modifier: Modifier = Modifier,
    text: String,
    style: OutlineButtonStyle,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = color.neutral000,
            disabledContainerColor = color.neutral400.copy(alpha = 0.4f)
        ),
        enabled = enabled,
        border = BorderStroke(
            1.dp,
            color = if (enabled) style.color.borderColor else color.neutral400
        ),
        contentPadding = style.size.paddingValues
    ) {
        Text(
            text = text,
            style = style.size.textStyle,
            color = if (enabled) style.color.textColor else color.neutral400
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OutlineButtonPreview() {
    OutlineButton(text = "버튼 텍스트", style = OutlineButtonStyle()) {

    }
}