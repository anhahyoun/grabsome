package com.grabsome.feature.home.filter

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.grabsome.core.designsystem.ext.rippleClickable
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Xmark
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

@Composable
internal fun HomeFilterFullDialog() {
    Dialog(onDismissRequest = { /*TODO*/ }) {
        HomeFilterFullScreen()
    }
}

@Composable
private fun HomeFilterFullScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 2.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .rippleClickable {
                        /** TODO */
                    }
                    .size(40.dp)
                    .padding(8.dp),
                imageVector = GrabsomeIcons.Xmark,
                contentDescription = "닫기",
                colorFilter = ColorFilter.tint(color = color.neutral900),
            )
            Text(
                text = "필터",
                style = typography.titleLarge,
                color = color.neutral900,
                modifier = Modifier
                    .padding(end = 40.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
        LazyColumn {
            item {
                // TODO data
                HomeMenuFilterCard(listOf("한식", "양식", "중식", "일식", "아시안", "샐러드"))
                HorizontalDivider(thickness = 8.dp, color = color.neutral200)
            }
            item {
                HomeRegionFilterCard()
                HorizontalDivider(thickness = 8.dp, color = color.neutral200)
            }
            item {
                HomeCountFilterCard()
                HorizontalDivider(thickness = 8.dp, color = color.neutral200)
            }
            item {
                HomeGenderFilterCard()
                HorizontalDivider(thickness = 8.dp, color = color.neutral200)
            }
        }
        Button(onClick = { /*TODO*/ }) {

        }
    }

}

@Preview(showBackground = true)
@Composable
private fun HomeFilterFullScreenPreview() {
    HomeFilterFullScreen()
}

