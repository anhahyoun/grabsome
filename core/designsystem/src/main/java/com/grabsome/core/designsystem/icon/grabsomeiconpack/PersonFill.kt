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

val GrabsomeIcons.PersonFill: ImageVector
    get() {
        if (_personFill != null) {
            return _personFill!!
        }
        _personFill = Builder(name = "PersonFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0899f, 6.4445f)
                curveTo(4.7053f, 5.8689f, 4.5f, 5.1922f, 4.5f, 4.5f)
                curveTo(4.5f, 3.5717f, 4.8688f, 2.6815f, 5.5251f, 2.0251f)
                curveTo(6.1815f, 1.3687f, 7.0717f, 1.0f, 8.0f, 1.0f)
                curveTo(8.6922f, 1.0f, 9.3689f, 1.2053f, 9.9445f, 1.5899f)
                curveTo(10.5201f, 1.9744f, 10.9687f, 2.5211f, 11.2336f, 3.1606f)
                curveTo(11.4985f, 3.8001f, 11.5678f, 4.5039f, 11.4327f, 5.1828f)
                curveTo(11.2977f, 5.8618f, 10.9644f, 6.4854f, 10.4749f, 6.9749f)
                curveTo(9.9854f, 7.4644f, 9.3617f, 7.7977f, 8.6828f, 7.9328f)
                curveTo(8.0039f, 8.0678f, 7.3001f, 7.9985f, 6.6606f, 7.7336f)
                curveTo(6.0211f, 7.4687f, 5.4744f, 7.0201f, 5.0899f, 6.4445f)
                close()
                moveTo(13.0f, 12.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.5f)
                curveTo(3.0011f, 11.5721f, 3.3702f, 10.6825f, 4.0263f, 10.0263f)
                curveTo(4.6825f, 9.3702f, 5.5721f, 9.0011f, 6.5f, 9.0f)
                horizontalLineTo(9.5f)
                curveTo(10.4279f, 9.0011f, 11.3175f, 9.3702f, 11.9737f, 10.0263f)
                curveTo(12.6298f, 10.6825f, 12.9989f, 11.5721f, 13.0f, 12.5f)
                close()
            }
        }
        .build()
        return _personFill!!
    }

private var _personFill: ImageVector? = null
