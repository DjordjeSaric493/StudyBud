package com.example.studybud.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.studybud.R

@Composable
fun SubjCard(
    modifier: Modifier,
    subjectName: String,
    gradientColors: List<Color>,
    onClick:()->Unit
) {
    //ovde radimo karticu sa predmetom, trpamo u box pa u boxu column
    Box(   //veličina boxa
        modifier = Modifier.size(160.dp)
            .clickable { onClick() }
            .background(
                brush = Brush.verticalGradient(gradientColors),
                shape= MaterialTheme.shapes.medium
            )
    ){
        Column(modifier = Modifier.padding(10.dp),
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(R.drawable.img_books),
                contentDescription = subjectName,
                modifier = Modifier.size(80.dp)
            )
            Text(
                text = subjectName,
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )
        }
    }
}