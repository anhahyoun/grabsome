package com.grabsome.core.data.model.home

import com.grabsome.common.ext.getStringCount

data class HomeCardModel(
    val profileUrl: String,
    val nickname: String,
    val profileDescription: String,
    val placeName: String,
    val writeDate: String,
    val title: String,
    val body: String,
    val imageUrlList: List<String>,
     val commentCount: Int,
     val wishCount: Int,
     val viewCount: Int,
    val isManager: Boolean,
) {

//    val comment = if (commentCount == 0) "댓글" else commentCount.getStringCount()
//    val wish = if (wishCount == 0) "찜" else wishCount.getStringCount()
//    val view = if (viewCount == 0) "조회" else viewCount.getStringCount()
}
