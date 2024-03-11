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

val GrabsomeIcons.StarFill: ImageVector
    get() {
        if (_starFill != null) {
            return _starFill!!
        }
        _starFill = Builder(name = "StarFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0001f, 1.0f)
                lineTo(5.7251f, 5.61f)
                lineTo(0.6401f, 6.345f)
                lineTo(4.3201f, 9.935f)
                lineTo(3.4501f, 15.0f)
                lineTo(8.0001f, 12.61f)
                lineTo(12.5501f, 15.0f)
                lineTo(11.6801f, 9.935f)
                lineTo(15.3601f, 6.35f)
                lineTo(10.2751f, 5.61f)
                lineTo(8.0001f, 1.0f)
                close()
            }
        }
        .build()
        return _starFill!!
    }

private var _starFill: ImageVector? = null
