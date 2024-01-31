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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.martinosorio.mycv.NavDestinations
import com.martinosorio.mycv.R
import com.martinosorio.mycv.ui.theme.LightGray

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

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .border(width = 2.dp, color = LightGray, shape = RoundedCornerShape(8.dp))
                        .clickable {
                            navController.navigate(NavDestinations.SummaryScreen.destination)
                        },
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = stringResource(R.string.contents_subtitle),
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, start = 16.dp),
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Text(
                        text = stringResource(R.string.right_carret),   // TODO: Replace with icon
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, end = 16.dp),
                        textAlign = TextAlign.End,
                        style = MaterialTheme.typography.headlineMedium
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(8.dp))
                        .clickable {
                            navController.navigate(NavDestinations.ExperiencesScreen.destination)
                        },
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = stringResource(R.string.experience),
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, start = 16.dp),
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Text(
                        text = stringResource(R.string.right_carret),   // TODO: Replace with icon
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, end = 16.dp),
                        textAlign = TextAlign.End,
                        style = MaterialTheme.typography.headlineMedium
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(8.dp))
                        .clickable {
                            navController.navigate(NavDestinations.EducationScreen.destination)
                        },
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = stringResource(R.string.education),
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, start = 16.dp),
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Text(
                        text = stringResource(R.string.right_carret),   // TODO: Replace with icon
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, end = 16.dp),
                        textAlign = TextAlign.End,
                        style = MaterialTheme.typography.headlineMedium
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(8.dp))
                        .clickable {
                            navController.navigate(NavDestinations.SkillsScreen.destination)
                        },
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = stringResource(R.string.skills),
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, start = 16.dp),
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Text(
                        text = stringResource(R.string.right_carret),   // TODO: Replace with icon
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, end = 16.dp),
                        textAlign = TextAlign.End,
                        style = MaterialTheme.typography.headlineMedium
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(8.dp))
                        .clickable {
                            navController.navigate(NavDestinations.ContactScreen.destination)
                        },
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = stringResource(R.string.contact),
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, start = 16.dp),
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Text(
                        text = stringResource(R.string.right_carret),   // TODO: Replace with icon
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, end = 16.dp),
                        textAlign = TextAlign.End,
                        style = MaterialTheme.typography.headlineMedium
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(8.dp))
                        .clickable {
                            navController.navigate(NavDestinations.ResourcesScreen.destination)
                        },
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = stringResource(R.string.resources),
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, start = 16.dp),
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Text(
                        text = stringResource(R.string.right_carret),   // TODO: Replace with icon
                        modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, end = 16.dp),
                        textAlign = TextAlign.End,
                        style = MaterialTheme.typography.headlineMedium
                    )
                }
            }
        }
    }
}