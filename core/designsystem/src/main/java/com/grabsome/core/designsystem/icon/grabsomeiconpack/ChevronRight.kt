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

val GrabsomeIcons.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) {
            return _chevronRight!!
        }
        _chevronRight = Builder(name = "ChevronRight", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 8.0f)
                lineTo(6.0001f, 13.0f)
                lineTo(5.3f, 12.3f)
                lineTo(9.6f, 8.0f)
                lineTo(5.3f, 3.7f)
                lineTo(6.0001f, 3.0f)
                lineTo(11.0f, 8.0f)
                close()
            }
        }
        .build()
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
