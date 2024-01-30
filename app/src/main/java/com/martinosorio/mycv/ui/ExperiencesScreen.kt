package com.martinosorio.mycv.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
fun ExperiencesScreen(
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
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.TopCenter)
                    .padding(start = 18.dp, end = 18.dp)
            ) {
                item {
                    ScreenTitle(text = stringResource(R.string.martin_osorio))
                    ScreenSubTitle(text = stringResource(R.string.experience))
                }

                // TODO: Get from a viewModel 
                item {
                    ExperienceItem(
                        jobTitle = "Senior Android Developer",
                        companyName = "Abbott Laboratories",
                        location = "Remote",
                        startDate = "April 2022",
                        endDate = "February 2024",
                        employmentType = "Contract",
                        officeType = "Remote",
                        description = "Wrote a from-scratch compose and flow-focused app used to implement and test an internal library that manages Bluetooth communications with blood-analyte sensors.\n" +
                                "Spearheaded the design, architecture, and development of a new Android Watch application at Abbott Laboratories, leading a dedicated team.\n" +
                                "Successfully orchestrated the development of the wear app and companion app, demonstrating adaptability by working solo when necessary.\n" +
                                "Innovatively devised a robust communication system for seamless data exchange between the companion and watch apps.\n" +
                                "Pioneered the creation of a standalone Jetpack Compose Wearable graphing module.\n" +
                                "Developed a set of dynamic wearable complications for the watch face, showcasing glucose readings.\n" +
                                "Seamlessly integrated the Wearable project into a large production application.\n" +
                                "Contributed to the development of a bio-wearable ketosis tracker application, utilizing physical test sensors for development and debugging.\n" +
                                "Wrote an internal application tasked with testing the implementation of various internal NFC and BLE communication libraries.\n" +
                                "Crafted and optimized various composeables in the app, enhancing user experience.\n" +
                                "Introduced and implemented experimental Jetpack Compose features, including animation, coroutines, and dynamic text coloring.\n" +
                                "Collaborated closely with cross-functional teams, including business, product, and quality engineers, to deliver full-stack and multi-platform features.\n" +
                                "Facilitated communication with business and product teams and maintained a strong focus on improving overall velocity and efficiency.\n" +
                                "Achieved “Certified Scrum Master” from Scrum Alliance, and aided my teams’ scrum masters in ensuring agile project management best practices were upheld.\n" +
                                "Successfully worked remotely from various locations as a digital nomad.\n"
                    )
                }
            }
        }
    }
}