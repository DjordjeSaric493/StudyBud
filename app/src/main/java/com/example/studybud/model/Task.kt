package com.example.studybud.model

data class Task(
    //properyji modela,razmišljao dal na srpskom ili eng da peglam promenljive i aukurac
    val title: String,
    val description: String,
    val dueDate: Long,
    val priority: Int,
    val relatedToSubject: String,
    val isComplete: Boolean
)
