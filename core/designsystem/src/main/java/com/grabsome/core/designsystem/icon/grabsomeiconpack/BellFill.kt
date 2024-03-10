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

val GrabsomeIcons.BellFill: ImageVector
    get() {
        if (_bellFill != null) {
            return _bellFill!!
        }
        _bellFill = Builder(name = "BellFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
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
                curveTo(1.6f, 9.6929f, 1.5632f, 9.748f, 1.5381f, 9.8087f)
                curveTo(1.5129f, 9.8693f, 1.5f, 9.9343f, 1.5f, 10.0f)
                verticalLineTo(11.5f)
                curveTo(1.5f, 11.6326f, 1.5527f, 11.7598f, 1.6465f, 11.8536f)
                curveTo(1.7402f, 11.9473f, 1.8674f, 12.0f, 2.0f, 12.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(12.5f)
                curveTo(5.5f, 13.163f, 5.7634f, 13.7989f, 6.2322f, 14.2678f)
                curveTo(6.7011f, 14.7366f, 7.337f, 15.0f, 8.0f, 15.0f)
                curveTo(8.663f, 15.0f, 9.2989f, 14.7366f, 9.7678f, 14.2678f)
                curveTo(10.2366f, 13.7989f, 10.5f, 13.163f, 10.5f, 12.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                curveTo(14.1326f, 12.0f, 14.2598f, 11.9473f, 14.3536f, 11.8536f)
                curveTo(14.4473f, 11.7598f, 14.5f, 11.6326f, 14.5f, 11.5f)
                verticalLineTo(10.0f)
                curveTo(14.5f, 9.9343f, 14.4871f, 9.8693f, 14.4619f, 9.8087f)
                curveTo(14.4368f, 9.748f, 14.3999f, 9.6929f, 14.3535f, 9.6465f)
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
            }
        }
        .build()
        return _bellFill!!
    }

private var _bellFill: ImageVector? = null
