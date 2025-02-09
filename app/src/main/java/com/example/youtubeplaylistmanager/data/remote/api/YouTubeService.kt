package com.example.youtubeplaylistmanager.data.remote.api

import com.example.youtubeplaylistmanager.data.remote.dto.YouTubeResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeService {
    @GET("search")
    suspend fun searchVideos(
        @Query("part") part: String = "snippet",
        @Query("q") query: String,
        @Query("type") type: String = "video",
        @Query("maxResults") maxResults: Int = 20,
        @Query("key") apiKey: String
    ): YouTubeResponseDto
}