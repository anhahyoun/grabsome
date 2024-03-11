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

val GrabsomeIcons.BubbleFill: ImageVector
    get() {
        if (_bubbleFill != null) {
            return _bubbleFill!!
        }
        _bubbleFill = Builder(name = "BubbleFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5879f, 14.0801f)
                curveTo(4.6777f, 14.1895f, 4.8066f, 14.2441f, 4.9746f, 14.2441f)
                curveTo(5.0918f, 14.2441f, 5.1973f, 14.2129f, 5.291f, 14.1504f)
                curveTo(5.3887f, 14.0918f, 5.5078f, 13.998f, 5.6484f, 13.8691f)
                lineTo(7.7637f, 11.9355f)
                horizontalLineTo(12.3164f)
                curveTo(12.8984f, 11.9355f, 13.3887f, 11.832f, 13.7871f, 11.625f)
                curveTo(14.1855f, 11.418f, 14.4863f, 11.1152f, 14.6895f, 10.7168f)
                curveTo(14.8965f, 10.3184f, 15.0f, 9.832f, 15.0f, 9.2578f)
                verticalLineTo(4.7695f)
                curveTo(15.0f, 4.1953f, 14.8965f, 3.709f, 14.6895f, 3.3105f)
                curveTo(14.4863f, 2.9121f, 14.1855f, 2.6094f, 13.7871f, 2.4023f)
                curveTo(13.3887f, 2.1914f, 12.8984f, 2.0859f, 12.3164f, 2.0859f)
                horizontalLineTo(3.6836f)
                curveTo(3.1016f, 2.0859f, 2.6113f, 2.1914f, 2.2129f, 2.4023f)
                curveTo(1.8145f, 2.6094f, 1.5117f, 2.9121f, 1.3047f, 3.3105f)
                curveTo(1.1016f, 3.709f, 1.0f, 4.1953f, 1.0f, 4.7695f)
                verticalLineTo(9.2578f)
                curveTo(1.0f, 9.832f, 1.1016f, 10.3184f, 1.3047f, 10.7168f)
                curveTo(1.5117f, 11.1152f, 1.8145f, 11.418f, 2.2129f, 11.625f)
                curveTo(2.6113f, 11.832f, 3.1016f, 11.9355f, 3.6836f, 11.9355f)
                horizontalLineTo(4.4531f)
                verticalLineTo(13.6406f)
                curveTo(4.4531f, 13.8242f, 4.4981f, 13.9707f, 4.5879f, 14.0801f)
                close()
                moveTo(11.3335f, 5.3333f)
                horizontalLineTo(4.6668f)
                verticalLineTo(6.1667f)
                horizontalLineTo(11.3335f)
                verticalLineTo(5.3333f)
                close()
                moveTo(8.8334f, 7.8333f)
                horizontalLineTo(4.6667f)
                verticalLineTo(8.6667f)
                horizontalLineTo(8.8334f)
                verticalLineTo(7.8333f)
                close()
            }
        }
        .build()
        return _bubbleFill!!
    }

private var _bubbleFill: ImageVector? = null
