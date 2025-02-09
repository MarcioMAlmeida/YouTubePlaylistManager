package com.example.youtubeplaylistmanager.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.youtubeplaylistmanager.presentation.auth.AuthViewModel
import com.example.youtubeplaylistmanager.presentation.auth.LoginScreen
//import com.example.youtubeplaylistmanager.presentation.playlists.PlaylistScreen
import com.example.youtubeplaylistmanager.presentation.search.SearchScreen
import com.example.youtubeplaylistmanager.ui.theme.YouTubePlaylistManagerTheme
import com.google.firebase.auth.FirebaseAuth

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Search : Screen("search")
    object Playlists : Screen("playlists")
}

@Composable
fun MainApp() {
    YouTubePlaylistManagerTheme {
        val navController = rememberNavController()
        val authViewModel: AuthViewModel = hiltViewModel()
        val currentUser by authViewModel.currentUser.collectAsState()

        LaunchedEffect(currentUser) {
            if (currentUser != null) {
                navController.navigate(Screen.Search.route) {
                    popUpTo(Screen.Login.route) { inclusive = true }
                }
            }
        }

        NavHost(
            navController = navController,
            startDestination = if (FirebaseAuth.getInstance().currentUser != null) {
                Screen.Search.route
            } else {
                Screen.Login.route
            }
        ) {
            composable(Screen.Login.route) {
                LoginScreen(
                    onLoginSuccess = { navController.navigate(Screen.Search.route) }
                )
            }

            composable(Screen.Search.route) {
                SearchScreen(
                    onVideoClick = { videoId ->
                    },
                )
            }
        }
    }
}