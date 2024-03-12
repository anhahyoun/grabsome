package com.grabsome.feature.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.grabsome.core.data.model.home.HomeCardModel
import com.grabsome.core.designsystem.component.reaction.ReactionButton
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Bubble
import com.grabsome.core.designsystem.icon.grabsomeiconpack.BubbleFill
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Eye
import com.grabsome.core.designsystem.icon.grabsomeiconpack.EyeFill
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Heart
import com.grabsome.core.designsystem.icon.grabsomeiconpack.HeartFill
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography
import com.grabsome.feature.R

@Composable
fun HomeCard(model: HomeCardModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        HomeCardProfile(model)
        HomeCardBody(model)
        HomeCardReaction(model)
    }
}

@Composable
private fun HomeCardProfile(model: HomeCardModel) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        AsyncImage(
            modifier = Modifier.size(40.dp),
            model = model.profileUrl,
            contentDescription = ""
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = model.nickname,
                style = typography.titleMedium,
                color = color.neutral900,
                maxLines = 1,
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f, fill = false),
                    text = model.profileDescription,
                    style = typography.bodySmall,
                    color = color.neutral400,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "·",
                    style = typography.bodySmall,
                    color = color.neutral400,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = model.writeDate,
                    style = typography.bodySmall,
                    color = color.neutral400,
                )
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun HomeCardBody(model: HomeCardModel) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = model.title,
                style = typography.titleMedium,
                color = color.neutral900,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = model.body,
                style = typography.bodyLarge,
                color = color.neutral900,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
        val pagerState = rememberPagerState(pageCount = { model.imageUrlList.size })
        HorizontalPager(modifier = Modifier.size(80.dp), state = pagerState) {
            val url = model.imageUrlList[it]
            Card(modifier = Modifier.fillMaxSize(), shape = RoundedCornerShape(8.dp)) {
                AsyncImage(modifier = Modifier.fillMaxSize(), model = url, contentDescription = "")
            }
        }
    }
}

@Composable
private fun HomeCardReaction(model: HomeCardModel) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Absolute.SpaceBetween
    ) {
        ReactionButton(
            alignment = Alignment.Start,
            icon = GrabsomeIcons.Bubble,
            fillIcon = GrabsomeIcons.BubbleFill,
            count = model.commentCount,
            title = R.string.comment
        ) {
            // TODO
        }
        ReactionButton(
            alignment = Alignment.CenterHorizontally,
            icon = GrabsomeIcons.Heart,
            fillIcon = GrabsomeIcons.HeartFill,
            count = model.wishCount,
            title = R.string.wish
        ) {
            // TODO
        }
        ReactionButton(
            alignment = Alignment.End,
            icon = GrabsomeIcons.Eye,
            fillIcon = GrabsomeIcons.EyeFill,
            count = model.viewCount,
            title = R.string.view
        ) {
            // TODO
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeCarePreview() {
    val model = HomeCardModel(
        profileUrl = "",
        nickname = "김이나",
        profileDescription = "삼성",
        placeName = "식당 상호명",
        writeDate = "16분전",
        title = "타이틀입니다.",
        body = "내용입니다.",
        imageUrlList = listOf(),
        commentCount = 0,
        wishCount = 7,
        viewCount = 10,
        isManager = false
    )
    HomeCard(model)
}
