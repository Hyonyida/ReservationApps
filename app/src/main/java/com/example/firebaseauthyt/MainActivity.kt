package com.example.firebaseauthyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauthyt.bottombar.MainScreen
import com.example.firebaseauthyt.navigation.LoginNavGraph
import com.example.firebaseauthyt.navigation.RooteGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RootNavigationGraph(navController = rememberNavController())
        }
    }
}
@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = RooteGraph.Route.route,
        startDestination = RooteGraph.LoginNavGraph.route
    ) {
        LoginNavGraph(navController = navController)
        composable(route = RooteGraph.MainScreen.route) {
            MainScreen()
        }
    }
}

