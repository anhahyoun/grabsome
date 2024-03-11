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

val GrabsomeIcons.Thumbsup: ImageVector
    get() {
        if (_thumbsup != null) {
            return _thumbsup!!
        }
        _thumbsup = Builder(name = "Thumbsup", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                curveTo(9.9996f, 2.6023f, 9.8414f, 2.221f, 9.5602f, 1.9398f)
                curveTo(9.279f, 1.6586f, 8.8977f, 1.5004f, 8.5f, 1.5f)
                horizontalLineTo(7.4336f)
                curveTo(7.1931f, 1.501f, 6.961f, 1.5881f, 6.7793f, 1.7457f)
                curveTo(6.5977f, 1.9032f, 6.4785f, 2.1207f, 6.4436f, 2.3586f)
                lineTo(6.0209f, 5.3169f)
                lineTo(4.2324f, 8.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.5f)
                curveTo(12.4279f, 14.999f, 13.3176f, 14.6299f, 13.9737f, 13.9737f)
                curveTo(14.6299f, 13.3176f, 14.999f, 12.4279f, 15.0f, 11.5f)
                verticalLineTo(8.0f)
                curveTo(14.9994f, 7.4697f, 14.7885f, 6.9614f, 14.4136f, 6.5864f)
                curveTo(14.0386f, 6.2115f, 13.5303f, 6.0006f, 13.0f, 6.0f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(14.0f, 11.5f)
                curveTo(13.9992f, 12.1628f, 13.7356f, 12.7983f, 13.2669f, 13.2669f)
                curveTo(12.7983f, 13.7356f, 12.1628f, 13.9992f, 11.5f, 14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.6514f)
                lineTo(6.9789f, 5.6831f)
                lineTo(7.4336f, 2.5f)
                horizontalLineTo(8.5f)
                curveTo(8.6326f, 2.5001f, 8.7597f, 2.5528f, 8.8534f, 2.6466f)
                curveTo(8.9472f, 2.7403f, 8.9999f, 2.8674f, 9.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                curveTo(13.2651f, 7.0003f, 13.5193f, 7.1058f, 13.7067f, 7.2933f)
                curveTo(13.8942f, 7.4807f, 13.9997f, 7.7349f, 14.0f, 8.0f)
                verticalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _thumbsup!!
    }

private var _thumbsup: ImageVector? = null
