package com.grabsome.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Bell
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography
import com.grabsome.feature.R

@Composable
internal fun HomeAppBar(selectedTabType: HomeTabType) {
    Row(
        modifier = Modifier
            .padding(vertical = 2.dp, horizontal = 8.dp)
            .fillMaxWidth()
    ) {
        HomeAppBarTab(selectedTabType)
    }
}

@Composable
private fun HomeAppBarTab(selectedTabType: HomeTabType) {
    Row {
        Text(
            modifier = Modifier.padding(vertical = 6.dp, horizontal = 8.5.dp),
            text = stringResource(id = R.string.recent),
            style = typography.titleXLarge,
            color = if (selectedTabType == HomeTabType.RECENT) color.neutral900 else color.neutral400
        )
        Text(
            modifier = Modifier.padding(vertical = 6.dp, horizontal = 8.5.dp),
            text = stringResource(id = R.string.popular),
            style = typography.titleXLarge,
            color = if (selectedTabType == HomeTabType.POPULAR) color.neutral900 else color.neutral400
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeAppBarPreview() {
    HomeAppBar(HomeTabType.RECENT)
}