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

val GrabsomeIcons.ArrowUpToLine: ImageVector
    get() {
        if (_arrowUpToLine != null) {
            return _arrowUpToLine!!
        }
        _arrowUpToLine = Builder(name = "ArrowUpToLine", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                curveTo(2.0f, 1.7348f, 2.1054f, 1.4804f, 2.2929f, 1.2929f)
                curveTo(2.4804f, 1.1054f, 2.7348f, 1.0f, 3.0f, 1.0f)
                horizontalLineTo(13.0f)
                curveTo(13.2652f, 1.0f, 13.5196f, 1.1054f, 13.7071f, 1.2929f)
                curveTo(13.8946f, 1.4804f, 14.0f, 1.7348f, 14.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(3.705f, 9.705f)
                lineTo(3.0f, 9.0f)
                lineTo(8.0f, 4.0f)
                lineTo(13.0f, 9.0f)
                lineTo(12.295f, 9.705f)
                lineTo(8.5f, 5.915f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(5.915f)
                lineTo(3.705f, 9.705f)
                close()
            }
        }
        .build()
        return _arrowUpToLine!!
    }

private var _arrowUpToLine: ImageVector? = null
