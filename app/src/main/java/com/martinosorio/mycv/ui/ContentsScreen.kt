package com.martinosorio.mycv.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .padding(start = 18.dp, end = 18.dp)
            ) {
                ScreenTitle(text = stringResource(R.string.martin_osorio))

                ScreenSubTitle(text = stringResource(R.string.contents_title))

                ContentsItem(
                    itemTitle = stringResource(R.string.summary),
                    onClick = { navController.navigate(NavDestinations.SummaryScreen.destination) }
                )

                ContentsItem(
                    itemTitle = stringResource(R.string.experience),
                    onClick = { navController.navigate(NavDestinations.ExperiencesScreen.destination) }
                )

                ContentsItem(
                    itemTitle = stringResource(R.string.education),
                    onClick = { navController.navigate(NavDestinations.EducationScreen.destination) }
                )

                ContentsItem(
                    itemTitle = stringResource(R.string.skills),
                    onClick = { navController.navigate(NavDestinations.SkillsScreen.destination) }
                )

                ContentsItem(
                    itemTitle = stringResource(R.string.contact),
                    onClick = { navController.navigate(NavDestinations.ContactScreen.destination) }
                )

                ContentsItem(
                    itemTitle = stringResource(R.string.resources),
                    onClick = { navController.navigate(NavDestinations.ResourcesScreen.destination) }
                )
            }
        }
    }
}