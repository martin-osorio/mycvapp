package com.martinosorio.mycv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.martinosorio.mycv.ui.ContactScreen
import com.martinosorio.mycv.ui.EducationScreen
import com.martinosorio.mycv.ui.ExperienceScreen
import com.martinosorio.mycv.ui.ExperiencesScreen
import com.martinosorio.mycv.ui.ResourcesScreen
import com.martinosorio.mycv.ui.ScreenTitle
import com.martinosorio.mycv.ui.SkillsScreen
import com.martinosorio.mycv.ui.SplashScreen
import com.martinosorio.mycv.ui.SummaryScreen
import com.martinosorio.mycv.ui.theme.MyCVTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyCVTheme {
                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = NavDestinations.SplashScreen.destination
                    ) {
                        composable(NavDestinations.SplashScreen.destination) {
                            SplashScreen(navController = navController)
                        }

                        composable(NavDestinations.SummaryScreen.destination) {
                            SummaryScreen(navController = navController)
                        }

                        composable(NavDestinations.ExperiencesScreen.destination) {
                            ExperiencesScreen(navController = navController)
                        }

                        composable(NavDestinations.ExperienceScreen.destination) {
                            ExperienceScreen(navController = navController)
                        }

                        composable(NavDestinations.EducationScreen.destination) {
                            EducationScreen(navController = navController)
                        }

                        composable(NavDestinations.SkillsScreen.destination) {
                            SkillsScreen(navController = navController)
                        }

                        composable(NavDestinations.ContactScreen.destination) {
                            ContactScreen(navController = navController)
                        }

                        composable(NavDestinations.ResourcesScreen.destination) {
                            ResourcesScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCVTheme {
        ScreenTitle("Android")
    }
}