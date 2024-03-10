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

val GrabsomeIcons.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2249f, 3.0f)
                curveTo(11.5889f, 2.9997f, 11.9494f, 3.0721f, 12.2851f, 3.2129f)
                curveTo(12.6208f, 3.3537f, 12.925f, 3.5601f, 13.1799f, 3.82f)
                curveTo(13.7051f, 4.3532f, 13.9995f, 5.0716f, 13.9995f, 5.82f)
                curveTo(13.9995f, 6.5684f, 13.7051f, 7.2868f, 13.1799f, 7.82f)
                lineTo(7.9999f, 13.065f)
                lineTo(2.8199f, 7.82f)
                curveTo(2.2947f, 7.2868f, 2.0003f, 6.5684f, 2.0003f, 5.82f)
                curveTo(2.0003f, 5.0716f, 2.2947f, 4.3532f, 2.8199f, 3.82f)
                curveTo(3.0749f, 3.5603f, 3.3792f, 3.354f, 3.7148f, 3.2132f)
                curveTo(4.0505f, 3.0723f, 4.4109f, 2.9998f, 4.7749f, 2.9998f)
                curveTo(5.1389f, 2.9998f, 5.4993f, 3.0723f, 5.8349f, 3.2132f)
                curveTo(6.1706f, 3.354f, 6.4748f, 3.5603f, 6.7299f, 3.82f)
                lineTo(7.9999f, 5.12f)
                lineTo(9.2649f, 3.83f)
                curveTo(9.519f, 3.567f, 9.8236f, 3.3579f, 10.1603f, 3.2153f)
                curveTo(10.4971f, 3.0727f, 10.8592f, 2.9995f, 11.2249f, 3.0f)
                close()
                moveTo(11.2249f, 2.0f)
                curveTo(10.7277f, 1.9996f, 10.2354f, 2.0984f, 9.7769f, 2.2908f)
                curveTo(9.3185f, 2.4831f, 8.903f, 2.765f, 8.5549f, 3.12f)
                lineTo(7.9999f, 3.68f)
                lineTo(7.4449f, 3.12f)
                curveTo(7.0964f, 2.7656f, 6.6808f, 2.4842f, 6.2224f, 2.2921f)
                curveTo(5.764f, 2.1f, 5.2719f, 2.001f, 4.7749f, 2.001f)
                curveTo(4.2779f, 2.001f, 3.7858f, 2.1f, 3.3274f, 2.2921f)
                curveTo(2.869f, 2.4842f, 2.4534f, 2.7656f, 2.1049f, 3.12f)
                curveTo(1.3958f, 3.8418f, 0.9985f, 4.8132f, 0.9985f, 5.825f)
                curveTo(0.9985f, 6.8368f, 1.3958f, 7.8082f, 2.1049f, 8.53f)
                lineTo(7.9999f, 14.5f)
                lineTo(13.8949f, 8.53f)
                curveTo(14.6039f, 7.8082f, 15.0012f, 6.8368f, 15.0012f, 5.825f)
                curveTo(15.0012f, 4.8132f, 14.6039f, 3.8418f, 13.8949f, 3.12f)
                curveTo(13.5464f, 2.7655f, 13.1309f, 2.4838f, 12.6725f, 2.2915f)
                curveTo(12.2141f, 2.0992f, 11.722f, 2.0001f, 11.2249f, 2.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
