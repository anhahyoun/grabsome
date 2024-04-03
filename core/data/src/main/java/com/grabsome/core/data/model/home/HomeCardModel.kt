package com.grabsome.core.data.model.home

data class HomeCardModel(
    val nickname: String,
    val job: String,
    val placeName: String,
    val address : String,
    val category: String,
    val date: String,
    val body: String,
    val imageUrlList: List<String>,
    val state: String,
    val commentCount: Int,
    val wishCount: Int,
    val viewCount: Int,
    val isManager: Boolean,
)
