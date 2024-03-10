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

val GrabsomeIcons.HouseFill: ImageVector
    get() {
        if (_houseFill != null) {
            return _houseFill!!
        }
        _houseFill = Builder(name = "HouseFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.3062f, 1.1069f)
                curveTo(8.2174f, 1.0377f, 8.1081f, 1.0001f, 7.9955f, 1.0001f)
                curveTo(7.8829f, 1.0001f, 7.7736f, 1.0377f, 7.6848f, 1.1069f)
                lineTo(0.5f, 6.7097f)
                lineTo(1.1214f, 7.4956f)
                lineTo(2.0f, 6.8105f)
                verticalLineTo(13.0f)
                curveTo(2.0005f, 13.2651f, 2.1061f, 13.5191f, 2.2935f, 13.7065f)
                curveTo(2.4809f, 13.894f, 2.735f, 13.9995f, 3.0f, 14.0f)
                horizontalLineTo(13.0f)
                curveTo(13.2651f, 13.9995f, 13.5191f, 13.894f, 13.7066f, 13.7066f)
                curveTo(13.894f, 13.5192f, 13.9995f, 13.2651f, 14.0f, 13.0f)
                verticalLineTo(6.815f)
                lineTo(14.8786f, 7.5f)
                lineTo(15.5f, 6.7141f)
                lineTo(8.3062f, 1.1069f)
                close()
                moveTo(9.5f, 9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(9.0f)
                curveTo(6.5003f, 8.7349f, 6.6057f, 8.4807f, 6.7932f, 8.2932f)
                curveTo(6.9807f, 8.1057f, 7.2349f, 8.0003f, 7.5f, 8.0f)
                horizontalLineTo(8.5f)
                curveTo(8.7651f, 8.0003f, 9.0193f, 8.1058f, 9.2068f, 8.2933f)
                curveTo(9.3942f, 8.4807f, 9.4997f, 8.7349f, 9.5f, 9.0f)
                close()
            }
        }
        .build()
        return _houseFill!!
    }

private var _houseFill: ImageVector? = null
