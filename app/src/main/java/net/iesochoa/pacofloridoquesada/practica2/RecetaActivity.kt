package net.iesochoa.pacofloridoquesada.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecetaActivity : AppCompatActivity() {
    private lateinit var tvContenidoDescripcion: TextView
    private lateinit var tvContenidoIngredientes: TextView
    private lateinit var tvContenidoReceta: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)

        //Encontrando IDS
        tvContenidoDescripcion = findViewById(R.id.tvContenidoDescripcion)
        tvContenidoIngredientes = findViewById(R.id.tvContenidoIngredientes)
        tvContenidoReceta = findViewById(R.id.tvContenidoReceta)

        //Enviando datos a MostrarDatosActivity
        tvContenidoDescripcion.setOnClickListener {
            llamaActivytyMostrarDatos(
                "Descripción Receta",
                tvContenidoDescripcion.text.toString()
            )
        }
        tvContenidoIngredientes.setOnClickListener {
            llamaActivytyMostrarDatos(
                "Ingredientes Receta",
                tvContenidoIngredientes.text.toString()
            )
        }
        tvContenidoReceta.setOnClickListener{
            llamaActivytyMostrarDatos(
                "Receta",
                tvContenidoReceta.text.toString()
            )
        }
    }

    //Función para enviar los datos a MostrarDatosActivity
    fun llamaActivytyMostrarDatos(tipo: String,datos: String){
        //Conectamos con la Activity
        val intent = Intent(this, MostrarDatosActivity::class.java)

        //Enviamos los datos a la Activity
        intent.putExtra(MostrarDatosActivity.EXTRA_TIPO,tipo)
        intent.putExtra(MostrarDatosActivity.EXTRA_DATOS,datos)

        //Iniciamos la Activity
        startActivity(intent)
    }
}