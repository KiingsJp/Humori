package com.kings.apps

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kings.apps.frases.Facts
import java.sql.Timestamp
import java.util.Calendar
import kotlin.random.Random

class MedioActivity : AppCompatActivity() {


    lateinit var txtAnimais: TextView
    lateinit var txtCiencia: TextView
    lateinit var txtHistoria: TextView
    lateinit var txtProfissionais: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medio)
        setFacts()
    }

    fun setFacts(){
        txtAnimais = findViewById<TextView>(R.id.txt_curiosidade_animais)
        txtCiencia = findViewById<TextView>(R.id.txt_curiosidade_ciencia)
        txtHistoria = findViewById<TextView>(R.id.txt_curiosidade_historia)
        txtProfissionais = findViewById<TextView>(R.id.txt_curiosidades_profissionais)

        val calendar = Calendar.getInstance()
        calendar.time = Timestamp(System.currentTimeMillis())

        val facts = Facts()

        val arrayAnimais: Array<String> = facts.getFacts()[0]
        val arrayCiencia: Array<String> = facts.getFacts()[1]
        val arrayHistoria: Array<String> = facts.getFacts()[2]
        val arrayProfissionais: Array<String> = facts.getFacts()[3]
        val random = Random(calendar.get(Calendar.DAY_OF_MONTH))

        txtAnimais.text = arrayAnimais[random.nextInt(10)]
        txtCiencia.text = arrayCiencia[random.nextInt(10)]
        txtHistoria.text = arrayHistoria[random.nextInt(10)]
        txtProfissionais.text = arrayProfissionais[random.nextInt(10)]

    }
}