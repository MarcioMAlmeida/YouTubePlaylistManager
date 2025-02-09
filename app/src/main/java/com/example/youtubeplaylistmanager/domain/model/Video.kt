package com.example.youtubeplaylistmanager.domain.model

data class Video(
    val id: String,
    val title: String,
    val description: String,
    val thumbnailUrl: String,
    val channelTitle: String
)