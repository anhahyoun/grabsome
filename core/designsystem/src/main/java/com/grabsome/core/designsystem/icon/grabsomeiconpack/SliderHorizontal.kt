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

val GrabsomeIcons.SliderHorizontal: ImageVector
    get() {
        if (_sliderHorizontal != null) {
            return _sliderHorizontal!!
        }
        _sliderHorizontal = Builder(name = "SliderHorizontal", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.95f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.95f)
                curveTo(12.7f, 6.15f, 11.7f, 7.0f, 10.5f, 7.0f)
                curveTo(9.3f, 7.0f, 8.3f, 6.15f, 8.05f, 5.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.05f)
                curveTo(8.3f, 2.85f, 9.3f, 2.0f, 10.5f, 2.0f)
                curveTo(11.7f, 2.0f, 12.7f, 2.85f, 12.95f, 4.0f)
                close()
                moveTo(9.0f, 4.5f)
                curveTo(9.0f, 5.35f, 9.65f, 6.0f, 10.5f, 6.0f)
                curveTo(11.35f, 6.0f, 12.0f, 5.35f, 12.0f, 4.5f)
                curveTo(12.0f, 3.65f, 11.35f, 3.0f, 10.5f, 3.0f)
                curveTo(9.65f, 3.0f, 9.0f, 3.65f, 9.0f, 4.5f)
                close()
                moveTo(3.05f, 12.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.05f)
                curveTo(3.3f, 9.85f, 4.3f, 9.0f, 5.5f, 9.0f)
                curveTo(6.7f, 9.0f, 7.7f, 9.85f, 7.95f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.95f)
                curveTo(7.7f, 13.15f, 6.7f, 14.0f, 5.5f, 14.0f)
                curveTo(4.3f, 14.0f, 3.3f, 13.15f, 3.05f, 12.0f)
                close()
                moveTo(7.0f, 11.5f)
                curveTo(7.0f, 10.65f, 6.35f, 10.0f, 5.5f, 10.0f)
                curveTo(4.65f, 10.0f, 4.0f, 10.65f, 4.0f, 11.5f)
                curveTo(4.0f, 12.35f, 4.65f, 13.0f, 5.5f, 13.0f)
                curveTo(6.35f, 13.0f, 7.0f, 12.35f, 7.0f, 11.5f)
                close()
            }
        }
        .build()
        return _sliderHorizontal!!
    }

private var _sliderHorizontal: ImageVector? = null
