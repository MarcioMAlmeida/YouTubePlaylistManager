package com.example.youtubeplaylistmanager.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.youtubeplaylistmanager.HomeScreen
import com.example.youtubeplaylistmanager.presentation.auth.LoginScreen

@Composable
fun MainApp(navController: NavHostController) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(
                onSuccess = { navController.navigate("home") }
            )
        }
        composable("home") {
            HomeScreen()
        }
    }
}