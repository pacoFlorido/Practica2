package net.iesochoa.pacofloridoquesada.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AgendaActivity : AppCompatActivity() {
    private lateinit var etNombreContact: EditText
    private lateinit var etApellidos: EditText
    private lateinit var tvNuevoContacto: TextView
    private lateinit var btAceptarAgenda: Button
    private lateinit var btCancelarAgenda: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)
        //Encontrando IDS
        etNombreContact = findViewById(R.id.etNombreContact)
        etApellidos = findViewById(R.id.etApellidos)
        btAceptarAgenda = findViewById(R.id.btAceptarAgenda)
        tvNuevoContacto = findViewById(R.id.tvNuevoContacto)
        btCancelarAgenda = findViewById(R.id.btCancelAgenda)

        //Asignando la funcion de los botones
        btAceptarAgenda.setOnClickListener{nombreApellidos()}
        btCancelarAgenda.setOnClickListener{finish()}
    }

    // Función que cambia el texto de tvNuevoContacto a lo que hayas escrito
    // en el etNombreContact y etApellidos
    fun nombreApellidos() {
        //Compruebo que los dos EditText no estén vacíos
        if (etNombreContact.text.isEmpty() || etApellidos.text.isEmpty()){
            //Si están vacíos muestro un mensaja informativo
            Toast.makeText(this
                ,getString(R.string.msj_aceptar_sin_con_nombre_apellidos_vacio)
                , Toast.LENGTH_LONG).show()
        } else {
            //Si no están vacíos asignamos el texto de etNombreContact y etApellidos en el tvNombreContact
            tvNuevoContacto.text =
                getString(R.string.nombre_completo_agenda, etNombreContact.text, etApellidos.text)
        }
    }
}