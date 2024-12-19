package com.example.studybud.ui.theme.dashboard

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.studybud.model.Subject

@Composable
fun DashboardScr(

) {
    val subjects = listOf(
        Subject(name = "Softveri", ciljSati = 20f, boje = Subject.subjectCardcolors[0]),
        Subject(name = "TS", ciljSati = 5f, boje = Subject.subjectCardcolors[1]),
        Subject(name = "Mata2", ciljSati = 10f, boje = Subject.subjectCardcolors[2]),
        Subject(name = "OOP", ciljSati = 10f, boje = Subject.subjectCardcolors[3]),

    )
    Scaffold(
        topBar = {
            DashboardScrTopBar()
        }
    ) { paddingValues ->
        // Ovde možete dodati sadržaj za glavni deo ekrana
        LazyColumn(
            modifier = Modifier
                .fillMaxSize() // Postavlja LazyColumn da zauzme celu visinu
                .padding(paddingValues) // Dodao padding od Scaffold-a kako sadržaj ne bi bio isečen
        ) {
            item {
                CounterCardSec(
                    modifier = Modifier
                        .fillMaxWidth() // Dodao fillMaxWidth() da kartica zauzme celu širinu
                        .padding(12.dp), // Dodao padding za razmak između ivica ekrana i sadržaja
                    predmetCounter = 5,
                    satiUcenja = "10",
                    ciljSati = "26"
                )
            }
            item {
                SubjCardSec(
                    modifier = Modifier.fillMaxWidth(),
                    subjList = subjects

                )
            }
        }
    }
}
