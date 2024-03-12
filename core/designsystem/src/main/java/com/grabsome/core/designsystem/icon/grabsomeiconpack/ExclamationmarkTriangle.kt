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

val GrabsomeIcons.ExclamationmarkTriangle: ImageVector
    get() {
        if (_exclamationmarkTriangle != null) {
            return _exclamationmarkTriangle!!
        }
        _exclamationmarkTriangle = Builder(name = "ExclamationmarkTriangle", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.2548f, 14.9357f)
                curveTo(1.3297f, 14.9779f, 1.4141f, 15.0f, 1.5f, 15.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5859f, 15.0f, 14.6704f, 14.9779f, 14.7452f, 14.9357f)
                curveTo(14.8201f, 14.8936f, 14.8828f, 14.8329f, 14.9274f, 14.7595f)
                curveTo(14.972f, 14.686f, 14.9969f, 14.6024f, 14.9997f, 14.5165f)
                curveTo(15.0026f, 14.4307f, 14.9832f, 14.3455f, 14.9436f, 14.2693f)
                lineTo(8.4436f, 1.7693f)
                curveTo(8.4014f, 1.6881f, 8.3377f, 1.6201f, 8.2595f, 1.5726f)
                curveTo(8.1813f, 1.5251f, 8.0915f, 1.5f, 8.0f, 1.5f)
                curveTo(7.9085f, 1.5f, 7.8187f, 1.5251f, 7.7405f, 1.5726f)
                curveTo(7.6623f, 1.6201f, 7.5986f, 1.6881f, 7.5564f, 1.7693f)
                lineTo(1.0564f, 14.2693f)
                curveTo(1.0168f, 14.3455f, 0.9974f, 14.4307f, 1.0003f, 14.5165f)
                curveTo(1.0031f, 14.6024f, 1.028f, 14.686f, 1.0726f, 14.7595f)
                curveTo(1.1172f, 14.8329f, 1.1799f, 14.8936f, 1.2548f, 14.9357f)
                close()
                moveTo(13.6757f, 13.9984f)
                lineTo(13.6747f, 14.0f)
                horizontalLineTo(2.3254f)
                lineTo(2.3244f, 13.9984f)
                lineTo(7.999f, 3.0857f)
                horizontalLineTo(8.001f)
                lineTo(13.6757f, 13.9984f)
                close()
                moveTo(8.5f, 6.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.0f)
                close()
                moveTo(8.0f, 11.5f)
                curveTo(7.8517f, 11.5f, 7.7067f, 11.544f, 7.5833f, 11.6264f)
                curveTo(7.46f, 11.7088f, 7.3639f, 11.8259f, 7.3071f, 11.963f)
                curveTo(7.2503f, 12.1f, 7.2355f, 12.2508f, 7.2644f, 12.3963f)
                curveTo(7.2934f, 12.5418f, 7.3648f, 12.6754f, 7.4697f, 12.7803f)
                curveTo(7.5746f, 12.8852f, 7.7082f, 12.9566f, 7.8537f, 12.9856f)
                curveTo(7.9992f, 13.0145f, 8.15f, 12.9997f, 8.287f, 12.9429f)
                curveTo(8.4241f, 12.8861f, 8.5412f, 12.79f, 8.6236f, 12.6667f)
                curveTo(8.706f, 12.5433f, 8.75f, 12.3983f, 8.75f, 12.25f)
                curveTo(8.75f, 12.0511f, 8.671f, 11.8603f, 8.5303f, 11.7197f)
                curveTo(8.3897f, 11.579f, 8.1989f, 11.5f, 8.0f, 11.5f)
                close()
            }
        }
        .build()
        return _exclamationmarkTriangle!!
    }

private var _exclamationmarkTriangle: ImageVector? = null
