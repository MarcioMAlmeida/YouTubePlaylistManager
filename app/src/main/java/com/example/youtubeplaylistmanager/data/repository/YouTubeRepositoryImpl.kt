package com.example.youtubeplaylistmanager.data.repository

import com.example.youtubeplaylistmanager.BuildConfig
import com.example.youtubeplaylistmanager.data.remote.api.YouTubeService
import com.example.youtubeplaylistmanager.data.remote.mapper.VideoMapper
import com.example.youtubeplaylistmanager.domain.model.Video
import javax.inject.Inject

class YouTubeRepositoryImpl @Inject constructor(
    private val service: YouTubeService,
    private val mapper: VideoMapper
) : YouTubeRepository {

    override suspend fun searchVideos(query: String): List<Video> {
        val response = service.searchVideos(
            query = query,
            apiKey = BuildConfig.YOUTUBE_API_KEY
        )
        return response.items.map { mapper.mapFromDto(it) }
    }
}