package com.grabsome.feature.mypage.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import com.grabsome.feature.mypage.MyPageRoute

const val MY_PAGE_ROUTE = "my_page_route"
private const val DEEP_LINK_URI_PATTERN = "TODO"

fun NavController.navigateToMyPage(navOptions: NavOptions) = navigate(MY_PAGE_ROUTE, navOptions)

fun NavGraphBuilder.myPageScreen() {
    composable(
        route = MY_PAGE_ROUTE,
        deepLinks = listOf(
            navDeepLink { uriPattern = DEEP_LINK_URI_PATTERN },
        ),
        arguments = listOf(),
    ) {
        MyPageRoute()
    }
}
