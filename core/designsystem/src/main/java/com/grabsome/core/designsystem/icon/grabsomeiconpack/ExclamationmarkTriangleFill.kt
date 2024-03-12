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

val GrabsomeIcons.ExclamationmarkTriangleFill: ImageVector
    get() {
        if (_exclamationmarkTriangleFill != null) {
            return _exclamationmarkTriangleFill!!
        }
        _exclamationmarkTriangleFill = Builder(name = "ExclamationmarkTriangleFill", defaultWidth =
                16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
                16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9436f, 14.2693f)
                lineTo(8.4436f, 1.7693f)
                curveTo(8.4014f, 1.6881f, 8.3377f, 1.6201f, 8.2595f, 1.5726f)
                curveTo(8.1813f, 1.5251f, 8.0915f, 1.5f, 8.0f, 1.5f)
                curveTo(7.9085f, 1.5f, 7.8187f, 1.5251f, 7.7405f, 1.5726f)
                curveTo(7.6623f, 1.6201f, 7.5986f, 1.6881f, 7.5564f, 1.7693f)
                lineTo(1.0564f, 14.2693f)
                curveTo(1.0168f, 14.3455f, 0.9974f, 14.4306f, 1.0003f, 14.5165f)
                curveTo(1.0031f, 14.6024f, 1.028f, 14.686f, 1.0726f, 14.7595f)
                curveTo(1.1172f, 14.8329f, 1.1799f, 14.8936f, 1.2548f, 14.9357f)
                curveTo(1.3297f, 14.9779f, 1.4141f, 15.0f, 1.5f, 15.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5859f, 15.0f, 14.6704f, 14.9779f, 14.7452f, 14.9357f)
                curveTo(14.8201f, 14.8936f, 14.8828f, 14.8329f, 14.9274f, 14.7595f)
                curveTo(14.972f, 14.686f, 14.9969f, 14.6024f, 14.9997f, 14.5165f)
                curveTo(15.0026f, 14.4306f, 14.9832f, 14.3455f, 14.9436f, 14.2693f)
                close()
                moveTo(7.4375f, 5.5f)
                horizontalLineTo(8.5625f)
                verticalLineTo(10.5f)
                horizontalLineTo(7.4375f)
                verticalLineTo(5.5f)
                close()
                moveTo(8.0f, 13.5f)
                curveTo(7.8517f, 13.5f, 7.7067f, 13.456f, 7.5833f, 13.3736f)
                curveTo(7.46f, 13.2912f, 7.3639f, 13.174f, 7.3071f, 13.037f)
                curveTo(7.2503f, 12.9f, 7.2355f, 12.7492f, 7.2644f, 12.6037f)
                curveTo(7.2934f, 12.4582f, 7.3648f, 12.3246f, 7.4697f, 12.2197f)
                curveTo(7.5746f, 12.1148f, 7.7082f, 12.0433f, 7.8537f, 12.0144f)
                curveTo(7.9992f, 11.9855f, 8.15f, 12.0003f, 8.287f, 12.0571f)
                curveTo(8.4241f, 12.1138f, 8.5412f, 12.21f, 8.6236f, 12.3333f)
                curveTo(8.706f, 12.4567f, 8.75f, 12.6017f, 8.75f, 12.75f)
                curveTo(8.75f, 12.9489f, 8.671f, 13.1397f, 8.5303f, 13.2803f)
                curveTo(8.3897f, 13.421f, 8.1989f, 13.5f, 8.0f, 13.5f)
                close()
            }
        }
        .build()
        return _exclamationmarkTriangleFill!!
    }

private var _exclamationmarkTriangleFill: ImageVector? = null
