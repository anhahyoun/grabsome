package com.grabsome.feature.wish.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import com.grabsome.feature.wish.WishRoute

const val WISH_ROUTE = "wish_route"
private const val DEEP_LINK_URI_PATTERN = "TODO"

fun NavController.navigateToWish(navOptions: NavOptions) = navigate(WISH_ROUTE, navOptions)

fun NavGraphBuilder.wishScreen() {
    composable(
        route = WISH_ROUTE,
        deepLinks = listOf(
            navDeepLink { uriPattern = DEEP_LINK_URI_PATTERN },
        ),
        arguments = listOf(),
    ) {
        WishRoute()
    }
}
