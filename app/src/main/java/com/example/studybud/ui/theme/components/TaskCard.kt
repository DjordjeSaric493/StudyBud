package com.example.studybud.ui.theme.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.studybud.model.Task

@Composable
fun TaskCard(
    modifier: Modifier=Modifier,
    task: Task
    ){
    //UI
    ElevatedCard(
        modifier= modifier.clickable {}
    ){
        Row(modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically){
            TaskCheckBox(
                isComplete = task.isComplete,
                borderColor = Color.Black,
                onCheckBoxClick ={} )
            Spacer(modifier=Modifier.width(10.dp))
            Column {
                Text(
                    text=task.title,
                    maxLines = 1,
                    overflow = TextOverflow.Clip,
                    style = MaterialTheme.typography.titleMedium,
                    textDecoration = if(task.isComplete){
                        //menjam dekor u zavisnosti od rešenog posla
                        TextDecoration.LineThrough
                    }else TextDecoration.None
                )
                Spacer(
                    modifier = Modifier.height(4.dp)
                )
                Text(text="$(task.dueDate)",//konvertujem long u string, pogledaj model
                    style = MaterialTheme.typography.bodySmall)
            }
        }
    }

}