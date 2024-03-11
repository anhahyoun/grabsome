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

val GrabsomeIcons.CircleTrianglepathFill: ImageVector
    get() {
        if (_circleTrianglepathFill != null) {
            return _circleTrianglepathFill!!
        }
        _circleTrianglepathFill = Builder(name = "CircleTrianglepathFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 7.0f)
                curveTo(7.4067f, 7.0f, 6.8266f, 6.824f, 6.3333f, 6.4944f)
                curveTo(5.8399f, 6.1648f, 5.4554f, 5.6962f, 5.2284f, 5.148f)
                curveTo(5.0013f, 4.5999f, 4.9419f, 3.9967f, 5.0577f, 3.4147f)
                curveTo(5.1734f, 2.8328f, 5.4591f, 2.2982f, 5.8787f, 1.8787f)
                curveTo(6.2982f, 1.4591f, 6.8328f, 1.1734f, 7.4147f, 1.0576f)
                curveTo(7.9967f, 0.9419f, 8.5999f, 1.0013f, 9.1481f, 1.2284f)
                curveTo(9.6962f, 1.4554f, 10.1648f, 1.8399f, 10.4944f, 2.3333f)
                curveTo(10.8241f, 2.8266f, 11.0f, 3.4067f, 11.0f, 4.0f)
                curveTo(10.9991f, 4.7954f, 10.6827f, 5.5579f, 10.1203f, 6.1203f)
                curveTo(9.5579f, 6.6827f, 8.7954f, 6.9991f, 8.0f, 7.0f)
                close()
                moveTo(4.0f, 14.0f)
                curveTo(3.4067f, 14.0f, 2.8266f, 13.8241f, 2.3333f, 13.4944f)
                curveTo(1.8399f, 13.1648f, 1.4554f, 12.6962f, 1.2284f, 12.1481f)
                curveTo(1.0013f, 11.5999f, 0.9419f, 10.9967f, 1.0576f, 10.4147f)
                curveTo(1.1734f, 9.8328f, 1.4591f, 9.2982f, 1.8787f, 8.8787f)
                curveTo(2.2982f, 8.4591f, 2.8328f, 8.1734f, 3.4147f, 8.0576f)
                curveTo(3.9967f, 7.9419f, 4.5999f, 8.0013f, 5.148f, 8.2284f)
                curveTo(5.6962f, 8.4554f, 6.1648f, 8.8399f, 6.4944f, 9.3333f)
                curveTo(6.824f, 9.8266f, 7.0f, 10.4067f, 7.0f, 11.0f)
                curveTo(6.9991f, 11.7954f, 6.6827f, 12.5579f, 6.1203f, 13.1203f)
                curveTo(5.5579f, 13.6827f, 4.7954f, 13.9991f, 4.0f, 14.0f)
                close()
                moveTo(10.3333f, 13.4944f)
                curveTo(10.8266f, 13.8241f, 11.4067f, 14.0f, 12.0f, 14.0f)
                curveTo(12.7954f, 13.9991f, 13.5579f, 13.6827f, 14.1203f, 13.1203f)
                curveTo(14.6827f, 12.5579f, 14.9991f, 11.7954f, 15.0f, 11.0f)
                curveTo(15.0f, 10.4067f, 14.8241f, 9.8266f, 14.4944f, 9.3333f)
                curveTo(14.1648f, 8.8399f, 13.6962f, 8.4554f, 13.1481f, 8.2284f)
                curveTo(12.5999f, 8.0013f, 11.9967f, 7.9419f, 11.4147f, 8.0576f)
                curveTo(10.8328f, 8.1734f, 10.2982f, 8.4591f, 9.8787f, 8.8787f)
                curveTo(9.4591f, 9.2982f, 9.1734f, 9.8328f, 9.0576f, 10.4147f)
                curveTo(8.9419f, 10.9967f, 9.0013f, 11.5999f, 9.2284f, 12.1481f)
                curveTo(9.4554f, 12.6962f, 9.8399f, 13.1648f, 10.3333f, 13.4944f)
                close()
            }
        }
        .build()
        return _circleTrianglepathFill!!
    }

private var _circleTrianglepathFill: ImageVector? = null
