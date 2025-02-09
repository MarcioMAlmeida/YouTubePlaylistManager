package com.example.youtubeplaylistmanager.domain.usecase

import com.example.youtubeplaylistmanager.domain.model.Video
import com.example.youtubeplaylistmanager.domain.model.Result
import com.example.youtubeplaylistmanager.data.repository.YouTubeRepository
import javax.inject.Inject

class SearchVideosUseCase @Inject constructor(
    private val repository: YouTubeRepository
) {
    suspend operator fun invoke(query: String): Result<List<Video>> {
        return try {
            Result.Success(repository.searchVideos(query))
        } catch (e: Exception) {
            Result.Error(e.message ?: "Erro desconhecido")
        }
    }
}