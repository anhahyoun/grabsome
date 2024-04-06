package com.grabsome.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.grabsome.feature.home.HomeRoute

const val HOME_GRAPH_ROUTE_PATTERN = "home_graph"
const val HOME_ROUTE = "home_route"
private const val DEEP_LINK_URI_PATTERN = "TODO"

fun NavController.navigateToHomeGraph(navOptions: NavOptions) =
    navigate(HOME_GRAPH_ROUTE_PATTERN, navOptions)

fun NavGraphBuilder.homeGraph(
    onSearchClick: () -> Unit,
    nestedGraphs: NavGraphBuilder.() -> Unit,
) {
    navigation(
        route = HOME_GRAPH_ROUTE_PATTERN,
        startDestination = HOME_ROUTE,
    ) {
        composable(route = HOME_ROUTE) {
            HomeRoute(onSearchClick)
        }
        nestedGraphs()
    }
}
