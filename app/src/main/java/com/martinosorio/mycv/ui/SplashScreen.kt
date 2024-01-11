package com.martinosorio.mycv.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.martinosorio.mycv.NavDestinations

@Composable
fun SplashScreen(
    navController: NavController,
) {
    Surface(
        onClick = {
            navController.navigate(NavDestinations.SummaryScreen.destination)
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 10.dp)
        ) {
            ScreenTitle("Splash Screen")
        }
    }
}