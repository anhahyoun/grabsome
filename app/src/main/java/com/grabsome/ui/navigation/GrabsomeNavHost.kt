package com.grabsome.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.grabsome.feature.home.navigation.HOME_GRAPH_ROUTE_PATTERN
import com.grabsome.feature.home.navigation.homeGraph
import com.grabsome.feature.home.navigation.navigateToSearch
import com.grabsome.feature.home.search.SearchMainScreen
import com.grabsome.feature.mypage.navigation.myPageScreen
import com.grabsome.feature.wish.navigation.wishScreen
import com.grabsome.ui.main.AppState

@Composable
fun GrabsomeNavHost(
    appState: AppState,
    modifier: Modifier = Modifier,
    startDestination: String = HOME_GRAPH_ROUTE_PATTERN,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeGraph(
            onSearchClick = navController::navigateToSearch,
            nestedGraphs = {
//                SearchMainScreen()
            }
        )
        wishScreen()
        myPageScreen()
    }
}
