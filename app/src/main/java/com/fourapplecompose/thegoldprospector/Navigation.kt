package com.fourapplecompose.thegoldprospector

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route) {
        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController = navController)


        }
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.GoldPrices.route) {
            GoldPrices(navController = navController)
        }
        composable(route = Screen.Details.route) {
            Details(navController = navController)
        }
        composable(route = Screen.LastScreen.route) {
            LastScreen(navController = navController)
        }
    }
}