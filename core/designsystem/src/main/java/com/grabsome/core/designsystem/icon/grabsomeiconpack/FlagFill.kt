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

val GrabsomeIcons.FlagFill: ImageVector
    get() {
        if (_flagFill != null) {
            return _flagFill!!
        }
        _flagFill = Builder(
            name = "FlagFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
            viewportWidth = 16.0f, viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(14.0f)
                lineTo(11.1f, 5.5f)
                lineTo(14.0f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
            .build()
        return _flagFill!!
    }

private var _flagFill: ImageVector? = null
