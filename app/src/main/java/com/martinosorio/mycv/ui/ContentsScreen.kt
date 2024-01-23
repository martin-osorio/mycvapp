package com.martinosorio.mycv.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.martinosorio.mycv.NavDestinations

@Composable
fun ContentsScreen(
    navController: NavController,
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(all = 10.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .padding(top = 30.dp, start = 8.dp, end = 8.dp)
            ) {
                Text(
                    text = "CV Contents",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.displayLarge
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(8.dp))
                        .clickable {
                            navController.navigate(NavDestinations.SummaryScreen.destination)
                        },
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = "Summary",
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, start = 16.dp),
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Text(
                        text = ">",
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, end = 16.dp),
                        textAlign = TextAlign.End,
                        style = MaterialTheme.typography.headlineMedium
                    )
                }
            }
        }
    }
}