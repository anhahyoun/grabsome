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

val GrabsomeIcons.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(13.375f)
                lineTo(8.45f, 11.58f)
                lineTo(8.0f, 11.355f)
                lineTo(7.55f, 11.58f)
                lineTo(4.0f, 13.375f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 1.0f)
                horizontalLineTo(4.0f)
                curveTo(3.7348f, 1.0f, 3.4804f, 1.1054f, 3.2929f, 1.2929f)
                curveTo(3.1054f, 1.4804f, 3.0f, 1.7348f, 3.0f, 2.0f)
                verticalLineTo(15.0f)
                lineTo(8.0f, 12.5f)
                lineTo(13.0f, 15.0f)
                verticalLineTo(2.0f)
                curveTo(13.0f, 1.7348f, 12.8946f, 1.4804f, 12.7071f, 1.2929f)
                curveTo(12.5196f, 1.1054f, 12.2652f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
