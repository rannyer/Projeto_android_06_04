package com.example.projeto_android_06_04.ui.screen

import android.widget.MediaController
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.room.util.TableInfo
import com.example.projeto_android_06_04.viewmodels.LibraryViewModel

@Composable
fun BookScreen(
    bookId: Int,
    navController: NavController,
    viewModel: LibraryViewModel = viewModel()
) {
    val book  = viewModel.getBookById(bookId).collectAsStateWithLifecycle()
    Column() {
        if(book != null){
            Text(text = "Título: ${book.value?.title ?: "Carregando..."}")
            Text(text = "Autor: ${book.value?.author ?: "Carregando..."}")
        }else{
            Text(text = "Livro não encontrado")
        }
    }




}