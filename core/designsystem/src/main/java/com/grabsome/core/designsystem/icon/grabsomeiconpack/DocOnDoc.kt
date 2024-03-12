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

val GrabsomeIcons.DocOnDoc: ImageVector
    get() {
        if (_docOnDoc != null) {
            return _docOnDoc!!
        }
        _docOnDoc = Builder(name = "DocOnDoc", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 1.0f, 2.0f, 1.45f, 2.0f, 2.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(10.65f, 4.3f)
                lineTo(13.7f, 7.35f)
                curveTo(13.9f, 7.55f, 14.0f, 7.8f, 14.0f, 8.05f)
                verticalLineTo(14.0f)
                curveTo(14.0f, 14.55f, 13.55f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(6.0f)
                curveTo(5.45f, 15.0f, 5.0f, 14.55f, 5.0f, 14.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.45f, 5.45f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(10.25f, 4.0f, 10.5f, 4.1f, 10.65f, 4.3f)
                close()
                moveTo(12.95f, 8.0f)
                lineTo(10.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.95f)
                close()
                moveTo(6.0f, 5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 9.0f, 9.0f, 8.55f, 9.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _docOnDoc!!
    }

private var _docOnDoc: ImageVector? = null
