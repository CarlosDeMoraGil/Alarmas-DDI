package edu.iesam.alarma

data class Alarm (
    val hour: String,
    val iteration: String,
    val description: String,
    var cheked: Boolean = false
)