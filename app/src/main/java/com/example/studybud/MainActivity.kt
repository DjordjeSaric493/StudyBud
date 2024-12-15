package com.example.studybud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.studybud.ui.theme.StudyBudTheme
import com.example.studybud.ui.theme.dashboard.DashboardScr

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudyBudTheme {
                DashboardScr()
            }
        }
    }
}


