package com.example.studybud.ui.theme.dashboard

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun DashboardScrTopBar() {
    //ovo podseća na flutter malo jače
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "StudyBuddy",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    )
}
