package com.example.firebaseauthyt.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation

import com.example.firebaseauthyt.presentation.login_screen.SignInScreen
import com.example.firebaseauthyt.presentation.signup_screen.SignUpScreen
//import com.talhaoz.loginbottombarapp.ui.login.LoginScreen
//import com.talhaoz.loginbottombarapp.ui.login.RegisterScreen

fun NavGraphBuilder.LoginNavGraph(navController: NavHostController) {
    navigation(
        route = RooteGraph.LoginNavGraph.route,
        startDestination = SignInScreen.Login.route
    ) {
        composable(route = SignInScreen.Login.route) {
            SignInScreen(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(RooteGraph.MainScreen.route)
                },
                onForgotClick = {
                    navController.navigate(SignInScreen.Forgot.route)
                },
                onRegisterClick = {
                    navController.popBackStack()
                    navController.navigate(SignInScreen.Register.route)
                },
                navController = navController,
            )
        }

        composable(route = SignInScreen.Register.route) {
            SignUpScreen(
                navController = rememberNavController(),
                onLoginClick = {
                    navController.popBackStack()
                    navController.navigate(SignInScreen.Login.route)
                }
            )
        }
//        composable(route = LoginScreen.Forgot.route) {
//            ScreenContent(name = LoginScreen.Forgot.route) {}
//        }
    }
}

sealed class SignInScreen(val route: String) {
    object Login : SignInScreen(route = "LOGIN")
    object Forgot : SignInScreen(route = "Forgot")
    object Register : SignInScreen(route = "Register")
}