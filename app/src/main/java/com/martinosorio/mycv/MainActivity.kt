package com.martinosorio.mycv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.martinosorio.mycv.ui.theme.MyCVTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyCVTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = NavDestinations.SplashScreen.destination
                ){
                    composable(NavDestinations.SplashScreen.destination) {
                        // TODO: Implement
                    }

                    composable(NavDestinations.SummaryScreen.destination) {
                        // TODO: Implement
                    }

                    composable(NavDestinations.ExperiencesScreen.destination) {
                        // TODO: Implement
                    }

                    composable(NavDestinations.ExperienceScreen.destination) {
                        // TODO: Implement
                    }

                    composable(NavDestinations.EducationScreen.destination) {
                        // TODO: Implement
                    }

                    composable(NavDestinations.SkillsScreen.destination) {
                        // TODO: Implement
                    }

                    composable(NavDestinations.ContactScreen.destination) {
                        // TODO: Implement
                    }

                    composable(NavDestinations.LinksScreen.destination) {
                        // TODO: Implement
                    }
                }

                /*
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
                 */
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCVTheme {
        Greeting("Android")
    }
}