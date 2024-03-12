package com.grabsome.core.designsystem.icon.grabsomeiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.icon.GrabsomeIcons

val GrabsomeIcons.Ellipsis: ImageVector
    get() {
        if (_ellipsis != null) {
            return _ellipsis!!
        }
        _ellipsis = Builder(name = "Ellipsis", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 9.0f)
                curveTo(4.5523f, 9.0f, 5.0f, 8.5523f, 5.0f, 8.0f)
                curveTo(5.0f, 7.4477f, 4.5523f, 7.0f, 4.0f, 7.0f)
                curveTo(3.4477f, 7.0f, 3.0f, 7.4477f, 3.0f, 8.0f)
                curveTo(3.0f, 8.5523f, 3.4477f, 9.0f, 4.0f, 9.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveTo(8.5523f, 9.0f, 9.0f, 8.5523f, 9.0f, 8.0f)
                curveTo(9.0f, 7.4477f, 8.5523f, 7.0f, 8.0f, 7.0f)
                curveTo(7.4477f, 7.0f, 7.0f, 7.4477f, 7.0f, 8.0f)
                curveTo(7.0f, 8.5523f, 7.4477f, 9.0f, 8.0f, 9.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(13.0f, 8.5523f, 12.5523f, 9.0f, 12.0f, 9.0f)
                curveTo(11.4477f, 9.0f, 11.0f, 8.5523f, 11.0f, 8.0f)
                curveTo(11.0f, 7.4477f, 11.4477f, 7.0f, 12.0f, 7.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                close()
            }
        }
        .build()
        return _ellipsis!!
    }

private var _ellipsis: ImageVector? = null
