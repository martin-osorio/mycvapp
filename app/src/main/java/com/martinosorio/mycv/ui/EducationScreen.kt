package com.martinosorio.mycv.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.martinosorio.mycv.R

@Composable
fun EducationScreen(
    navController: NavController,
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.TopCenter)
                    .padding(start = 18.dp, end = 18.dp)
            ) {
                ScreenTitle(text = stringResource(R.string.martin_osorio))

                ScreenSubTitle(text = stringResource(R.string.education))

                EducationItem(
                    institutionName = "Florida State University",
                    degreeType = "Bachelor of Science",
                    degreeSubject = "Computer Science",
                    location = "Tallahassee, FL",
                    startDate = "Fall 2010",
                    endDate = "Spring 2014"
                )
            }
        }
    }
}