package com.fourapplecompose.thegoldprospector

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fourapplecompose.thegoldprospector.screens.AppLogo
import com.fourapplecompose.thegoldprospector.screens.Screen
import com.fourapplecompose.thegoldprospector.ui.theme.mediumGreen

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

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = modifier.fillMaxWidth(),
            shape = RoundedCornerShape(36.dp),
            elevation = 6.dp,

            ) {
            Box(
                modifier = Modifier
                    .height(300.dp)


            ) {
                Image(
                    modifier = Modifier
                        .fillMaxSize(),
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black
                                ),
                                startY = 300f
                            )
                        )
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = title,
                        color = Color.White,
                        fontSize = 16.sp
                    )


                }

            }

        }
        AppLogo()

    }

}




