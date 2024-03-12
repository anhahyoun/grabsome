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

val GrabsomeIcons.ChevronSort: ImageVector
    get() {
        if (_chevronSort != null) {
            return _chevronSort!!
        }
        _chevronSort = Builder(name = "ChevronSort", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 5.5f)
                lineTo(8.0f, 2.0f)
                lineTo(4.5f, 5.5f)
                lineTo(5.205f, 6.205f)
                lineTo(8.0f, 3.415f)
                lineTo(10.795f, 6.205f)
                lineTo(11.5f, 5.5f)
                close()
                moveTo(4.5f, 10.5f)
                lineTo(8.0f, 14.0f)
                lineTo(11.5f, 10.5f)
                lineTo(10.795f, 9.795f)
                lineTo(8.0f, 12.585f)
                lineTo(5.205f, 9.795f)
                lineTo(4.5f, 10.5f)
                close()
            }
        }
        .build()
        return _chevronSort!!
    }

private var _chevronSort: ImageVector? = null
