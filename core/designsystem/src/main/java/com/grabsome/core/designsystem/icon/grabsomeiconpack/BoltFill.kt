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

val GrabsomeIcons.BoltFill: ImageVector
    get() {
        if (_boltFill != null) {
            return _boltFill!!
        }
        _boltFill = Builder(name = "BoltFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8048f, 14.96f)
                curveTo(5.7024f, 14.9168f, 5.6174f, 14.8408f, 5.5631f, 14.7439f)
                curveTo(5.5088f, 14.647f, 5.4883f, 14.5348f, 5.5048f, 14.425f)
                lineTo(6.4148f, 8.5f)
                horizontalLineTo(3.9998f)
                curveTo(3.9232f, 8.5021f, 3.8472f, 8.4865f, 3.7776f, 8.4545f)
                curveTo(3.708f, 8.4226f, 3.6467f, 8.375f, 3.5984f, 8.3156f)
                curveTo(3.5501f, 8.2562f, 3.516f, 8.1865f, 3.4989f, 8.1118f)
                curveTo(3.4818f, 8.0371f, 3.4821f, 7.9595f, 3.4998f, 7.885f)
                lineTo(4.9998f, 1.385f)
                curveTo(5.0262f, 1.2731f, 5.0903f, 1.1738f, 5.1814f, 1.1037f)
                curveTo(5.2724f, 1.0336f, 5.3849f, 0.9969f, 5.4998f, 1.0f)
                horizontalLineTo(10.4998f)
                curveTo(10.5745f, 0.9998f, 10.6483f, 1.0162f, 10.7158f, 1.0483f)
                curveTo(10.7833f, 1.0803f, 10.8427f, 1.127f, 10.8898f, 1.185f)
                curveTo(10.9375f, 1.2437f, 10.9713f, 1.3124f, 10.9886f, 1.386f)
                curveTo(11.0059f, 1.4596f, 11.0063f, 1.5362f, 10.9898f, 1.61f)
                lineTo(10.1248f, 5.5f)
                horizontalLineTo(12.4998f)
                curveTo(12.5935f, 5.4998f, 12.6854f, 5.526f, 12.7649f, 5.5755f)
                curveTo(12.8445f, 5.625f, 12.9085f, 5.6959f, 12.9498f, 5.78f)
                curveTo(12.9856f, 5.8608f, 12.9994f, 5.9496f, 12.9897f, 6.0374f)
                curveTo(12.9801f, 6.1253f, 12.9473f, 6.209f, 12.8948f, 6.28f)
                lineTo(6.3948f, 14.78f)
                curveTo(6.3509f, 14.8451f, 6.2922f, 14.899f, 6.2236f, 14.9372f)
                curveTo(6.1549f, 14.9754f, 6.0783f, 14.9969f, 5.9998f, 15.0f)
                curveTo(5.9329f, 14.9988f, 5.8668f, 14.9852f, 5.8048f, 14.96f)
                close()
            }
        }
        .build()
        return _boltFill!!
    }

private var _boltFill: ImageVector? = null
