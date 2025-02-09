package com.example.youtubeplaylistmanager.data.remote.mapper

import com.example.youtubeplaylistmanager.data.remote.dto.VideoDto
import com.example.youtubeplaylistmanager.domain.model.Video

object VideoMapper {
    fun mapFromDto(dto: VideoDto): Video {
        return Video(
            id = dto.id,
            title = dto.snippet.title,
            description = dto.snippet.description,
            thumbnailUrl = dto.snippet.thumbnails.medium.url,
            channelTitle = dto.snippet.channelTitle
        )
    }
}