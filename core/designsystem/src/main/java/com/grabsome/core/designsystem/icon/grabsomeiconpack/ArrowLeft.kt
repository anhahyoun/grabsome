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

val GrabsomeIcons.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(
            name = "ArrowLeft", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
            viewportWidth = 16.0f, viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 13.0f)
                lineTo(7.705f, 12.295f)
                lineTo(3.915f, 8.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(3.915f)
                lineTo(7.705f, 3.705f)
                lineTo(7.0f, 3.0f)
                lineTo(2.0f, 8.0f)
                lineTo(7.0f, 13.0f)
                close()
            }
        }
            .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
