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

val GrabsomeIcons.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.3889f, 2.4213f)
                curveTo(8.9778f, 2.1466f, 8.4944f, 2.0f, 8.0f, 2.0f)
                curveTo(7.337f, 2.0f, 6.7011f, 2.2634f, 6.2322f, 2.7322f)
                curveTo(5.7634f, 3.2011f, 5.5f, 3.837f, 5.5f, 4.5f)
                curveTo(5.5f, 4.9945f, 5.6466f, 5.4778f, 5.9213f, 5.8889f)
                curveTo(6.196f, 6.3f, 6.5865f, 6.6205f, 7.0433f, 6.8097f)
                curveTo(7.5001f, 6.9989f, 8.0028f, 7.0484f, 8.4877f, 6.952f)
                curveTo(8.9727f, 6.8555f, 9.4181f, 6.6174f, 9.7678f, 6.2678f)
                curveTo(10.1174f, 5.9181f, 10.3555f, 5.4727f, 10.452f, 4.9877f)
                curveTo(10.5484f, 4.5028f, 10.4989f, 4.0001f, 10.3097f, 3.5433f)
                curveTo(10.1205f, 3.0865f, 9.8f, 2.696f, 9.3889f, 2.4213f)
                close()
                moveTo(6.0555f, 1.5899f)
                curveTo(6.6311f, 1.2053f, 7.3078f, 1.0f, 8.0f, 1.0f)
                curveTo(8.9283f, 1.0f, 9.8185f, 1.3687f, 10.4749f, 2.0251f)
                curveTo(11.1313f, 2.6815f, 11.5f, 3.5717f, 11.5f, 4.5f)
                curveTo(11.5f, 5.1922f, 11.2947f, 5.8689f, 10.9101f, 6.4445f)
                curveTo(10.5256f, 7.0201f, 9.9789f, 7.4687f, 9.3394f, 7.7336f)
                curveTo(8.6999f, 7.9985f, 7.9961f, 8.0678f, 7.3172f, 7.9328f)
                curveTo(6.6382f, 7.7977f, 6.0146f, 7.4644f, 5.5251f, 6.9749f)
                curveTo(5.0356f, 6.4854f, 4.7023f, 5.8618f, 4.5672f, 5.1828f)
                curveTo(4.4322f, 4.5039f, 4.5015f, 3.8001f, 4.7664f, 3.1606f)
                curveTo(5.0313f, 2.5211f, 5.4799f, 1.9744f, 6.0555f, 1.5899f)
                close()
                moveTo(12.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.5f)
                curveTo(13.0f, 11.5717f, 12.6313f, 10.6815f, 11.9749f, 10.0251f)
                curveTo(11.3185f, 9.3687f, 10.4283f, 9.0f, 9.5f, 9.0f)
                horizontalLineTo(6.5f)
                curveTo(5.5717f, 9.0f, 4.6815f, 9.3687f, 4.0251f, 10.0251f)
                curveTo(3.3688f, 10.6815f, 3.0f, 11.5717f, 3.0f, 12.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.5f)
                curveTo(4.0f, 11.837f, 4.2634f, 11.2011f, 4.7322f, 10.7322f)
                curveTo(5.2011f, 10.2634f, 5.837f, 10.0f, 6.5f, 10.0f)
                horizontalLineTo(9.5f)
                curveTo(9.8283f, 10.0f, 10.1534f, 10.0647f, 10.4567f, 10.1903f)
                curveTo(10.76f, 10.3159f, 11.0356f, 10.5001f, 11.2678f, 10.7322f)
                curveTo(11.4999f, 10.9644f, 11.6841f, 11.24f, 11.8097f, 11.5433f)
                curveTo(11.9353f, 11.8466f, 12.0f, 12.1717f, 12.0f, 12.5f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
