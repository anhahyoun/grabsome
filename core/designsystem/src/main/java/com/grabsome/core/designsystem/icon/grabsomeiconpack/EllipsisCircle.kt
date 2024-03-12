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

val GrabsomeIcons.EllipsisCircle: ImageVector
    get() {
        if (_ellipsisCircle != null) {
            return _ellipsisCircle!!
        }
        _ellipsisCircle = Builder(name = "EllipsisCircle", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.111f, 13.8203f)
                curveTo(5.2622f, 14.5895f, 6.6155f, 15.0f, 8.0f, 15.0f)
                curveTo(9.8559f, 14.9979f, 11.6351f, 14.2597f, 12.9474f, 12.9474f)
                curveTo(14.2597f, 11.6351f, 14.9979f, 9.8559f, 15.0f, 8.0f)
                curveTo(15.0f, 6.6155f, 14.5895f, 5.2622f, 13.8203f, 4.111f)
                curveTo(13.0511f, 2.9599f, 11.9579f, 2.0627f, 10.6788f, 1.5329f)
                curveTo(9.3997f, 1.003f, 7.9922f, 0.8644f, 6.6344f, 1.1345f)
                curveTo(5.2765f, 1.4046f, 4.0292f, 2.0713f, 3.0503f, 3.0503f)
                curveTo(2.0713f, 4.0292f, 1.4046f, 5.2765f, 1.1345f, 6.6344f)
                curveTo(0.8644f, 7.9922f, 1.003f, 9.3997f, 1.5329f, 10.6788f)
                curveTo(2.0627f, 11.9579f, 2.9599f, 13.0511f, 4.111f, 13.8203f)
                close()
                moveTo(4.6666f, 3.0112f)
                curveTo(5.6533f, 2.3519f, 6.8133f, 2.0f, 8.0f, 2.0f)
                curveTo(9.5907f, 2.0018f, 11.1158f, 2.6345f, 12.2406f, 3.7594f)
                curveTo(13.3655f, 4.8842f, 13.9982f, 6.4093f, 14.0f, 8.0f)
                curveTo(14.0f, 9.1867f, 13.6481f, 10.3467f, 12.9888f, 11.3334f)
                curveTo(12.3295f, 12.3201f, 11.3925f, 13.0892f, 10.2961f, 13.5433f)
                curveTo(9.1997f, 13.9974f, 7.9934f, 14.1162f, 6.8295f, 13.8847f)
                curveTo(5.6656f, 13.6532f, 4.5965f, 13.0818f, 3.7574f, 12.2426f)
                curveTo(2.9183f, 11.4035f, 2.3468f, 10.3344f, 2.1153f, 9.1705f)
                curveTo(1.8838f, 8.0067f, 2.0026f, 6.8003f, 2.4567f, 5.7039f)
                curveTo(2.9109f, 4.6076f, 3.6799f, 3.6705f, 4.6666f, 3.0112f)
                close()
                moveTo(5.5f, 8.0f)
                curveTo(5.5f, 8.5523f, 5.0523f, 9.0f, 4.5f, 9.0f)
                curveTo(3.9477f, 9.0f, 3.5f, 8.5523f, 3.5f, 8.0f)
                curveTo(3.5f, 7.4477f, 3.9477f, 7.0f, 4.5f, 7.0f)
                curveTo(5.0523f, 7.0f, 5.5f, 7.4477f, 5.5f, 8.0f)
                close()
                moveTo(12.5f, 8.0f)
                curveTo(12.5f, 8.5523f, 12.0523f, 9.0f, 11.5f, 9.0f)
                curveTo(10.9477f, 9.0f, 10.5f, 8.5523f, 10.5f, 8.0f)
                curveTo(10.5f, 7.4477f, 10.9477f, 7.0f, 11.5f, 7.0f)
                curveTo(12.0523f, 7.0f, 12.5f, 7.4477f, 12.5f, 8.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveTo(8.5523f, 9.0f, 9.0f, 8.5523f, 9.0f, 8.0f)
                curveTo(9.0f, 7.4477f, 8.5523f, 7.0f, 8.0f, 7.0f)
                curveTo(7.4477f, 7.0f, 7.0f, 7.4477f, 7.0f, 8.0f)
                curveTo(7.0f, 8.5523f, 7.4477f, 9.0f, 8.0f, 9.0f)
                close()
            }
        }
        .build()
        return _ellipsisCircle!!
    }

private var _ellipsisCircle: ImageVector? = null
