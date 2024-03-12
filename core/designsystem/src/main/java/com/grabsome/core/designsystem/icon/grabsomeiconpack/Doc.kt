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

val GrabsomeIcons.Doc: ImageVector
    get() {
        if (_doc != null) {
            return _doc!!
        }
        _doc = Builder(name = "Doc", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.85f, 4.65f)
                lineTo(9.35f, 1.15f)
                curveTo(9.306f, 1.1011f, 9.2519f, 1.0624f, 9.1915f, 1.0365f)
                curveTo(9.1311f, 1.0106f, 9.0657f, 0.9982f, 9.0f, 1.0f)
                horizontalLineTo(4.0f)
                curveTo(3.735f, 1.0008f, 3.4811f, 1.1064f, 3.2938f, 1.2938f)
                curveTo(3.1064f, 1.4811f, 3.0008f, 1.735f, 3.0f, 2.0f)
                verticalLineTo(14.0f)
                curveTo(3.0008f, 14.265f, 3.1064f, 14.5189f, 3.2938f, 14.7062f)
                curveTo(3.4811f, 14.8936f, 3.735f, 14.9992f, 4.0f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(12.265f, 14.9992f, 12.5189f, 14.8936f, 12.7062f, 14.7062f)
                curveTo(12.8936f, 14.5189f, 12.9992f, 14.265f, 13.0f, 14.0f)
                verticalLineTo(5.0f)
                curveTo(13.0018f, 4.9343f, 12.9894f, 4.8689f, 12.9635f, 4.8085f)
                curveTo(12.9376f, 4.7481f, 12.8989f, 4.694f, 12.85f, 4.65f)
                close()
                moveTo(9.0f, 2.2f)
                lineTo(11.8f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.2f)
                close()
                moveTo(12.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                curveTo(8.0008f, 5.265f, 8.1064f, 5.5189f, 8.2937f, 5.7063f)
                curveTo(8.4811f, 5.8936f, 8.735f, 5.9992f, 9.0f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _doc!!
    }

private var _doc: ImageVector? = null
