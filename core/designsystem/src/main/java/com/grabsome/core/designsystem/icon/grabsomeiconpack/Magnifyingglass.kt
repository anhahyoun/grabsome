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

val GrabsomeIcons.Magnifyingglass: ImageVector
    get() {
        if (_magnifyingglass != null) {
            return _magnifyingglass!!
        }
        _magnifyingglass = Builder(name = "Magnifyingglass", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5001f, 13.793f)
                lineTo(10.7241f, 10.0169f)
                curveTo(11.6314f, 8.9276f, 12.0839f, 7.5304f, 11.9873f, 6.116f)
                curveTo(11.8908f, 4.7015f, 11.2526f, 3.3788f, 10.2057f, 2.4229f)
                curveTo(9.1587f, 1.467f, 7.7835f, 0.9515f, 6.3661f, 0.9837f)
                curveTo(4.9488f, 1.0159f, 3.5984f, 1.5933f, 2.5959f, 2.5958f)
                curveTo(1.5934f, 3.5983f, 1.016f, 4.9487f, 0.9838f, 6.366f)
                curveTo(0.9516f, 7.7834f, 1.4671f, 9.1586f, 2.423f, 10.2055f)
                curveTo(3.3789f, 11.2525f, 4.7017f, 11.8907f, 6.1161f, 11.9872f)
                curveTo(7.5305f, 12.0838f, 8.9277f, 11.6313f, 10.017f, 10.724f)
                lineTo(13.7931f, 14.5f)
                lineTo(14.5001f, 13.793f)
                close()
                moveTo(2.0001f, 6.5f)
                curveTo(2.0001f, 5.61f, 2.264f, 4.74f, 2.7585f, 3.9999f)
                curveTo(3.253f, 3.2599f, 3.9558f, 2.6831f, 4.778f, 2.3426f)
                curveTo(5.6003f, 2.002f, 6.5051f, 1.9128f, 7.378f, 2.0865f)
                curveTo(8.2509f, 2.2601f, 9.0528f, 2.6887f, 9.6821f, 3.318f)
                curveTo(10.3114f, 3.9474f, 10.74f, 4.7492f, 10.9137f, 5.6221f)
                curveTo(11.0873f, 6.495f, 10.9982f, 7.3998f, 10.6576f, 8.2221f)
                curveTo(10.317f, 9.0443f, 9.7402f, 9.7472f, 9.0002f, 10.2416f)
                curveTo(8.2602f, 10.7361f, 7.3901f, 11.0f, 6.5001f, 11.0f)
                curveTo(5.3071f, 10.9987f, 4.1632f, 10.5241f, 3.3196f, 9.6805f)
                curveTo(2.476f, 8.8369f, 2.0014f, 7.6931f, 2.0001f, 6.5f)
                close()
            }
        }
        .build()
        return _magnifyingglass!!
    }

private var _magnifyingglass: ImageVector? = null
