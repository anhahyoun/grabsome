package com.grabsome.ui.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import com.grabsome.core.designsystem.theme.color.color
import com.grabsome.ui.navigation.GrabsomeNavHost
import com.grabsome.ui.navigation.TopLevelDestination
import com.grabsome.ui.navigation.isTopLevelDestinationInHierarchy

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(appState: AppState = rememberAppState()) {
    Scaffold(
        bottomBar = {
            BottomBar(
                destinations = appState.topLevelDestinations,
                onNavigateToDestination = appState::navigateToTopLevelDestination,
                currentDestination = appState.currentDestination,
                modifier = Modifier.testTag("BottomBar"),
            )
        },
        containerColor = Color.Transparent
    ) { paddingValues ->
        GrabsomeNavHost(appState = appState)
    }
}

@Composable
private fun BottomBar(
    destinations: List<TopLevelDestination>,
    onNavigateToDestination: (TopLevelDestination) -> Unit,
    currentDestination: NavDestination?,
    modifier: Modifier = Modifier,
) {
    NavigationBar(
        modifier = modifier,
        contentColor = color.neutral100,
        tonalElevation = 0.dp
    ) {
        destinations.forEach { destination ->
            val selected = currentDestination.isTopLevelDestinationInHierarchy(destination)
            NavigationBarItem(
                selected = selected,
                onClick = { onNavigateToDestination(destination) },
                icon = {
                    if (selected) {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            imageVector = destination.selectedIcon,
                            contentDescription = null
                        )
                    } else {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            imageVector = destination.unselectedIcon,
                            contentDescription = null
                        )
                    }
                },
                modifier = modifier,
                label = { Text(stringResource(id = destination.iconTextId)) },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = color.neutral100,
                    selectedIconColor = color.neutral900,
                    unselectedIconColor = color.neutral900,
                    selectedTextColor = color.neutral900,
                    unselectedTextColor = color.neutral900,
                ),
            )
        }
    }
}
