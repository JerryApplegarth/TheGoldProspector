package com.fourapplecompose.thegoldprospector.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.fourapplecompose.thegoldprospector.model.Gold

@Composable
fun GoldPrices(navController: NavController, gold: Gold) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "These are the current gold prices")
        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = {
            navController.navigate(Screen.Details.route)
        }) {
            Text(text = "Detail Screen")
        }

        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Country: ${gold.usd} ",
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Gold: ${gold.xau} ",
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Silver: ${gold.xag}",
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight.Bold
        )


    }



}

