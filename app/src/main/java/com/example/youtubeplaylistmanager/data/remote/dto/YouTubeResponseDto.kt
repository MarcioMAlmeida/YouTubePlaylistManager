package com.example.youtubeplaylistmanager.data.remote.dto

import com.google.gson.annotations.SerializedName

data class YouTubeResponseDto(
    @SerializedName("items") val items: List<VideoDto>
)