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

val GrabsomeIcons.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5332f, 4.046f)
                curveTo(13.8608f, 4.9933f, 14.8817f, 6.3088f, 15.4698f, 7.83f)
                curveTo(15.5095f, 7.9398f, 15.5095f, 8.0602f, 15.4698f, 8.17f)
                curveTo(14.8817f, 9.6912f, 13.8608f, 11.0067f, 12.5332f, 11.954f)
                curveTo(11.2056f, 12.9012f, 9.6295f, 13.4387f, 7.9998f, 13.5f)
                curveTo(6.37f, 13.4387f, 4.794f, 12.9012f, 3.4664f, 11.954f)
                curveTo(2.1388f, 11.0067f, 1.1179f, 9.6912f, 0.5298f, 8.17f)
                curveTo(0.4901f, 8.0602f, 0.4901f, 7.9398f, 0.5298f, 7.83f)
                curveTo(1.1179f, 6.3088f, 2.1388f, 4.9933f, 3.4664f, 4.046f)
                curveTo(4.794f, 3.0988f, 6.37f, 2.5613f, 7.9998f, 2.5f)
                curveTo(9.6295f, 2.5613f, 11.2056f, 3.0988f, 12.5332f, 4.046f)
                close()
                moveTo(1.5348f, 8.0f)
                curveTo(2.5498f, 10.535f, 5.3498f, 12.5f, 7.9998f, 12.5f)
                curveTo(10.6498f, 12.5f, 13.4498f, 10.535f, 14.4648f, 8.0f)
                curveTo(13.4498f, 5.465f, 10.6498f, 3.5f, 7.9998f, 3.5f)
                curveTo(5.3498f, 3.5f, 2.5498f, 5.465f, 1.5348f, 8.0f)
                close()
                moveTo(6.3331f, 5.5056f)
                curveTo(6.8264f, 5.176f, 7.4064f, 5.0f, 7.9998f, 5.0f)
                curveTo(8.7954f, 5.0f, 9.5585f, 5.3161f, 10.1211f, 5.8787f)
                curveTo(10.6837f, 6.4413f, 10.9998f, 7.2043f, 10.9998f, 8.0f)
                curveTo(10.9998f, 8.5933f, 10.8238f, 9.1734f, 10.4942f, 9.6667f)
                curveTo(10.1646f, 10.1601f, 9.696f, 10.5446f, 9.1478f, 10.7716f)
                curveTo(8.5997f, 10.9987f, 7.9965f, 11.0581f, 7.4145f, 10.9424f)
                curveTo(6.8326f, 10.8266f, 6.298f, 10.5409f, 5.8785f, 10.1213f)
                curveTo(5.4589f, 9.7018f, 5.1732f, 9.1672f, 5.0574f, 8.5853f)
                curveTo(4.9417f, 8.0033f, 5.0011f, 7.4001f, 5.2281f, 6.852f)
                curveTo(5.4552f, 6.3038f, 5.8397f, 5.8352f, 6.3331f, 5.5056f)
                close()
                moveTo(6.8886f, 9.6629f)
                curveTo(7.2175f, 9.8827f, 7.6042f, 10.0f, 7.9998f, 10.0f)
                curveTo(8.5302f, 10.0f, 9.0389f, 9.7893f, 9.414f, 9.4142f)
                curveTo(9.7891f, 9.0391f, 9.9998f, 8.5304f, 9.9998f, 8.0f)
                curveTo(9.9998f, 7.6044f, 9.8825f, 7.2178f, 9.6627f, 6.8889f)
                curveTo(9.443f, 6.56f, 9.1306f, 6.3036f, 8.7652f, 6.1522f)
                curveTo(8.3997f, 6.0009f, 7.9976f, 5.9613f, 7.6096f, 6.0384f)
                curveTo(7.2216f, 6.1156f, 6.8653f, 6.3061f, 6.5856f, 6.5858f)
                curveTo(6.3059f, 6.8655f, 6.1154f, 7.2219f, 6.0382f, 7.6098f)
                curveTo(5.9611f, 7.9978f, 6.0006f, 8.3999f, 6.152f, 8.7654f)
                curveTo(6.3034f, 9.1308f, 6.5598f, 9.4432f, 6.8886f, 9.6629f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
