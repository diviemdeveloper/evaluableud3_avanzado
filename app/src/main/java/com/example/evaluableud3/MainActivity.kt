package com.example.evaluableud3   // <- cambia por tu paquete

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val destinos = mapOf(
            R.id.btnEjercicio1 to Ejercicio1Activity::class.java,
            R.id.btnEjercicio2 to Ejercicio2Activity::class.java,
            R.id.btnEjercicio3 to Ejercicio3Activity::class.java,
            R.id.btnEjercicio4 to Ejercicio4Activity::class.java,
            R.id.btnEjercicio5 to Ejercicio5Activity::class.java,
            R.id.btnEjercicio6 to Ejercicio6Activity::class.java
        )

        destinos.forEach { (idBoton, activity) ->
            findViewById<Button>(idBoton).setOnClickListener {
                startActivity(Intent(this, activity))
            }
        }
    }
}