package com.grabsome.feature.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.grabsome.core.data.model.home.HomeCardModel
import com.grabsome.core.designsystem.component.reaction.ReactionButton
import com.grabsome.core.designsystem.ext.rippleClickable
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Bubble
import com.grabsome.core.designsystem.icon.grabsomeiconpack.BubbleFill
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Heart
import com.grabsome.core.designsystem.icon.grabsomeiconpack.HeartFill
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.core.designsystem.theme.typography.typography

@Composable
fun HomeCard(model: HomeCardModel, onClick: (HomeUiEvent) -> Unit) {
    Column(
        modifier = Modifier
            .rippleClickable {
                onClick.invoke(HomeUiEvent.ContentClick(model))
            }
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        HomeCardDateInfo(model)
        HomeCardBody(model)
        HomeCardReaction(model)
    }
}

@Composable
private fun HomeCardDateInfo(model: HomeCardModel) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = model.date,
            style = typography.labelSmall,
            color = color.neutral600,
        )
        Text(
            text = model.address,
            style = typography.labelSmall,
            color = color.neutral600,
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun HomeCardBody(model: HomeCardModel) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val pagerState = rememberPagerState(pageCount = { model.imageUrlList.size })
        Box(
            modifier = Modifier
                .size(80.dp)
                .clip(shape = RoundedCornerShape(8.dp))
        ) {
            HorizontalPager(modifier = Modifier.fillMaxSize(), state = pagerState) {
                val url = model.imageUrlList[it]
                AsyncImage(
                    modifier = Modifier.fillMaxSize(),
                    model = url,
                    contentDescription = "컨텐츠 이미지"
                )
            }
            Row(
                modifier = Modifier
                    .padding(4.dp)
                    .align(Alignment.BottomEnd)
                    .background(
                        color = color.neutral400.copy(alpha = 0.4f),
                        shape = RoundedCornerShape(100.dp)
                    )
                    .padding(horizontal = 8.dp, vertical = 3.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "${(pagerState.currentPage + 1).coerceAtMost(pagerState.pageCount)}",
                    style = typography.labelXSmall,
                    color = color.neutral300
                )
                Text(
                    text = "/",
                    style = typography.labelXSmall,
                    color = color.neutral300
                )
                Text(
                    text = "${pagerState.pageCount}",
                    style = typography.labelXSmall,
                    color = color.neutral300
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = model.placeName,
                    style = typography.titleMedium,
                    color = color.neutral900,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    modifier = Modifier,
                    text = model.category,
                    style = typography.bodyMedium,
                    color = color.neutral600
                )
            }
            Text(
                text = model.body,
                style = typography.bodyMedium,
                color = color.neutral900,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = model.nickname,
                    style = typography.bodySmall,
                    color = color.neutral400,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "·",
                    style = typography.bodySmall,
                    color = color.neutral400
                )
                Text(
                    text = model.job,
                    style = typography.bodySmall,
                    color = color.neutral400,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
private fun HomeCardReaction(model: HomeCardModel) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            // TODO
            Text(
                text = "0/2명 참여",
                style = typography.labelLarge,
                color = color.neutral900,
            )
            // TODO
            Text(
                text = "모집중",
                style = typography.labelLarge,
                color = color.blue300,
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            ReactionButton(
                alignment = Alignment.Start,
                icon = GrabsomeIcons.Bubble,
                fillIcon = GrabsomeIcons.BubbleFill,
                count = model.commentCount,
            ) {
                // TODO
            }
            ReactionButton(
                alignment = Alignment.CenterHorizontally,
                icon = GrabsomeIcons.Heart,
                fillIcon = GrabsomeIcons.HeartFill,
                count = model.wishCount,
            ) {
                // TODO
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeCarePreview() {
    val model = HomeCardModel(
        address = "판교동",
        nickname = "최진국",
        job = "삼성",
        placeName = "식당 상호명",
        date = "3/15(금) 오후 7:30",
        body = "내용입니다.",
        imageUrlList = listOf(),
        commentCount = 0,
        wishCount = 7,
        viewCount = 10,
        isManager = false,
        category = "음식점",
        state = "모집중"
    )
    HomeCard(model) {}
}
