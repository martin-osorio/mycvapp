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

                // TODO: Get from a viewModel or cloud, then items{}
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

                // TODO: Get from a viewModel or cloud
                item {
                    ExperienceItem(
                        jobTitle = "Android Developer",
                        companyName = "CVS Health",
                        location = "Scottsdale, AZ",
                        startDate = "March 2018",
                        endDate = "March 2022",
                        employmentType = "Full-time",
                        officeType = "Remote",
                        description = "Planned, developed, and maintained major features of the CVS Health Android app, including Pharmacy, Vaccination, Deals & Rewards, and the Photo Center.\n" +
                                "Transitioned to SAFe Agile and guided development best practices and tool utilization.\n" +
                                "Collaborated closely with iOS development to ensure consistency in functionality and user experience across platforms.\n" +
                                "Assisted in candidate interviews and onboarding of new Android developers.\n" +
                                "Contributed to the development of COVID-19 testing and vaccine scheduling features.\n" +
                                "Owned the development of a drug product page and a prescription savings feature.\n" +
                                "Implemented new functionality in the Photo Center, including in-app photo collage creation and printing.\n" +
                                "Designed the Android architecture for a major redesign of the Deals and Rewards page, adhering to modern standards and best practices.\n" +
                                "Managed versioning and source control across various features, releases, and internal libraries.\n" +
                                "Supervised the workload and assignments of other developers, fostering teamwork.\n" +
                                "Transitioned to fully remote work arrangements.\n"
                    )
                }

                // TODO: Get from a viewModel or cloud
                item {
                    ExperienceItem(
                        jobTitle = "Android Developer",
                        companyName = "Charles Schwab",
                        location = "Austin, TX",
                        startDate = "March 2017",
                        endDate = "February 2018",
                        employmentType = "Contract",
                        officeType = "Onsite",
                        description = "Contributed to various features in Charles Schwab's Android applications, including push notifications, a messaging center, notification settings, main settings, travel notifications, documents and reports, and navigation redesign.\n" +
                                "Employed GitFlow for version control and C.I. using Git and BitBucket.\n" +
                                "Utilized dependency injection for third-party libraries and internal objects.\n" +
                                "Leveraged modern Android features such as data binding and location-based services.\n" +
                                "Collaborated with the middleware team to design and integrate APIs.\n"
                    )
                }

                // TODO: Get from a viewModel or cloud
                item {
                    ExperienceItem(
                        jobTitle = "Software Development Engineer in Test",
                        companyName = "Microsoft",
                        location = "Redmond, WA",
                        startDate = "September 2014",
                        endDate = "August 2016",
                        employmentType = "Contract",
                        officeType = "Onsite",
                        description = "Played multifaceted roles, including Developer, Developer in Test, and QA, in localizing Cortana for Spain-Spanish and Mexico-Spanish markets on Windows and Android.\n" +
                                "Led communication and reporting between testing teams and QA Leads.\n" +
                                "Conducted black-box manual smoke tests, and managed bug tracking and regression.\n"
                    )
                }
            }
        }
    }
}