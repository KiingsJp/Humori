package com.kings.apps

import com.kings.apps.frases.Facts
import java.sql.Timestamp
import java.util.Calendar
import kotlin.random.Random

fun main() {
    val calendar = Calendar.getInstance()
    calendar.time = Timestamp(System.currentTimeMillis())

    val facts = Facts()

    val arrayAnimais: Array<String> = facts.getFacts()[0]
    val arrayCiencia: Array<String> = facts.getFacts()[1]
    val arrayHistoria: Array<String> = facts.getFacts()[2]
    val arrayProfissionais: Array<String> = facts.getFacts()[3]

    val random = Random(calendar.get(Calendar.DAY_OF_MONTH))

    println("animais: ${arrayAnimais[random.nextInt(10)]}")
    println("ciencia:: ${arrayCiencia[random.nextInt(10)]}")
    println("historia: ${arrayHistoria[random.nextInt(10)]}")
    println("profissionais: ${arrayProfissionais[random.nextInt(10)]}")


}