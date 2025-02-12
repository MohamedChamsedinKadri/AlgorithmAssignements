package com.example.playlyne.ui.video

import androidx.compose.runtime.Composable

@Composable
fun VideoScreen(viewModel: VideoViewModel) {
    val videoState by viewModel.videoState.collectAsState()

    Box(modifier = Modifier.fillMaxSize()) {
        if (videoState.isLoading) {
            CircularProgressIndicator()
        } else {
            VideoPlayer(video = videoState.video)
        }
    }
}