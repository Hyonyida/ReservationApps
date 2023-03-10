package com.example.firebaseauthyt.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.firebaseauthyt.bottombar.ReservingInfor
import com.example.firebaseauthyt.bottombar.ReservingRoom
import com.example.firebaseauthyt.bottombar.SettingsAdmin
import com.example.firebaseauthyt.presentation.admin.AdminRefuseAppro
import com.example.firebaseauthyt.presentation.admin.LectureRoomManage

@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = RooteGraph.MainScreen.route,
        startDestination = BottomBarScreen.ReservingRoom.route
    ) {
        composable(route = BottomBarScreen.ReservingRoom.route) {
            ReservingRoom(navController = rememberNavController())
        }
        composable(route = BottomBarScreen.ReservingInfor.route) {
            ReservingInfor()
        }
        composable(route = BottomBarScreen.SettingsAdminScreen.route) {
            SettingsAdmin(
                navController = rememberNavController(),
                onRAClick = {
                    navController.navigate(RooteGraph.Admin.route)
                },
                onRMClick = {
                    navController.navigate(AdminScreen.RoomManage.route)

                }
            )
        }

        AdminNavGraph(navController = navController)
    }
}

fun NavGraphBuilder.AdminNavGraph(navController: NavHostController) {
    navigation(
        route = RooteGraph.Admin.route,
        startDestination = AdminScreen.RefuseAppro.route
    ) {
        composable(route = AdminScreen.RefuseAppro.route) {
            AdminRefuseAppro(onBackClick = {
                navController.popBackStack()
                navController.navigate(BottomBarScreen.SettingsAdminScreen.route)
            })
        }
        composable(route = AdminScreen.RoomManage.route) {
            LectureRoomManage(onBackClick = {
                navController.popBackStack()
                navController.navigate(BottomBarScreen.SettingsAdminScreen.route)
            })
        }
    }
}

sealed class AdminScreen(val route: String) {
    object RefuseAppro : AdminScreen(route = "Refuse_Appro")
    object RoomManage : AdminScreen(route = "Room_Manage")
}