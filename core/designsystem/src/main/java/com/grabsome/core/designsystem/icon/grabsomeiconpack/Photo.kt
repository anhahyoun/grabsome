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

val GrabsomeIcons.Photo: ImageVector
    get() {
        if (_photo != null) {
            return _photo!!
        }
        _photo = Builder(name = "Photo", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(13.2652f, 2.0f, 13.5196f, 2.1054f, 13.7071f, 2.2929f)
                curveTo(13.8946f, 2.4804f, 14.0f, 2.7348f, 14.0f, 3.0f)
                verticalLineTo(13.0f)
                curveTo(14.0f, 13.2652f, 13.8946f, 13.5196f, 13.7071f, 13.7071f)
                curveTo(13.5196f, 13.8946f, 13.2652f, 14.0f, 13.0f, 14.0f)
                horizontalLineTo(3.0f)
                curveTo(2.7348f, 14.0f, 2.4804f, 13.8946f, 2.2929f, 13.7071f)
                curveTo(2.1054f, 13.5196f, 2.0f, 13.2652f, 2.0f, 13.0f)
                verticalLineTo(3.0f)
                curveTo(2.0f, 2.7348f, 2.1054f, 2.4804f, 2.2929f, 2.2929f)
                curveTo(2.4804f, 2.1054f, 2.7348f, 2.0f, 3.0f, 2.0f)
                close()
                moveTo(3.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                lineTo(10.5f, 9.5f)
                lineTo(9.705f, 10.295f)
                curveTo(9.5176f, 10.4813f, 9.2642f, 10.5858f, 9.0f, 10.5858f)
                curveTo(8.7358f, 10.5858f, 8.4824f, 10.4813f, 8.295f, 10.295f)
                lineTo(5.5f, 7.5f)
                lineTo(3.0f, 10.0f)
                close()
                moveTo(11.205f, 8.79f)
                lineTo(13.0f, 10.585f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.585f)
                lineTo(4.795f, 6.79f)
                curveTo(4.9824f, 6.6038f, 5.2358f, 6.4992f, 5.5f, 6.4992f)
                curveTo(5.7642f, 6.4992f, 6.0176f, 6.6038f, 6.205f, 6.79f)
                lineTo(9.0f, 9.585f)
                lineTo(9.795f, 8.79f)
                curveTo(9.9824f, 8.6038f, 10.2358f, 8.4992f, 10.5f, 8.4992f)
                curveTo(10.7642f, 8.4992f, 11.0176f, 8.6038f, 11.205f, 8.79f)
                close()
                moveTo(10.3334f, 6.7472f)
                curveTo(10.0867f, 6.912f, 9.7967f, 7.0f, 9.5f, 7.0f)
                curveTo(9.1022f, 7.0f, 8.7206f, 6.842f, 8.4393f, 6.5607f)
                curveTo(8.158f, 6.2794f, 8.0f, 5.8978f, 8.0f, 5.5f)
                curveTo(8.0f, 5.2033f, 8.088f, 4.9133f, 8.2528f, 4.6666f)
                curveTo(8.4176f, 4.42f, 8.6519f, 4.2277f, 8.926f, 4.1142f)
                curveTo(9.2001f, 4.0006f, 9.5017f, 3.9709f, 9.7926f, 4.0288f)
                curveTo(10.0836f, 4.0867f, 10.3509f, 4.2296f, 10.5607f, 4.4393f)
                curveTo(10.7704f, 4.6491f, 10.9133f, 4.9164f, 10.9712f, 5.2074f)
                curveTo(11.0291f, 5.4983f, 10.9994f, 5.7999f, 10.8858f, 6.074f)
                curveTo(10.7723f, 6.3481f, 10.58f, 6.5824f, 10.3334f, 6.7472f)
                close()
                moveTo(9.7778f, 5.0843f)
                curveTo(9.6956f, 5.0293f, 9.5989f, 5.0f, 9.5f, 5.0f)
                curveTo(9.3674f, 5.0f, 9.2402f, 5.0527f, 9.1465f, 5.1465f)
                curveTo(9.0527f, 5.2402f, 9.0f, 5.3674f, 9.0f, 5.5f)
                curveTo(9.0f, 5.5989f, 9.0293f, 5.6956f, 9.0843f, 5.7778f)
                curveTo(9.1392f, 5.86f, 9.2173f, 5.9241f, 9.3087f, 5.9619f)
                curveTo(9.4f, 5.9998f, 9.5006f, 6.0097f, 9.5976f, 5.9904f)
                curveTo(9.6945f, 5.9711f, 9.7836f, 5.9235f, 9.8535f, 5.8535f)
                curveTo(9.9235f, 5.7836f, 9.9711f, 5.6945f, 9.9904f, 5.5975f)
                curveTo(10.0097f, 5.5006f, 9.9998f, 5.4f, 9.9619f, 5.3087f)
                curveTo(9.9241f, 5.2173f, 9.86f, 5.1392f, 9.7778f, 5.0843f)
                close()
            }
        }
        .build()
        return _photo!!
    }

private var _photo: ImageVector? = null
