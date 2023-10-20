package net.iesochoa.pacofloridoquesada.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btAgenda: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btAgenda = findViewById(R.id.btAgenda)

        btAgenda.setOnClickListener{abrirAgenda()}
    }

    fun abrirAgenda() {
        val intentAgenda = Intent(this, Agenda::class.java)
        startActivity(intentAgenda)
    }
}