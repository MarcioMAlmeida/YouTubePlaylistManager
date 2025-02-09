package com.example.youtubeplaylistmanager.data.remote.dto

import com.google.gson.annotations.SerializedName

data class VideoDto(
    @SerializedName("id") val id: String,
    @SerializedName("snippet") val snippet: SnippetDto
)

data class SnippetDto(
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("thumbnails") val thumbnails: ThumbnailsDto,
    @SerializedName("channelTitle") val channelTitle: String
)

data class ThumbnailsDto(
    @SerializedName("medium") val medium: ThumbnailDto
)

data class ThumbnailDto(
    @SerializedName("url") val url: String
)