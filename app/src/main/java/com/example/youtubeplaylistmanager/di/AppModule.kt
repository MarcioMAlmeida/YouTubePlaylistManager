package com.example.youtubeplaylistmanager.di

import androidx.compose.runtime.mutableStateOf
import com.google.api.services.youtube.model.Playlist
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideGlobalState(): GlobalState = GlobalState()
}

class GlobalState {
    val currentPlaylist = mutableStateOf<Playlist?>(null)
}