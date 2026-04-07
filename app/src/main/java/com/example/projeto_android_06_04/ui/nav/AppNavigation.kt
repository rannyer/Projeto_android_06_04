package com.example.projeto_android_06_04.ui.nav

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projeto_android_06_04.ui.screen.BookScreen
import com.example.projeto_android_06_04.ui.screen.LibraryScreen
import com.example.projeto_android_06_04.viewmodels.LibraryViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val viewModel: LibraryViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "library"
    ) {
        composable("library") {
            LibraryScreen(viewModel = viewModel, navController = navController)
        }
        composable("book/{bookId}") { backStackEntry ->
            val bookId = backStackEntry.arguments?.getString("bookId")?.toIntOrNull() ?: 0
            BookScreen(bookId = bookId, navController = navController, viewModel = viewModel)
        }


    }






}