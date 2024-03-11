package com.grabsome.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grabsome.core.data.model.home.HomeCardModel
import com.grabsome.core.designsystem.component.reaction.ReactionButton
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Bubble
import com.grabsome.core.designsystem.icon.grabsomeiconpack.BubbleFill
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Eye
import com.grabsome.core.designsystem.icon.grabsomeiconpack.EyeFill
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Heart
import com.grabsome.core.designsystem.icon.grabsomeiconpack.HeartFill
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
        HomeCardReaction(model)
    }
}

@Composable
private fun HomeCardProfile(model: HomeCardModel) {
    Row {

    }
}

@Composable
private fun HomeCardBody(model: HomeCardModel) {
    Row {

    }
}

@Composable
private fun HomeCardReaction(model: HomeCardModel) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ReactionButton(
            modifier = Modifier.weight(1f),
            alignment = Alignment.Start,
            icon = GrabsomeIcons.Bubble,
            fillIcon = GrabsomeIcons.BubbleFill,
            count = model.commentCount,
            title = R.string.comment
        ) {
            // TODO
        }
        ReactionButton(
            modifier = Modifier.weight(1f),
            alignment = Alignment.CenterHorizontally,
            icon = GrabsomeIcons.Heart,
            fillIcon = GrabsomeIcons.HeartFill,
            count = model.wishCount,
            title = R.string.wish
        ) {
            // TODO
        }
        ReactionButton(
            modifier = Modifier.weight(1f),
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
