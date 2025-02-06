package com.example.youtubeplaylistmanager

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

@Composable
fun HomeScreen (){
    val user = Firebase.auth.currentUser
    Text(
    text = "Bem-vindo, ${user?.displayName ?: "Usuário"}!",
    style = MaterialTheme.typography.headlineSmall
    )
}