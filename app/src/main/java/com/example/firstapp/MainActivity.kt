package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia al botón
        val btnDale: Button = findViewById(R.id.btnDale)

        // Acción del botón
        btnDale.setOnClickListener {
            // Acción cuando se presiona el botón (Ejemplo: mostrar un mensaje Toast)
            Toast.makeText(this, "¡Botón presionado!", Toast.LENGTH_SHORT).show()
        }
    }
}
