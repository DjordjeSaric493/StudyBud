package com.example.studybud.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CountCard(
    //ša su property-ji
    modifier: Modifier=Modifier,
    headingText: String,
    counter: String //broji trenutnu karticu itd itd

) {

    ElevatedCard(modifier= modifier){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 5.dp, vertical = 11.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            //bukvalno identično kao u flutter, nema drkanja sa xml
        ) {
            Text(text=headingText,
                style=MaterialTheme.typography.labelSmall)
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "",
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 30.sp)
            )
        }
    }
}