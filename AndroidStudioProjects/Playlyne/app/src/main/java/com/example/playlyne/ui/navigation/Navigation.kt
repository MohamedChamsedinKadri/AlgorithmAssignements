package com.example.playlyne.ui.navigation

import androidx.compose.runtime.Composable

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.VideoPlayer.route) {
        composable(Screen.VideoPlayer.route) { VideoScreen() }
        composable(Screen.IPTVPlayer.route) { IPTVScreen() }
        composable(Screen.CaptureMode.route) { CaptureScreen() }
    }
}