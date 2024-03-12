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

val GrabsomeIcons.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = Builder(name = "Plus", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 7.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null
