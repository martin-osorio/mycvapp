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
import com.martinosorio.mycv.R

@Composable
fun CertificationsScreen(
    navController: NavController,
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
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
                    ScreenSubTitle(text = stringResource(R.string.certifications))
                }

                item {
                    CertificationItem(
                        certificationName = "Certified ScrumMaster (CSM)",
                        institutionName = "Scrum Alliance",
                        certificationId = "001406962",
                        issueDate = "Sep 2022",
                        expirationDate = "Aug 2024"
                    )
                }

                item {
                    CertificationItem(
                        certificationName = "Android Security Maven\nGreen Belt",
                        institutionName = "OWASP® Foundation",
                        issueDate = "Sep 2022"
                    )
                }
            }
        }
    }
}