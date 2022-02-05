package com.fourapplecompose.thegoldprospector

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun LastScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            navController.navigate(Screen.HomeScreen.route)
        }) {
            Text(text = "Home")
        }

    }
    Button(onClick = {
        navController.navigate(Screen.GoldPrices.route)
    }) {
        Text(text = "Gold Prices")
    }
    Button(onClick = {
        navController.navigate(Screen.Details.route)
    }) {
        Text(text = "Detail Screen")
    }


}
