package com.fourapplecompose.navigationtemplates

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Details(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            navController.navigate(Screen.LastScreen.route)
        }) {
            Text(text = "Last Screen")
        }
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {
            navController.navigate(Screen.HomeScreen.route)
        }) {
            Text(text = "Home")

    }



    }


}