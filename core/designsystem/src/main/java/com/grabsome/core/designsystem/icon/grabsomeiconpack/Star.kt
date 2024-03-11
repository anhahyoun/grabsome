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

private val GrabsomeIcons.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(
            name = "Star", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
            viewportWidth = 16.0f, viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0001f, 3.26f)
                lineTo(9.3801f, 6.05f)
                lineTo(9.6101f, 6.55f)
                lineTo(10.1101f, 6.625f)
                lineTo(13.1901f, 7.07f)
                lineTo(11.0001f, 9.22f)
                lineTo(10.6251f, 9.585f)
                lineTo(10.7151f, 10.085f)
                lineTo(11.2401f, 13.15f)
                lineTo(8.4851f, 11.705f)
                lineTo(8.0001f, 11.5f)
                lineTo(7.5351f, 11.745f)
                lineTo(4.7801f, 13.17f)
                lineTo(5.2801f, 10.105f)
                lineTo(5.3701f, 9.605f)
                lineTo(5.0001f, 9.22f)
                lineTo(2.7901f, 7.045f)
                lineTo(5.8701f, 6.6f)
                lineTo(6.3701f, 6.525f)
                lineTo(6.6001f, 6.025f)
                lineTo(8.0001f, 3.26f)
                close()
                moveTo(8.0001f, 1.0f)
                lineTo(5.7251f, 5.61f)
                lineTo(0.6401f, 6.345f)
                lineTo(4.3201f, 9.935f)
                lineTo(3.4501f, 15.0f)
                lineTo(8.0001f, 12.61f)
                lineTo(12.5501f, 15.0f)
                lineTo(11.6801f, 9.935f)
                lineTo(15.3601f, 6.35f)
                lineTo(10.2751f, 5.61f)
                lineTo(8.0001f, 1.0f)
                close()
            }
        }
            .build()
        return _star!!
    }

private var _star: ImageVector? = null
