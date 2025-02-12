package com.example.playlyne.ui.video

class VideoViewModel @ViewModelInject constructor(
    private val repository: VideoRepository
) : ViewModel() {
    private val _videoState = mutableStateOf(VideoState())
    val videoState: State<VideoState> get() = _videoState

    fun loadVideo(url: String) {
        viewModelScope.launch {
            _videoState.value = _videoState.value.copy(isLoading = true)
            val video = repository.getVideo(url)
            _videoState.value = _videoState.value.copy(video = video, isLoading = false)
        }
    }
}