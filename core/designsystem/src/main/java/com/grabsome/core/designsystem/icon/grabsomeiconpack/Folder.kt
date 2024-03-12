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

val GrabsomeIcons.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.585f, 3.0f)
                lineTo(7.295f, 4.705f)
                lineTo(7.585f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.585f)
                close()
                moveTo(5.585f, 2.0f)
                horizontalLineTo(2.0f)
                curveTo(1.7348f, 2.0f, 1.4804f, 2.1054f, 1.2929f, 2.2929f)
                curveTo(1.1054f, 2.4804f, 1.0f, 2.7348f, 1.0f, 3.0f)
                verticalLineTo(13.0f)
                curveTo(1.0f, 13.2652f, 1.1054f, 13.5196f, 1.2929f, 13.7071f)
                curveTo(1.4804f, 13.8946f, 1.7348f, 14.0f, 2.0f, 14.0f)
                horizontalLineTo(14.0f)
                curveTo(14.2652f, 14.0f, 14.5196f, 13.8946f, 14.7071f, 13.7071f)
                curveTo(14.8946f, 13.5196f, 15.0f, 13.2652f, 15.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(15.0f, 4.7348f, 14.8946f, 4.4804f, 14.7071f, 4.2929f)
                curveTo(14.5196f, 4.1054f, 14.2652f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(8.0f)
                lineTo(6.295f, 2.295f)
                curveTo(6.202f, 2.2014f, 6.0913f, 2.1272f, 5.9695f, 2.0765f)
                curveTo(5.8476f, 2.0259f, 5.717f, 1.9999f, 5.585f, 2.0f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
