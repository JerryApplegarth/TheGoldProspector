package com.fourapplecompose.thegoldprospector

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fourapplecompose.thegoldprospector.ui.theme.fontColor

import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val scale = remember {
        Animatable(0f)
    }
    val painter = painterResource(id = R.drawable.propector500)
    val description = "Character sketch of a prospector"


    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {

        LaunchedEffect(key1 = true) {
            scale.animateTo(
                targetValue = 0.7f,
                animationSpec = tween(
                    durationMillis = 800,
                    easing = {
                        OvershootInterpolator(4f).getInterpolation(it)
                    })
            )
            delay(3000L)

            navController.navigate("home_screen")
        }
        Box(
            modifier = Modifier
                .fillMaxSize(0.5f)
                .padding(16.dp)
        ) {
            SplashCard(
                painter = painter,
                contentDescription = description)

        }
    }
}

@Composable
fun SplashCard(
    painter: Painter,
    contentDescription: String,

    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .background(MaterialTheme.colors.fontColor)
                .padding(start = 8.dp, end = 8.dp),
            text = "The Gold Prospector",
            fontWeight = FontWeight.W700,
            fontSize = 36.sp,
            fontFamily = FontFamily.Cursive,
        )
        Spacer(modifier = Modifier.height(36.dp))
        Card(
            modifier = modifier.fillMaxWidth(),
            shape = RoundedCornerShape(36.dp),
            elevation = 6.dp,

            ) {
            Box(
                modifier = Modifier
                    .height(460.dp)
                    .padding(8.dp)


            ) {
                Image(
                    modifier = Modifier
                        .fillMaxSize(),
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )


            }

        }


    }
}

