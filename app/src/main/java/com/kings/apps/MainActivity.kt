package com.kings.apps

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onFeliz(view: View){
        val intent = Intent(this, FelizActivity::class.java)
        startActivity(intent)
    }

    fun onTedio(view: View){
        val intent = Intent(this, MedioActivity::class.java)
        startActivity(intent)
    }

    fun onTriste(view: View){
        val intent = Intent(this, TristeActivity::class.java)
        startActivity(intent)
    }
}