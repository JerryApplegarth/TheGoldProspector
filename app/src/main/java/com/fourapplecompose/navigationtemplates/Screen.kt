package com.fourapplecompose.navigationtemplates

sealed class Screen(val route: String) {
    object SplashScreen: Screen(route = "splash_screen")
    object HomeScreen: Screen(route = "home_screen")
    object GoldPrices: Screen(route = "gold_prices")
    object Details: Screen(route = "details")
    object LastScreen: Screen(route = "last_screen")

//    fun withArgs(vararg args: String): String {
//        return buildString {
//            append(route)
//            args.forEach { arg ->
//                append("/$arg")
//            }
//        }
//    }

}
