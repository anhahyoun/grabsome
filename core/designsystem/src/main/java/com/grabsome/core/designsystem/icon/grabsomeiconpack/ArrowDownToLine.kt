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

val GrabsomeIcons.ArrowDownToLine: ImageVector
    get() {
        if (_arrowDownToLine != null) {
            return _arrowDownToLine!!
        }
        _arrowDownToLine = Builder(name = "ArrowDownToLine", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.295f, 6.295f)
                lineTo(13.0f, 7.0f)
                lineTo(8.0f, 12.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.705f, 6.295f)
                lineTo(7.5f, 10.085f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(10.085f)
                lineTo(12.295f, 6.295f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                curveTo(14.0f, 14.2652f, 13.8946f, 14.5196f, 13.7071f, 14.7071f)
                curveTo(13.5196f, 14.8946f, 13.2652f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(3.0f)
                curveTo(2.7348f, 15.0f, 2.4804f, 14.8946f, 2.2929f, 14.7071f)
                curveTo(2.1054f, 14.5196f, 2.0f, 14.2652f, 2.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _arrowDownToLine!!
    }

private var _arrowDownToLine: ImageVector? = null
