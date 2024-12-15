package com.example.studybud.model

import android.graphics.Color
import com.example.studybud.ui.theme.gradient1
import com.example.studybud.ui.theme.gradient2
import com.example.studybud.ui.theme.gradient3
import com.example.studybud.ui.theme.gradient4
import com.example.studybud.ui.theme.gradient5

data class Subject (
    val name: String,
    val ciljSati: Float,
    val boje: List<Color>
){
    companion object{
        val subjectCardcolors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }
}