package com.grabsome.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.grabsome.feature.home.navigation.HOME_ROUTE
import com.grabsome.feature.home.navigation.homeScreen
import com.grabsome.feature.mypage.navigation.myPageScreen
import com.grabsome.feature.wish.navigation.wishScreen
import com.grabsome.ui.main.AppState

@Composable
fun GrabsomeNavHost(
    appState: AppState,
    modifier: Modifier = Modifier,
    startDestination: String = HOME_ROUTE,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeScreen()
        wishScreen()
        myPageScreen()
    }
}
