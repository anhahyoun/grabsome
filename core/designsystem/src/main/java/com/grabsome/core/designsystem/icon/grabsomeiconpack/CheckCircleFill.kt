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

val GrabsomeIcons.CheckCircleFill: ImageVector
    get() {
        if (_checkCircleFill != null) {
            return _checkCircleFill!!
        }
        _checkCircleFill = Builder(name = "CheckCircleFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.0f)
                curveTo(6.6155f, 1.0f, 5.2622f, 1.4105f, 4.111f, 2.1797f)
                curveTo(2.9599f, 2.9489f, 2.0627f, 4.0421f, 1.5329f, 5.3212f)
                curveTo(1.003f, 6.6003f, 0.8644f, 8.0078f, 1.1345f, 9.3656f)
                curveTo(1.4046f, 10.7235f, 2.0713f, 11.9708f, 3.0503f, 12.9497f)
                curveTo(4.0292f, 13.9287f, 5.2765f, 14.5954f, 6.6344f, 14.8655f)
                curveTo(7.9922f, 15.1356f, 9.3997f, 14.997f, 10.6788f, 14.4672f)
                curveTo(11.9579f, 13.9373f, 13.0511f, 13.0401f, 13.8203f, 11.889f)
                curveTo(14.5895f, 10.7378f, 15.0f, 9.3845f, 15.0f, 8.0f)
                curveTo(15.0f, 6.1435f, 14.2625f, 4.363f, 12.9497f, 3.0503f)
                curveTo(11.637f, 1.7375f, 9.8565f, 1.0f, 8.0f, 1.0f)
                close()
                moveTo(7.0f, 10.7954f)
                lineTo(4.5f, 8.2954f)
                lineTo(5.2953f, 7.5f)
                lineTo(7.0f, 9.2046f)
                lineTo(10.705f, 5.5f)
                lineTo(11.5029f, 6.293f)
                lineTo(7.0f, 10.7954f)
                close()
            }
        }
        .build()
        return _checkCircleFill!!
    }

private var _checkCircleFill: ImageVector? = null
