package com.kings.apps

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kings.apps.frases.Jokes
import java.sql.Timestamp
import java.util.Calendar

class FelizActivity : AppCompatActivity() {

    lateinit var txtCharada: TextView
    lateinit var txtResposta: TextView
    lateinit var vetorCharada: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feliz)
        txtCharada = findViewById<TextView>(R.id.txt_charada)
        txtResposta = findViewById<TextView>(R.id.txt_resposta)

        setJoke()
    }

    private fun setJoke(){
        val jokes = Jokes()
        val charadas = jokes.getJoke()

        val calendar = Calendar.getInstance()
        calendar.time = Timestamp(System.currentTimeMillis())

        vetorCharada = charadas[calendar.get(Calendar.DAY_OF_MONTH)].split("?")

        val charada = "${vetorCharada[0]}?"

        txtCharada.text = charada
    }

    fun setResposta(view: View){
        txtResposta.text = vetorCharada[1].trim()
    }
}