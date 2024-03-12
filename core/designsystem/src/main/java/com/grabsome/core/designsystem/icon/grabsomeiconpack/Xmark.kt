package com.grabsome.core.designsystem.icon.grabsomeiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.icon.GrabsomeIcons

val GrabsomeIcons.Xmark: ImageVector
    get() {
        if (_xmark != null) {
            return _xmark!!
        }
        _xmark = Builder(name = "Xmark", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 4.2f)
                lineTo(11.8f, 3.5f)
                lineTo(8.0f, 7.3f)
                lineTo(4.2f, 3.5f)
                lineTo(3.5f, 4.2f)
                lineTo(7.3f, 8.0f)
                lineTo(3.5f, 11.8f)
                lineTo(4.2f, 12.5f)
                lineTo(8.0f, 8.7f)
                lineTo(11.8f, 12.5f)
                lineTo(12.5f, 11.8f)
                lineTo(8.7f, 8.0f)
                lineTo(12.5f, 4.2f)
                close()
            }
        }
        .build()
        return _xmark!!
    }

private var _xmark: ImageVector? = null
