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

val GrabsomeIcons.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3535f, 9.6465f)
                lineTo(13.0f, 8.2929f)
                verticalLineTo(6.5f)
                curveTo(12.9984f, 5.261f, 12.5374f, 4.0665f, 11.7062f, 3.1477f)
                curveTo(10.875f, 2.2288f, 9.7327f, 1.6508f, 8.5f, 1.5254f)
                verticalLineTo(0.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(1.5254f)
                curveTo(6.2673f, 1.6508f, 5.125f, 2.2288f, 4.2938f, 3.1477f)
                curveTo(3.4626f, 4.0665f, 3.0016f, 5.261f, 3.0f, 6.5f)
                verticalLineTo(8.2929f)
                lineTo(1.6465f, 9.6465f)
                curveTo(1.5527f, 9.7402f, 1.5f, 9.8674f, 1.5f, 10.0f)
                verticalLineTo(11.5f)
                curveTo(1.5f, 11.6326f, 1.5527f, 11.7598f, 1.6465f, 11.8536f)
                curveTo(1.7402f, 11.9473f, 1.8674f, 12.0f, 2.0f, 12.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(12.3884f)
                curveTo(5.4892f, 13.0227f, 5.7128f, 13.6387f, 6.1279f, 14.1183f)
                curveTo(6.5431f, 14.598f, 7.1207f, 14.9076f, 7.75f, 14.9878f)
                curveTo(8.0976f, 15.0222f, 8.4485f, 14.9836f, 8.7803f, 14.8743f)
                curveTo(9.112f, 14.765f, 9.4172f, 14.5875f, 9.6762f, 14.3532f)
                curveTo(9.9352f, 14.1189f, 10.1423f, 13.8329f, 10.2842f, 13.5138f)
                curveTo(10.4261f, 13.1946f, 10.4996f, 12.8493f, 10.5f, 12.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                curveTo(14.1326f, 12.0f, 14.2598f, 11.9473f, 14.3536f, 11.8536f)
                curveTo(14.4473f, 11.7598f, 14.5f, 11.6326f, 14.5f, 11.5f)
                verticalLineTo(10.0f)
                curveTo(14.5f, 9.8674f, 14.4473f, 9.7402f, 14.3535f, 9.6465f)
                close()
                moveTo(9.5f, 12.5f)
                curveTo(9.5f, 12.8978f, 9.342f, 13.2794f, 9.0607f, 13.5607f)
                curveTo(8.7794f, 13.842f, 8.3978f, 14.0f, 8.0f, 14.0f)
                curveTo(7.6022f, 14.0f, 7.2206f, 13.842f, 6.9393f, 13.5607f)
                curveTo(6.658f, 13.2794f, 6.5f, 12.8978f, 6.5f, 12.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(13.5f, 11.0f)
                horizontalLineTo(2.5f)
                verticalLineTo(10.2071f)
                lineTo(3.8535f, 8.8535f)
                curveTo(3.9473f, 8.7598f, 4.0f, 8.6326f, 4.0f, 8.5f)
                verticalLineTo(6.5f)
                curveTo(4.0f, 5.4391f, 4.4214f, 4.4217f, 5.1716f, 3.6716f)
                curveTo(5.9217f, 2.9214f, 6.9391f, 2.5f, 8.0f, 2.5f)
                curveTo(9.0609f, 2.5f, 10.0783f, 2.9214f, 10.8284f, 3.6716f)
                curveTo(11.5786f, 4.4217f, 12.0f, 5.4391f, 12.0f, 6.5f)
                verticalLineTo(8.5f)
                curveTo(12.0f, 8.6326f, 12.0527f, 8.7598f, 12.1465f, 8.8535f)
                lineTo(13.5f, 10.2071f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
