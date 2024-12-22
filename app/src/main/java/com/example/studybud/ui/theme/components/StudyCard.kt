package com.example.studybud.ui.theme.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import com.example.studybud.model.Session


@Composable
fun StudySessionCard(
    modifier: Modifier = Modifier,
    session: Session,
    onDeleteIconClick:()->Unit

){
    //UI
    Card(
        modifier= modifier
    ){
        Row(modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Column {
                Text(
                    text=session.relatedToSubject,
                    maxLines = 1,
                    overflow = TextOverflow.Clip,
                    style = MaterialTheme.typography.titleMedium,

                )
                Text(text="${session.date}",//long u string, pogledaj model {$NEŠTO} pazi na zagrade
                    style = MaterialTheme.typography.bodySmall)
                Spacer(modifier = Modifier.weight(1f))
                Text(text="${session.duration} sati",//kolko učenja u satima
                    style = MaterialTheme.typography.bodySmall)
                IconButton(onClick = {
                    //delete logika
                    onDeleteIconClick
                }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Obriši sesiju"
                    )
                }
            }
        }
    }

}