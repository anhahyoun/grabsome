package com.grabsome.ui.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.grabsome.feature.home.navigation.HOME_ROUTE
import com.grabsome.feature.home.navigation.navigateToHome
import com.grabsome.feature.mypage.navigation.MY_PAGE_ROUTE
import com.grabsome.feature.mypage.navigation.navigateToMyPage
import com.grabsome.feature.wish.navigation.WISH_ROUTE
import com.grabsome.feature.wish.navigation.navigateToWish
import com.grabsome.ui.navigation.TopLevelDestination
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberAppState(
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    navController: NavHostController = rememberNavController(),
): AppState {
    return remember(navController, coroutineScope) {
        AppState(
            navController,
            coroutineScope
        )
    }
}

@Stable
class AppState(
    val navController: NavHostController,
    val coroutineScope: CoroutineScope,
) {
    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val currentTopLevelDestination: TopLevelDestination?
        @Composable get() = when (currentDestination?.route) {
            HOME_ROUTE -> TopLevelDestination.HOME
            WISH_ROUTE -> TopLevelDestination.WISH
            MY_PAGE_ROUTE -> TopLevelDestination.MY_PAGE
            else -> null
        }
//
//
//    val isOffline = networkMonitor.isOnline
//        .map(Boolean::not)
//        .stateIn(
//            scope = coroutineScope,
//            started = SharingStarted.WhileSubscribed(5_000),
//            initialValue = false,
//        )

    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.entries

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        val topLevelNavOptions = navOptions {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }

        when (topLevelDestination) {
            TopLevelDestination.HOME -> navController.navigateToHome(topLevelNavOptions)
            TopLevelDestination.WISH -> navController.navigateToWish(topLevelNavOptions)
            TopLevelDestination.MY_PAGE -> navController.navigateToMyPage(topLevelNavOptions)
        }
    }
}
