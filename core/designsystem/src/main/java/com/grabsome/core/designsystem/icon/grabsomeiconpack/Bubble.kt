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

val GrabsomeIcons.Bubble: ImageVector
    get() {
        if (_bubble != null) {
            return _bubble!!
        }
        _bubble = Builder(name = "Bubble", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.1289f, 14.0039f)
                curveTo(4.2422f, 14.1406f, 4.4004f, 14.209f, 4.6035f, 14.209f)
                curveTo(4.7481f, 14.209f, 4.8809f, 14.1699f, 5.0019f, 14.0918f)
                curveTo(5.1231f, 14.0137f, 5.2715f, 13.8965f, 5.4473f, 13.7402f)
                lineTo(7.4688f, 11.9414f)
                horizontalLineTo(12.3164f)
                curveTo(12.8984f, 11.9414f, 13.3887f, 11.8379f, 13.7871f, 11.6309f)
                curveTo(14.1855f, 11.4199f, 14.4863f, 11.1152f, 14.6895f, 10.7168f)
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
                curveTo(1.5117f, 11.1152f, 1.8145f, 11.4199f, 2.2129f, 11.6309f)
                curveTo(2.6113f, 11.8379f, 3.1016f, 11.9414f, 3.6836f, 11.9414f)
                horizontalLineTo(3.9648f)
                verticalLineTo(13.4648f)
                curveTo(3.9648f, 13.6914f, 4.0195f, 13.8711f, 4.1289f, 14.0039f)
                close()
                moveTo(6.7188f, 11.2734f)
                lineTo(4.8438f, 13.1367f)
                verticalLineTo(11.4375f)
                curveTo(4.8438f, 11.2773f, 4.8106f, 11.1641f, 4.7441f, 11.0977f)
                curveTo(4.6777f, 11.0312f, 4.5644f, 10.998f, 4.4043f, 10.998f)
                horizontalLineTo(3.6836f)
                curveTo(3.0898f, 10.998f, 2.6504f, 10.8516f, 2.3652f, 10.5586f)
                curveTo(2.084f, 10.2617f, 1.9434f, 9.8262f, 1.9434f, 9.252f)
                verticalLineTo(4.7695f)
                curveTo(1.9434f, 4.1992f, 2.084f, 3.7676f, 2.3652f, 3.4746f)
                curveTo(2.6504f, 3.1777f, 3.0898f, 3.0293f, 3.6836f, 3.0293f)
                horizontalLineTo(12.3164f)
                curveTo(12.9062f, 3.0293f, 13.3438f, 3.1777f, 13.6289f, 3.4746f)
                curveTo(13.9141f, 3.7676f, 14.0566f, 4.1992f, 14.0566f, 4.7695f)
                verticalLineTo(9.252f)
                curveTo(14.0566f, 9.8262f, 13.9141f, 10.2617f, 13.6289f, 10.5586f)
                curveTo(13.3438f, 10.8516f, 12.9062f, 10.998f, 12.3164f, 10.998f)
                horizontalLineTo(7.4336f)
                curveTo(7.2695f, 10.998f, 7.1367f, 11.0156f, 7.0352f, 11.0508f)
                curveTo(6.9336f, 11.0859f, 6.8281f, 11.1602f, 6.7188f, 11.2734f)
                close()
                moveTo(12.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bubble!!
    }

private var _bubble: ImageVector? = null
