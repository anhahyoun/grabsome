package com.grabsome.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.grabsome.core.designsystem.icon.GrabsomeIcons
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Heart
import com.grabsome.core.designsystem.icon.grabsomeiconpack.HeartFill
import com.grabsome.core.designsystem.icon.grabsomeiconpack.House
import com.grabsome.core.designsystem.icon.grabsomeiconpack.HouseFill
import com.grabsome.core.designsystem.icon.grabsomeiconpack.Person
import com.grabsome.core.designsystem.icon.grabsomeiconpack.PersonFill
import com.grabsome.feature.R

enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
) {
    HOME(
        selectedIcon = GrabsomeIcons.HouseFill,
        unselectedIcon = GrabsomeIcons.House,
        iconTextId = R.string.home
    ),
    WISH(
        selectedIcon = GrabsomeIcons.HeartFill,
        unselectedIcon = GrabsomeIcons.Heart,
        iconTextId = R.string.wish,
    ),
    MY_PAGE(
        selectedIcon = GrabsomeIcons.PersonFill,
        unselectedIcon = GrabsomeIcons.Person,
        iconTextId = R.string.my_page,
    ),
}
