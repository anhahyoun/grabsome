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

val GrabsomeIcons.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.5001f, 8.0f)
                verticalLineTo(8.38f)
                lineTo(14.4451f, 9.245f)
                curveTo(14.6196f, 9.3979f, 14.7354f, 9.6067f, 14.7728f, 9.8357f)
                curveTo(14.8102f, 10.0646f, 14.7668f, 10.2995f, 14.6501f, 10.5f)
                lineTo(13.5101f, 12.5f)
                curveTo(13.4224f, 12.6518f, 13.2964f, 12.778f, 13.1445f, 12.8657f)
                curveTo(12.9927f, 12.9535f, 12.8205f, 12.9998f, 12.6451f, 13.0f)
                curveTo(12.5365f, 13.0008f, 12.4284f, 12.9839f, 12.3251f, 12.95f)
                lineTo(11.1151f, 12.54f)
                curveTo(10.9036f, 12.6794f, 10.6832f, 12.8047f, 10.4551f, 12.915f)
                lineTo(10.2001f, 14.175f)
                curveTo(10.1544f, 14.4052f, 10.0292f, 14.6119f, 9.8463f, 14.7591f)
                curveTo(9.6635f, 14.9063f, 9.4348f, 14.9845f, 9.2001f, 14.98f)
                horizontalLineTo(6.8401f)
                curveTo(6.6055f, 14.9845f, 6.3767f, 14.9063f, 6.1939f, 14.7591f)
                curveTo(6.0111f, 14.6119f, 5.8858f, 14.4052f, 5.8401f, 14.175f)
                lineTo(5.5851f, 12.915f)
                curveTo(5.3587f, 12.8046f, 5.1399f, 12.6794f, 4.9301f, 12.54f)
                lineTo(3.7151f, 12.95f)
                curveTo(3.6119f, 12.9839f, 3.5038f, 13.0008f, 3.3951f, 13.0f)
                curveTo(3.2198f, 12.9998f, 3.0475f, 12.9535f, 2.8957f, 12.8657f)
                curveTo(2.7439f, 12.778f, 2.6178f, 12.6518f, 2.5301f, 12.5f)
                lineTo(1.3501f, 10.5f)
                curveTo(1.2281f, 10.2975f, 1.1817f, 10.0583f, 1.2192f, 9.8249f)
                curveTo(1.2567f, 9.5915f, 1.3758f, 9.379f, 1.5551f, 9.225f)
                lineTo(2.5001f, 8.385f)
                verticalLineTo(8.0f)
                verticalLineTo(7.62f)
                lineTo(1.5551f, 6.755f)
                curveTo(1.3807f, 6.602f, 1.2649f, 6.3932f, 1.2275f, 6.1642f)
                curveTo(1.1901f, 5.9353f, 1.2334f, 5.7004f, 1.3501f, 5.5f)
                lineTo(2.5301f, 3.5f)
                curveTo(2.6178f, 3.3481f, 2.7439f, 3.222f, 2.8957f, 3.1342f)
                curveTo(3.0475f, 3.0464f, 3.2198f, 3.0001f, 3.3951f, 3.0f)
                curveTo(3.5027f, 2.9926f, 3.6108f, 3.0028f, 3.7151f, 3.03f)
                lineTo(4.9051f, 3.46f)
                curveTo(5.1166f, 3.3205f, 5.3371f, 3.1953f, 5.5651f, 3.085f)
                lineTo(5.8201f, 1.825f)
                curveTo(5.8658f, 1.5948f, 5.9911f, 1.388f, 6.1739f, 1.2408f)
                curveTo(6.3567f, 1.0936f, 6.5855f, 1.0155f, 6.8201f, 1.02f)
                horizontalLineTo(9.1601f)
                curveTo(9.3948f, 1.0155f, 9.6235f, 1.0936f, 9.8063f, 1.2408f)
                curveTo(9.9892f, 1.388f, 10.1144f, 1.5948f, 10.1601f, 1.825f)
                lineTo(10.4151f, 3.085f)
                curveTo(10.6415f, 3.1953f, 10.8604f, 3.3206f, 11.0701f, 3.46f)
                lineTo(12.2851f, 3.05f)
                curveTo(12.3884f, 3.016f, 12.4965f, 2.9991f, 12.6051f, 3.0f)
                curveTo(12.7805f, 3.0001f, 12.9527f, 3.0464f, 13.1045f, 3.1342f)
                curveTo(13.2564f, 3.222f, 13.3824f, 3.3481f, 13.4701f, 3.5f)
                lineTo(14.6501f, 5.5f)
                curveTo(14.7739f, 5.7007f, 14.8228f, 5.9388f, 14.788f, 6.1722f)
                curveTo(14.7532f, 6.4055f, 14.6371f, 6.619f, 14.4601f, 6.775f)
                lineTo(13.5001f, 7.615f)
                verticalLineTo(8.0f)
                close()
                moveTo(10.8901f, 11.42f)
                lineTo(12.6051f, 12.0f)
                lineTo(13.7851f, 10.0f)
                lineTo(12.4251f, 8.765f)
                curveTo(12.5176f, 8.2474f, 12.5176f, 7.7175f, 12.4251f, 7.2f)
                lineTo(13.7851f, 6.0f)
                lineTo(12.6051f, 4.0f)
                lineTo(10.8851f, 4.56f)
                curveTo(10.4823f, 4.2245f, 10.0259f, 3.9592f, 9.5351f, 3.775f)
                lineTo(9.1801f, 2.0f)
                horizontalLineTo(6.8201f)
                lineTo(6.4651f, 3.795f)
                curveTo(5.9704f, 3.9741f, 5.5116f, 4.2399f, 5.1101f, 4.58f)
                lineTo(3.3951f, 4.0f)
                lineTo(2.2151f, 6.0f)
                lineTo(3.5751f, 7.235f)
                curveTo(3.4827f, 7.7525f, 3.4827f, 8.2824f, 3.5751f, 8.8f)
                lineTo(2.2151f, 10.0f)
                lineTo(3.3951f, 12.0f)
                lineTo(5.1151f, 11.44f)
                curveTo(5.518f, 11.7754f, 5.9743f, 12.0407f, 6.4651f, 12.225f)
                lineTo(6.8201f, 14.0f)
                horizontalLineTo(9.1801f)
                lineTo(9.5351f, 12.205f)
                curveTo(10.0298f, 12.0258f, 10.4887f, 11.76f, 10.8901f, 11.42f)
                close()
                moveTo(6.3334f, 10.4944f)
                curveTo(6.8268f, 10.8241f, 7.4068f, 11.0f, 8.0001f, 11.0f)
                curveTo(8.3952f, 11.004f, 8.7871f, 10.9292f, 9.1529f, 10.7798f)
                curveTo(9.5187f, 10.6305f, 9.851f, 10.4096f, 10.1304f, 10.1303f)
                curveTo(10.4098f, 9.8509f, 10.6306f, 9.5186f, 10.7799f, 9.1528f)
                curveTo(10.9293f, 8.787f, 11.0041f, 8.3951f, 11.0001f, 8.0f)
                curveTo(11.0001f, 7.4067f, 10.8242f, 6.8266f, 10.4945f, 6.3333f)
                curveTo(10.1649f, 5.8399f, 9.6964f, 5.4554f, 9.1482f, 5.2284f)
                curveTo(8.6f, 5.0013f, 7.9968f, 4.9419f, 7.4149f, 5.0577f)
                curveTo(6.8329f, 5.1734f, 6.2984f, 5.4591f, 5.8788f, 5.8787f)
                curveTo(5.4592f, 6.2982f, 5.1735f, 6.8328f, 5.0578f, 7.4147f)
                curveTo(4.942f, 7.9967f, 5.0014f, 8.5999f, 5.2285f, 9.1481f)
                curveTo(5.4556f, 9.6962f, 5.8401f, 10.1648f, 6.3334f, 10.4944f)
                close()
                moveTo(7.2275f, 6.1397f)
                curveTo(7.473f, 6.0414f, 7.7358f, 5.9938f, 8.0001f, 6.0f)
                curveTo(8.2645f, 5.9938f, 8.5273f, 6.0414f, 8.7727f, 6.1397f)
                curveTo(9.0182f, 6.238f, 9.2411f, 6.3851f, 9.4281f, 6.5721f)
                curveTo(9.615f, 6.759f, 9.7621f, 6.982f, 9.8604f, 7.2274f)
                curveTo(9.9588f, 7.4728f, 10.0063f, 7.7357f, 10.0001f, 8.0f)
                curveTo(10.0063f, 8.2643f, 9.9588f, 8.5272f, 9.8604f, 8.7726f)
                curveTo(9.7621f, 9.018f, 9.615f, 9.241f, 9.4281f, 9.4279f)
                curveTo(9.2411f, 9.6149f, 9.0182f, 9.762f, 8.7727f, 9.8603f)
                curveTo(8.5273f, 9.9586f, 8.2645f, 10.0062f, 8.0001f, 10.0f)
                curveTo(7.7358f, 10.0062f, 7.473f, 9.9586f, 7.2275f, 9.8603f)
                curveTo(6.9821f, 9.762f, 6.7592f, 9.6149f, 6.5722f, 9.4279f)
                curveTo(6.3852f, 9.241f, 6.2382f, 9.018f, 6.1398f, 8.7726f)
                curveTo(6.0415f, 8.5272f, 5.994f, 8.2643f, 6.0001f, 8.0f)
                curveTo(5.994f, 7.7357f, 6.0415f, 7.4728f, 6.1398f, 7.2274f)
                curveTo(6.2382f, 6.982f, 6.3852f, 6.759f, 6.5722f, 6.5721f)
                curveTo(6.7592f, 6.3851f, 6.9821f, 6.238f, 7.2275f, 6.1397f)
                close()
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
