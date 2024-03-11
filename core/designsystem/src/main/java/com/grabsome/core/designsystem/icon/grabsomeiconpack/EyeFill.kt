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

val GrabsomeIcons.EyeFill: ImageVector
    get() {
        if (_eyeFill != null) {
            return _eyeFill!!
        }
        _eyeFill = Builder(name = "EyeFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
                moveTo(6.1942f, 10.7023f)
                curveTo(6.7286f, 11.0594f, 7.357f, 11.25f, 7.9998f, 11.25f)
                curveTo(8.8613f, 11.2487f, 9.6872f, 10.9058f, 10.2964f, 10.2966f)
                curveTo(10.9056f, 9.6874f, 11.2485f, 8.8616f, 11.2498f, 8.0f)
                curveTo(11.2498f, 7.3572f, 11.0592f, 6.7289f, 10.7021f, 6.1944f)
                curveTo(10.3449f, 5.6599f, 9.8374f, 5.2434f, 9.2435f, 4.9974f)
                curveTo(8.6496f, 4.7514f, 7.9962f, 4.687f, 7.3657f, 4.8124f)
                curveTo(6.7353f, 4.9378f, 6.1562f, 5.2474f, 5.7017f, 5.7019f)
                curveTo(5.2472f, 6.1564f, 4.9376f, 6.7355f, 4.8122f, 7.366f)
                curveTo(4.6868f, 7.9964f, 4.7512f, 8.6499f, 4.9972f, 9.2437f)
                curveTo(5.2432f, 9.8376f, 5.6597f, 10.3452f, 6.1942f, 10.7023f)
                close()
                moveTo(9.9998f, 8.0f)
                curveTo(9.9998f, 9.1046f, 9.1044f, 10.0f, 7.9998f, 10.0f)
                curveTo(6.8952f, 10.0f, 5.9998f, 9.1046f, 5.9998f, 8.0f)
                curveTo(5.9998f, 6.8954f, 6.8952f, 6.0f, 7.9998f, 6.0f)
                curveTo(9.1044f, 6.0f, 9.9998f, 6.8954f, 9.9998f, 8.0f)
                close()
            }
        }
        .build()
        return _eyeFill!!
    }

private var _eyeFill: ImageVector? = null
