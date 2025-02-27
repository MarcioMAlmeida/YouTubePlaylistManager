package com.example.youtubeplaylistmanager

import android.app.Application
import com.google.firebase.Firebase
import com.google.firebase.initialize
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class YoutubePlayListManagerApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Firebase.initialize(this)
    }
}