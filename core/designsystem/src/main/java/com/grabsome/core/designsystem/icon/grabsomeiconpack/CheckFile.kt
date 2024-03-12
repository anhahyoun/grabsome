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

val GrabsomeIcons.CheckFile: ImageVector
    get() {
        if (_checkFile != null) {
            return _checkFile!!
        }
        _checkFile = Builder(name = "CheckFile", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 2.5f)
                horizontalLineTo(12.5f)
                curveTo(12.7652f, 2.5f, 13.0196f, 2.6054f, 13.2071f, 2.7929f)
                curveTo(13.3946f, 2.9804f, 13.5f, 3.2348f, 13.5f, 3.5f)
                verticalLineTo(14.0f)
                curveTo(13.5f, 14.2652f, 13.3946f, 14.5196f, 13.2071f, 14.7071f)
                curveTo(13.0196f, 14.8946f, 12.7652f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(3.5f)
                curveTo(3.2348f, 15.0f, 2.9804f, 14.8946f, 2.7929f, 14.7071f)
                curveTo(2.6054f, 14.5196f, 2.5f, 14.2652f, 2.5f, 14.0f)
                verticalLineTo(3.5f)
                curveTo(2.5f, 3.2348f, 2.6054f, 2.9804f, 2.7929f, 2.7929f)
                curveTo(2.9804f, 2.6054f, 3.2348f, 2.5f, 3.5f, 2.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                curveTo(5.0f, 1.7348f, 5.1054f, 1.4804f, 5.2929f, 1.2929f)
                curveTo(5.4804f, 1.1054f, 5.7348f, 1.0f, 6.0f, 1.0f)
                horizontalLineTo(10.0f)
                curveTo(10.2652f, 1.0f, 10.5196f, 1.1054f, 10.7071f, 1.2929f)
                curveTo(10.8946f, 1.4804f, 11.0f, 1.7348f, 11.0f, 2.0f)
                verticalLineTo(2.5f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(3.5f, 14.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(14.0f)
                close()
                moveTo(5.205f, 8.295f)
                lineTo(7.0f, 10.09f)
                lineTo(10.795f, 6.29f)
                lineTo(11.5f, 7.0f)
                lineTo(7.0f, 11.5f)
                lineTo(4.5f, 9.0f)
                lineTo(5.205f, 8.295f)
                close()
            }
        }
        .build()
        return _checkFile!!
    }

private var _checkFile: ImageVector? = null
