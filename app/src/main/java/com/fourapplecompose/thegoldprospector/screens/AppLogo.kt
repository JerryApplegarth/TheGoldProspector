package com.fourapplecompose.thegoldprospector.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fourapplecompose.thegoldprospector.R
import com.fourapplecompose.thegoldprospector.ui.theme.mediumGreen


@Composable
fun AppLogo() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Image(
            painter = painterResource(
                id = R.drawable.four_apple_bmp
            ),
            contentDescription = "An Apple for a logo",
            Modifier.size(30.dp)
        )
        Text(
            text = stringResource(R.string.apple_apps),
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.mediumGreen
        )
        Text(
            text = stringResource(R.string.buy_me_coffee),
            modifier = Modifier.padding(4.dp)
        )
        Row(
            modifier = Modifier
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            val annotatedLinkString: AnnotatedString = buildAnnotatedString {

                val str = "Buy me a Coffee"
                val startIndex = str.indexOf("Coffee")
                val endIndex = startIndex + 6
                append(str)
                addStyle(
                    style = SpanStyle(
                        color = Color(0xff64B5F6),
                        fontSize = 18.sp,

                        textDecoration = TextDecoration.Underline
                    ), start = startIndex, end = endIndex
                )
                addStringAnnotation(
                    tag = "URL",
                    annotation = "https://www.buymeacoffee.com/JerryApplegarth",
                    start = startIndex,
                    end = endIndex
                )
            }

            val uriHandler = LocalUriHandler.current
            ClickableText(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                text = annotatedLinkString,
                onClick = {
                    annotatedLinkString
                        .getStringAnnotations("URL", it, it)
                        .firstOrNull()?.let { stringAnnotation ->
                            uriHandler.openUri(stringAnnotation.item)
                        }
                })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppLogoPreview() {
    AppLogo()
}


