package com.martinosorio.mycv.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.martinosorio.mycv.NavDestinations
import com.martinosorio.mycv.R

@Composable
fun ExperienceScreen(
    navController: NavController,
) {
    Surface(
        onClick = {

        }
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
                    ScreenSubTitle(text = stringResource(R.string.experience))
                }
            }
        }
    }
}