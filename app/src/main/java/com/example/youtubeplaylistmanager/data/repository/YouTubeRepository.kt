package com.example.youtubeplaylistmanager.data.repository

import com.example.youtubeplaylistmanager.domain.model.Video

interface YouTubeRepository {
    suspend fun searchVideos(query: String): List<Video>
}