package com.kings.apps

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kings.apps.frases.Motivacional
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.sql.Timestamp
import java.util.Calendar
import kotlin.random.Random

class TristeActivity : AppCompatActivity() {

    lateinit var motivacao: TextView
    lateinit var imgA: ImageView
    lateinit var imgB: ImageView
    lateinit var imgC: ImageView
    lateinit var btnIniciar: ImageView
    lateinit var mainScope: CoroutineScope

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triste)
        mainScope = MainScope()
        setMotivacional()
    }

    private fun setMotivacional() {
        val mot = Motivacional()
        val array = mot.getMotivacional()

        val calendar = Calendar.getInstance()
        calendar.time = Timestamp(System.currentTimeMillis())
        val random = Random(calendar.get(Calendar.DAY_OF_MONTH))

        motivacao = findViewById<TextView>(R.id.txt_incentivo)
        motivacao.text = array[random.nextInt(40)]
    }

    fun iniciar(view: View){
        btnIniciar = findViewById<ImageView>(R.id.img_btn_iniciar)

        imgA = findViewById<ImageView>(R.id.img_number_1)
        imgB = findViewById<ImageView>(R.id.img_number_2)
        imgC = findViewById<ImageView>(R.id.img_number_3)

        imgB.alpha = 0.5F
        imgC.alpha = 0.5F

        mainScope.launch {
            imageTime()
        }

        btnIniciar.isClickable = true

    }

    suspend fun imageTime(){
        btnIniciar.isClickable = false
        var aux = 0
        imgA.setImageResource(R.drawable.ic_number_zero)
        while(aux < 4){
            aux++
            delay(1000)
            when(aux){
                1 -> imgA.setImageResource(R.drawable.ic_number_one)
                2 -> imgA.setImageResource(R.drawable.ic_number_two)
                3 -> imgA.setImageResource(R.drawable.ic_number_three)
                4 -> imgA.setImageResource(R.drawable.ic_number_four)
            }
        }

        aux = 0
        imgB.alpha = 1.0F
        imgB.setImageResource(R.drawable.ic_number_zero)

        while(aux < 7){
            aux++
            delay(1000)
            when(aux){
                1 -> imgB.setImageResource(R.drawable.ic_number_one)
                2 -> imgB.setImageResource(R.drawable.ic_number_two)
                3 -> imgB.setImageResource(R.drawable.ic_number_three)
                4 -> imgB.setImageResource(R.drawable.ic_number_four)
                5 -> imgB.setImageResource(R.drawable.ic_number_five)
                6 -> imgB.setImageResource(R.drawable.ic_number_six)
                7 -> imgB.setImageResource(R.drawable.ic_number_seven)
            }
        }

        aux = 0
        imgC.alpha = 1.0F
        imgC.setImageResource(R.drawable.ic_number_zero)

        while(aux < 8){
            aux++
            delay(1000)
            when(aux){
                1 -> imgC.setImageResource(R.drawable.ic_number_one)
                2 -> imgC.setImageResource(R.drawable.ic_number_two)
                3 -> imgC.setImageResource(R.drawable.ic_number_three)
                4 -> imgC.setImageResource(R.drawable.ic_number_four)
                5 -> imgC.setImageResource(R.drawable.ic_number_five)
                6 -> imgC.setImageResource(R.drawable.ic_number_six)
                7 -> imgC.setImageResource(R.drawable.ic_number_seven)
                8 -> imgC.setImageResource(R.drawable.ic_number_eight)
            }
        }

        btnIniciar.isClickable = true
    }
}