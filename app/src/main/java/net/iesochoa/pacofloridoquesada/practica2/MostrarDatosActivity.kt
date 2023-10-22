package net.iesochoa.pacofloridoquesada.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MostrarDatosActivity : AppCompatActivity() {
    private lateinit var tvTitulo: TextView
    private lateinit var tvDatos: TextView
    private lateinit var btAceptar: Button
    companion object{
        //CONSTANTES que recibimos de la Activity MostrarDatosActivity
        val EXTRA_DATOS = "practica2.MostrarDatosActivity.dato"
        val EXTRA_TIPO = "practica2.MostrarDatosActivity.tipo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_datos)

        //Encontrando IDS
        tvTitulo = findViewById(R.id.tvTitulo)
        tvDatos = findViewById(R.id.tvDatos)
        btAceptar = findViewById(R.id.btAceptarMostrarDatos)

        //Asignando los valores que recibimos en las Constantes a los elementos de esta Activity
        tvTitulo.text = intent.getStringExtra(EXTRA_TIPO)
        tvDatos.text = intent.getStringExtra(EXTRA_DATOS)

        //Asignando la accion del boton btAceptarMostrarDatos
        btAceptar.setOnClickListener{finish()}
    }
}