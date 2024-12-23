package com.example.studybud.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.studybud.R
import com.example.studybud.model.Task


fun LazyListScope.tasksList(
    sectionTItle: String, //onaj title kod taska
    emptyListText: String , //da ne peglam dvaput tekst već ovako elegant
    tasks: List<Task>,
    onTaskCardClick: (Int?)->Unit,
    onCheckBoxClick:(Task?)->Unit
    ) {
    item {
        Text(
            text = sectionTItle,
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(12.dp)

        )
    }
    if (tasks.isEmpty()) {
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .size(120.dp),
                    painter = painterResource(R.drawable.img_tasks),
                    contentDescription = emptyListText
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = emptyListText,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                )
            }
        }
    } //ako nije empty onda  prikazuješ -NE UNUTAR IF GRANE!!!!
    items(tasks) { task ->
        TaskCard(
            modifier = Modifier.padding(
                horizontal = 12.dp,
                vertical = 4.dp
            ),
            task = task,
            onCheckBoxClick = {
                onCheckBoxClick(task) //Type mismatch.
            },
            onClick ={
                onTaskCardClick(task.taskId)
            }
        )
    }
}




