package com.martinosorio.mycv.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.martinosorio.mycv.NavDestinations

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
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 10.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .padding(top = 30.dp, start = 8.dp, end = 8.dp)
            ) {
                Text(
                    text = "Martin Osorio",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.displayLarge
                )

                Text(
                    text = "Senior Android Developer",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp, bottom = 30.dp),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.headlineMedium
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 6.dp)
                        .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(8.dp))
                ) {
                    Text(
                        text = "Who am I?",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp, bottom = 16.dp),
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
                        text = "A results-oriented Senior Android Developer with 9 years of experience in agile Android development and a total of 11 years in the software development industry. Proven track record of leading high-impact projects, collaborating with cross-functional teams as well as working independently, and consistently delivering innovative solutions. Experienced in interviewing candidates and onboarding new team members. A self-motivated problem-solver with a strong passion for continuous learning and a global perspective as a digital nomad.",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp, bottom = 14.dp),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }

            Text(
                text = "Tap anywhere to continue",
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 30.dp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}