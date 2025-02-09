package com.example.youtubeplaylistmanager.di

import com.example.youtubeplaylistmanager.data.remote.api.YouTubeService
import com.example.youtubeplaylistmanager.data.remote.mapper.VideoMapper
import com.example.youtubeplaylistmanager.data.repository.YouTubeRepository
import com.example.youtubeplaylistmanager.data.repository.YouTubeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideYouTubeRepository(
        service: YouTubeService,
        mapper: VideoMapper
    ): YouTubeRepository {
        return YouTubeRepositoryImpl(service, mapper)
    }
}