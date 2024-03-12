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

val GrabsomeIcons.InfoCircleFill: ImageVector
    get() {
        if (_infoCircleFill != null) {
            return _infoCircleFill!!
        }
        _infoCircleFill = Builder(name = "InfoCircleFill", defaultWidth = 16.0.dp, defaultHeight =
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
                moveTo(8.0f, 4.0f)
                curveTo(8.1483f, 4.0f, 8.2933f, 4.044f, 8.4167f, 4.1264f)
                curveTo(8.54f, 4.2088f, 8.6362f, 4.3259f, 8.6929f, 4.463f)
                curveTo(8.7497f, 4.6f, 8.7645f, 4.7508f, 8.7356f, 4.8963f)
                curveTo(8.7066f, 5.0418f, 8.6352f, 5.1754f, 8.5303f, 5.2803f)
                curveTo(8.4254f, 5.3852f, 8.2918f, 5.4566f, 8.1463f, 5.4856f)
                curveTo(8.0008f, 5.5145f, 7.85f, 5.4997f, 7.713f, 5.4429f)
                curveTo(7.576f, 5.3861f, 7.4588f, 5.29f, 7.3764f, 5.1667f)
                curveTo(7.294f, 5.0433f, 7.25f, 4.8983f, 7.25f, 4.75f)
                curveTo(7.25f, 4.5511f, 7.329f, 4.3603f, 7.4697f, 4.2197f)
                curveTo(7.6103f, 4.079f, 7.8011f, 4.0f, 8.0f, 4.0f)
                close()
                moveTo(10.0f, 12.0625f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.9375f)
                horizontalLineTo(7.4375f)
                verticalLineTo(8.0625f)
                horizontalLineTo(6.5f)
                verticalLineTo(6.9375f)
                horizontalLineTo(8.5625f)
                verticalLineTo(10.9375f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0625f)
                close()
            }
        }
        .build()
        return _infoCircleFill!!
    }

private var _infoCircleFill: ImageVector? = null
