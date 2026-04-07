package com.example.projeto_android_06_04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.projeto_android_06_04.ui.nav.AppNavigation
import com.example.projeto_android_06_04.ui.screen.LibraryScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           MaterialTheme {
               Surface() {
                   AppNavigation()
               }
           }
        }
    }
}

