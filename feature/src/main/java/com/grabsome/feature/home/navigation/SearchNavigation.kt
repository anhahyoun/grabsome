package com.grabsome.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.grabsome.feature.home.search.SearchResultRoute
import com.grabsome.feature.home.search.SearchRoute

const val SEARCH_GRAPH_ROUTE_PATTERN = "search_graph"
const val SEARCH_ROUTE = "search_route"

fun NavController.navigateToSearch() = navigate(SEARCH_ROUTE)

fun NavGraphBuilder.searchGraph(
    nestedGraphs: NavGraphBuilder.() -> Unit
) {
    navigation(
        route = SEARCH_GRAPH_ROUTE_PATTERN,
        startDestination = SEARCH_ROUTE,
    ) {
        composable(route = SEARCH_ROUTE) {
            SearchRoute(onSearchResult = {
                searchResultScreen(it)
            })
        }
        nestedGraphs()
    }
}

//
//fun NavGraphBuilder.searchScreen() {
//    composable(
//        route = SEARCH_ROUTE,
//        arguments = listOf(),
//    ) {
//        SearchRoute()
//    }
//}

fun NavGraphBuilder.searchResultScreen(param: String) {
    composable(
        route = SEARCH_ROUTE,
        arguments = listOf(),
    ) {
        SearchResultRoute()
    }
}
