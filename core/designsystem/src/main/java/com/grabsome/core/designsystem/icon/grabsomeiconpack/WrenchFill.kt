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

val GrabsomeIcons.WrenchFill: ImageVector
    get() {
        if (_wrenchFill != null) {
            return _wrenchFill!!
        }
        _wrenchFill = Builder(name = "WrenchFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0502f, 1.0f)
                curveTo(5.0914f, 0.9967f, 4.1526f, 1.2749f, 3.3502f, 1.8f)
                lineTo(6.5502f, 5.0f)
                curveTo(6.6568f, 5.0909f, 6.7441f, 5.2022f, 6.807f, 5.3274f)
                curveTo(6.8699f, 5.4526f, 6.9071f, 5.5891f, 6.9164f, 5.7289f)
                curveTo(6.9257f, 5.8687f, 6.907f, 6.0089f, 6.8613f, 6.1413f)
                curveTo(6.8155f, 6.2738f, 6.7438f, 6.3957f, 6.6502f, 6.5f)
                curveTo(6.546f, 6.5935f, 6.424f, 6.6653f, 6.2916f, 6.711f)
                curveTo(6.1592f, 6.7567f, 6.0189f, 6.7754f, 5.8792f, 6.7661f)
                curveTo(5.7394f, 6.7568f, 5.6029f, 6.7196f, 5.4777f, 6.6567f)
                curveTo(5.3525f, 6.5938f, 5.2412f, 6.5065f, 5.1502f, 6.4f)
                lineTo(1.8502f, 3.2f)
                curveTo(1.2797f, 4.0395f, 0.9828f, 5.035f, 1.0002f, 6.05f)
                curveTo(1.0055f, 7.3877f, 1.5393f, 8.6691f, 2.4852f, 9.615f)
                curveTo(3.4311f, 10.561f, 4.7125f, 11.0947f, 6.0502f, 11.1f)
                curveTo(6.488f, 11.1024f, 6.9245f, 11.052f, 7.3502f, 10.95f)
                lineTo(10.7002f, 14.3f)
                curveTo(11.171f, 14.7707f, 11.8095f, 15.0352f, 12.4752f, 15.0352f)
                curveTo(13.141f, 15.0352f, 13.7795f, 14.7707f, 14.2502f, 14.3f)
                curveTo(14.721f, 13.8292f, 14.9855f, 13.1907f, 14.9855f, 12.525f)
                curveTo(14.9855f, 11.8592f, 14.721f, 11.2207f, 14.2502f, 10.75f)
                lineTo(10.9002f, 7.4f)
                curveTo(11.0023f, 6.9742f, 11.0526f, 6.5377f, 11.0502f, 6.1f)
                curveTo(11.0635f, 5.435f, 10.944f, 4.774f, 10.6987f, 4.1558f)
                curveTo(10.4534f, 3.5376f, 10.0872f, 2.9746f, 9.6216f, 2.4996f)
                curveTo(9.156f, 2.0247f, 8.6003f, 1.6474f, 7.987f, 1.3899f)
                curveTo(7.3738f, 1.1324f, 6.7154f, 0.9998f, 6.0502f, 1.0f)
                close()
            }
        }
        .build()
        return _wrenchFill!!
    }

private var _wrenchFill: ImageVector? = null
