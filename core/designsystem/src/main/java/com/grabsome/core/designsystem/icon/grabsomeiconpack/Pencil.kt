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

val GrabsomeIcons.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.9f, 1.3f)
                lineTo(12.7f, 3.1f)
                curveTo(13.1f, 3.5f, 13.1f, 4.1f, 12.7f, 4.5f)
                lineTo(5.2f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.8f)
                lineTo(9.5f, 1.3f)
                curveTo(9.9f, 0.9f, 10.5f, 0.9f, 10.9f, 1.3f)
                close()
                moveTo(12.0f, 3.8f)
                lineTo(10.2f, 2.0f)
                lineTo(8.7f, 3.5f)
                lineTo(10.5f, 5.3f)
                lineTo(12.0f, 3.8f)
                close()
                moveTo(3.0f, 9.2f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.8f)
                lineTo(9.8f, 6.0f)
                lineTo(8.0f, 4.2f)
                lineTo(3.0f, 9.2f)
                close()
                moveTo(1.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
