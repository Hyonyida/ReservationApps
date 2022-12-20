package com.example.firebaseauthyt.navigation

sealed class RooteGraph(val route: String) {

    object Route : RooteGraph("Route")
    object LoginNavGraph : RooteGraph("Login_NavGraph")
    object MainScreen : RooteGraph("Main_screen")
    object Admin : RooteGraph("Admin")
}