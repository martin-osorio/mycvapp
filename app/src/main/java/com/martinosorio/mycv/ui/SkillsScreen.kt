package com.martinosorio.mycv.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
fun SkillsScreen(
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
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .padding(start = 18.dp, end = 18.dp)
            ) {
                item {
                    ScreenTitle(text = stringResource(R.string.martin_osorio))
                }

                item {
                    ScreenSubTitle(text = stringResource(R.string.skills))
                }

                item {
                    SkillItem(skill = "Android Application Development", yearsOfExperience = "7")
                }

                item {
                    SkillItem(skill = "Kotlin", yearsOfExperience = "5")
                }

                item {
                    SkillItem(skill = "Compose", yearsOfExperience = "3")
                }

                item {
                    SkillItem(skill = "Flow", yearsOfExperience = "3")
                }

                item {
                    SkillItem(skill = "Coroutine", yearsOfExperience = "3")
                }

                item {
                    SkillItem(skill = "Continuous Delivery", yearsOfExperience = "2")
                }

                item {
                    SkillItem(skill = "Code Review", yearsOfExperience = "5")
                }

                item {
                    SkillItem(skill = "Gradle", yearsOfExperience = "7")
                }

                item {
                    SkillItem(skill = "MVVM", yearsOfExperience = "4")
                }

                item {
                    SkillItem(skill = "OOP", yearsOfExperience = "7")
                }

                item {
                    SkillItem(skill = "Wearable", yearsOfExperience = "2")
                }

                item {
                    SkillItem(skill = "Jetpack", yearsOfExperience = "4")
                }

                item {
                    SkillItem(skill = "JSON", yearsOfExperience = "7")
                }

                item {
                    SkillItem(skill = "Software Development", yearsOfExperience = "9")
                }

                item {
                    SkillItem(skill = "REST", yearsOfExperience = "7")
                }

                item {
                    SkillItem(skill = "Git", yearsOfExperience = "9")
                }

                item {
                    SkillItem(skill = "RxJava", yearsOfExperience = "2")
                }

                item {
                    SkillItem(skill = "Java", yearsOfExperience = "9")
                }

                item {
                    SkillItem(skill = "C++", yearsOfExperience = "4")
                }

                item {
                    SkillItem(skill = "SQL", yearsOfExperience = "4")
                }

                item {
                    SkillItem(skill = "Android", yearsOfExperience = "7")
                }

                item {
                    SkillItem(skill = "Testing", yearsOfExperience = "2")
                }

                item {
                    SkillItem(skill = "Android SDK", yearsOfExperience = "7")
                }

                item {
                    SkillItem(skill = "Android Studio", yearsOfExperience = "6")
                }

                item {
                    SkillItem(skill = "XML", yearsOfExperience = "7")
                }

                item {
                    SkillItem(skill = "Material Design", yearsOfExperience = "5")
                }

                item {
                    SkillItem(skill = "Agile", yearsOfExperience = "5")
                }
            }
        }
    }
}