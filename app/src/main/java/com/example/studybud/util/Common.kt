package com.example.studybud.util

//uvezene boje iz theme
import androidx.compose.ui.graphics.Color
import com.example.studybud.ui.theme.Green
import com.example.studybud.ui.theme.Red
import com.example.studybud.ui.theme.Yellow

enum class Priority(
    val title:String,
    val color: Color, //import iz compose graphics
    val value: Int){
    LOW(title = "Nizak", color = Green, value = 0),
    MEDIUM(title = "Srednji", color = Yellow, value = 1),
    HIGH(title = "Visok", color = Red, value = 2);


    //prima prioritet u zavisnosti od integera
    companion object {
        fun fromInt(value: Int) = values().firstOrNull { it.value == value } ?: MEDIUM
    }
}

