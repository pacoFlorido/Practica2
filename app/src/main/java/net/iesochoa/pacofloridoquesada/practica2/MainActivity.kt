package net.iesochoa.pacofloridoquesada.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btAgenda: Button
    private lateinit var btReceta: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Encontrando IDS
        btAgenda = findViewById(R.id.btAgenda)
        btReceta = findViewById(R.id.btReceta)

        //Abriendo Activitys
        btReceta.setOnClickListener{startActivity(Intent(this, RecetaActivity::class.java))}
        btAgenda.setOnClickListener{startActivity(Intent(this, AgendaActivity::class.java))}
    }
}