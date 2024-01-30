package com.martinosorio.mycv.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.martinosorio.mycv.NavDestinations
import com.martinosorio.mycv.R

@Composable
fun SummaryScreen(
    navController: NavController,
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
        onClick = {
            navController.navigate(NavDestinations.ContentsScreen.destination)
        }
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.TopCenter)
                    .padding(start = 18.dp, end = 18.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                ScreenTitle(text = stringResource(R.string.martin_osorio))
                ScreenSubTitle(text = stringResource(R.string.senior_android_developer))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 6.dp)
                        .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(8.dp))
                ) {
                    Text(
                        text = stringResource(R.string.summary_subtitle),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp, bottom = 14.dp),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.Normal,
                            fontSize = 24.sp,
                            lineHeight = 24.sp,
                            letterSpacing = 1.sp,
                            textDecoration = TextDecoration.Underline
                        )
                    )

                    Text(
                        text = stringResource(R.string.martin_summary),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 12.dp, end = 12.dp, bottom = 14.dp),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }

                Text(
                    text = stringResource(R.string.tap_anywhere_to_continue),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 40.dp, top = 30.dp),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}