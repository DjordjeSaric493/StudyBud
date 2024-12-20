package com.example.studybud.ui.theme.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.studybud.R
import com.example.studybud.model.Subject
import com.example.studybud.ui.theme.components.CountCard
import com.example.studybud.ui.theme.components.SubjCard

@Composable
//ovde prikazuje ove kartice sa podacima, kolko sam učio i slično
fun CounterCardSec(
    modifier: Modifier = Modifier, // Dodao podrazumevani Modifier kako bi izbegli probleme sa prazan Modifier
    predmetCounter: Int,    //redni broj predmeta koji moram da učim a ima ih pun kurac
    satiUcenja: String,
    ciljSati: String
) {
    Row(modifier = modifier.fillMaxWidth()) { // Dodao fillMaxWidth() da Row zauzme celokupnu širinu
        CountCard(
            modifier = Modifier
                .weight(1.5f) // Procenat raspodele prostora
                .fillMaxWidth(), // Dodao fillMaxWidth() kako bi CountCard zauzeo prostor predviđen za njega
            headingText = "Predmet",
            counter = "$predmetCounter" //counter je string a predmetCounter int pa pretvaram
        )
        Spacer(modifier = Modifier.width(10.dp)) //spacer razdvaja
        CountCard(
            modifier = Modifier
                .weight(1.5f)
                .fillMaxWidth(), // Dodao fillMaxWidth() kako bi CountCard zauzeo prostor predviđen za njega
            headingText = "Sati učenja",
            counter = satiUcenja
        )
        Spacer(modifier = Modifier.width(10.dp)) //spacer razdvaja
        CountCard(
            modifier = Modifier
                .weight(1.5f)
                .fillMaxWidth(), // Dodao fillMaxWidth() kako bi CountCard zauzeo prostor predviđen za njega
            headingText = "Planirano ", //koliko sati planiram da učim,
            counter = ciljSati
        )
    }
}
@Composable
fun  SubjCardSec(
    modifier: Modifier,
    subjList: List<Subject> ,//pravim listu predmeta
    emptyListText: String = "Nemaš kreirane predmete!\nKlikni + da dodaš novi"

) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "PREDMETI",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 10.dp)
            )
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Dodaj predmet"
                )
            }
        } //ako nemam listu predmeta, daj mi generičku sliku
        if (subjList.isEmpty()) {
            //
            Image(
                painter = painterResource(R.drawable.img_books),
                contentDescription = emptyListText
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = emptyListText,
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
        LazyRow (
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(start = 8.dp, end = 10.dp)
        ){
            items(subjList){
                subject ->
                SubjCard(
                    modifier =Modifier,
                    subjectName =subject.name ,
                    gradientColors = subject.boje ,
                    onClick = {

                    }
                )
            }
        }
    }

}

