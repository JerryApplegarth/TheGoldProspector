package com.fourapplecompose.thegoldprospector.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.fourapplecompose.thegoldprospector.R

@Composable
fun HomeScreen(navController: NavController) {


    val painter = painterResource(id = R.drawable.frances)
    val description = "Picture of a man working a mining claim"
    val title = "Working the 4 Apple Claim in Oregon"

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier.fillMaxSize()
        ) {

            Button(onClick = {
                navController.navigate(Screen.GoldPrices.route)
            }) {
                Text(text = "Gold Prices")
            }

        }

        Box(
            modifier = Modifier
                .fillMaxSize(0.5f)
                .padding(16.dp)
        ) {
            ImageCard(
                painter = painter,
                contentDescription = description,
                title = title
            )

        }


    }

}





