package com.grabsome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.grabsome.ui.main.MainScreen
import com.grabsome.ui.theme.GrabsomeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GrabsomeTheme {
                MainScreen()
            }
        }
    }
}
