package com.fourapplecompose.thegoldprospector.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.fourapplecompose.thegoldprospector.screens.Screen

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
        Spacer(
            modifier = Modifier
                .height(24.dp)
        )

        Button(onClick = {
            navController.navigate(Screen.GoldPrices.route)
        }) {
            Text(text = "Gold Prices")
        }
        Spacer(
            modifier = Modifier
                .height(24.dp)
        )
        Button(onClick = {
            navController.navigate(Screen.Details.route)
        }) {
            Text(text = "Detail Screen")
        }


    }



}
