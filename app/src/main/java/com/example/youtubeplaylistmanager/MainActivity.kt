package com.example.youtubeplaylistmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.youtubeplaylistmanager.presentation.MainApp
import com.example.youtubeplaylistmanager.ui.theme.YouTubePlaylistManagerTheme
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val auth = Firebase.auth

            YouTubePlaylistManagerTheme {
                MainApp()
            }
        }
    }
}