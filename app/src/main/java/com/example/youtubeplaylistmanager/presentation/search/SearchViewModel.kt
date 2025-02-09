package com.example.youtubeplaylistmanager.presentation.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youtubeplaylistmanager.domain.model.Video
import com.example.youtubeplaylistmanager.domain.model.Result
import com.example.youtubeplaylistmanager.domain.usecase.SearchVideosUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val searchVideosUseCase: SearchVideosUseCase
) : ViewModel() {

    private val _searchResults = MutableStateFlow<List<Video>>(emptyList())
    val searchResults: StateFlow<List<Video>> = _searchResults

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage

    fun searchVideos(query: String) {
        viewModelScope.launch {
            _isLoading.value = true
            _errorMessage.value = null

            val result = searchVideosUseCase(query)
            _isLoading.value = false

            when (result) {
                is Result.Success -> {
                    _searchResults.value = result.data
                }
                is Result.Error -> {
                    _errorMessage.value = result.message
                }
            }
        }
    }
}