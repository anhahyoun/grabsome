package com.grabsome.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.grabsome.feature.home.search.SearchRoute

const val SEARCH_ROUTE = "search_route"

fun NavController.navigateToSearch() = navigate(SEARCH_ROUTE)

fun NavGraphBuilder.searchScreen() {
    composable(
        route = SEARCH_ROUTE,
        arguments = listOf(),
    ) {
        SearchRoute()
    }
}
