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

val GrabsomeIcons.HeartFill: ImageVector
    get() {
        if (_heartFill != null) {
            return _heartFill!!
        }
        _heartFill = Builder(name = "HeartFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2501f, 2.0f)
                curveTo(10.2501f, 2.0f, 9.3001f, 2.4f, 8.6001f, 3.1f)
                lineTo(8.0001f, 3.7f)
                lineTo(7.4501f, 3.15f)
                curveTo(6.0001f, 1.65f, 3.6001f, 1.65f, 2.1501f, 3.1f)
                lineTo(2.1001f, 3.15f)
                curveTo(0.6001f, 4.65f, 0.6001f, 7.05f, 2.1001f, 8.55f)
                lineTo(8.0001f, 14.5f)
                lineTo(13.9001f, 8.55f)
                curveTo(15.4001f, 7.05f, 15.4001f, 4.65f, 13.9001f, 3.15f)
                curveTo(13.2001f, 2.4f, 12.2501f, 2.0f, 11.2501f, 2.0f)
                close()
            }
        }
        .build()
        return _heartFill!!
    }

private var _heartFill: ImageVector? = null
