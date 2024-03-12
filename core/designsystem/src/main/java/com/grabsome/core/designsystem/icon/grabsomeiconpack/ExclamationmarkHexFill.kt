package com.grabsome.core.designsystem.icon.grabsomeiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.icon.GrabsomeIcons

val GrabsomeIcons.ExclamationmarkHexFill: ImageVector
    get() {
        if (_exclamationmarkHexFill != null) {
            return _exclamationmarkHexFill!!
        }
        _exclamationmarkHexFill = Builder(name = "ExclamationmarkHexFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.9558f, 7.6465f)
                    curveTo(0.7605f, 7.8417f, 0.7605f, 8.1583f, 0.9558f, 8.3536f)
                    lineTo(7.6465f, 15.0443f)
                    curveTo(7.8418f, 15.2396f, 8.1583f, 15.2396f, 8.3536f, 15.0443f)
                    lineTo(15.0443f, 8.3536f)
                    curveTo(15.2396f, 8.1583f, 15.2396f, 7.8417f, 15.0443f, 7.6465f)
                    lineTo(8.3536f, 0.9557f)
                    curveTo(8.1583f, 0.7605f, 7.8418f, 0.7605f, 7.6465f, 0.9557f)
                    lineTo(0.9558f, 7.6465f)
                    close()
                    moveTo(8.5626f, 4.0f)
                    horizontalLineTo(7.4376f)
                    verticalLineTo(9.5f)
                    horizontalLineTo(8.5626f)
                    verticalLineTo(4.0f)
                    close()
                    moveTo(7.5834f, 12.3736f)
                    curveTo(7.7067f, 12.456f, 7.8517f, 12.5f, 8.0001f, 12.5f)
                    curveTo(8.199f, 12.5f, 8.3897f, 12.421f, 8.5304f, 12.2803f)
                    curveTo(8.6711f, 12.1397f, 8.7501f, 11.9489f, 8.7501f, 11.75f)
                    curveTo(8.7501f, 11.6017f, 8.7061f, 11.4567f, 8.6237f, 11.3333f)
                    curveTo(8.5413f, 11.21f, 8.4241f, 11.1139f, 8.2871f, 11.0571f)
                    curveTo(8.15f, 11.0003f, 7.9992f, 10.9855f, 7.8538f, 11.0144f)
                    curveTo(7.7083f, 11.0434f, 7.5746f, 11.1148f, 7.4697f, 11.2197f)
                    curveTo(7.3649f, 11.3246f, 7.2934f, 11.4582f, 7.2645f, 11.6037f)
                    curveTo(7.2355f, 11.7492f, 7.2504f, 11.9f, 7.3072f, 12.037f)
                    curveTo(7.3639f, 12.1741f, 7.4601f, 12.2912f, 7.5834f, 12.3736f)
                    close()
                }
            }
        }
        .build()
        return _exclamationmarkHexFill!!
    }

private var _exclamationmarkHexFill: ImageVector? = null
