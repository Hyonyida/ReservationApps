package com.example.firebaseauthyt.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object HomeScreen : BottomBarScreen(
        route = "home_screen",
        title = "Home",
        icon = Icons.Default.Home
    )

    object ProfileScreen : BottomBarScreen(
        route = "profile_screen",
        title = "Profile",
        icon = Icons.Default.Home
    )

    object SettingsScreen : BottomBarScreen(
        route = "settings_screen",
        title = "Settings",
        icon = Icons.Default.Home
    )

    object ReservingInfor : BottomBarScreen(
        route = "Reserving_Infor",
        title = "ReservingInfor",
        icon = Icons.Default.List
    )

    object SettingsAdminScreen : BottomBarScreen(
        route = "settingsAdmin_screen",
        title = "SettingsAdmin",
        icon = Icons.Default.Settings
    )

    object ReservingRoom : BottomBarScreen(
        route = "Reserving_Room",
        title = "ReservingRoom",
        icon = Icons.Default.Search
    )

    object LectureRoomManage : BottomBarScreen(
        route = "LectureRoom_Manage",
        title = "LectureRoomManage",
        icon = Icons.Default.Home
    )
}