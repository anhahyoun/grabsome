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

val GrabsomeIcons.ThumbsupFill: ImageVector
    get() {
        if (_thumbsupFill != null) {
            return _thumbsupFill!!
        }
        _thumbsupFill = Builder(name = "ThumbsupFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5f, 15.0f)
                horizontalLineTo(11.5f)
                curveTo(12.4279f, 14.999f, 13.3176f, 14.6299f, 13.9737f, 13.9737f)
                curveTo(14.6299f, 13.3176f, 14.999f, 12.4279f, 15.0f, 11.5f)
                verticalLineTo(8.0f)
                curveTo(14.9994f, 7.4697f, 14.7885f, 6.9614f, 14.4136f, 6.5864f)
                curveTo(14.0386f, 6.2115f, 13.5303f, 6.0006f, 13.0f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                curveTo(8.9996f, 2.6023f, 8.8414f, 2.221f, 8.5602f, 1.9398f)
                curveTo(8.279f, 1.6586f, 7.8977f, 1.5004f, 7.5f, 1.5f)
                horizontalLineTo(7.4336f)
                curveTo(7.1932f, 1.501f, 6.9611f, 1.5882f, 6.7794f, 1.7457f)
                curveTo(6.5978f, 1.9033f, 6.4787f, 2.1208f, 6.4437f, 2.3586f)
                lineTo(6.0211f, 5.3169f)
                lineTo(4.5f, 7.5986f)
                verticalLineTo(15.0f)
                close()
                moveTo(1.0f, 8.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _thumbsupFill!!
    }

private var _thumbsupFill: ImageVector? = null
