package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.holamundo.Activity.Usuario

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        var nombre = intent.getStringExtra("nombre")
        var apellido = intent.getStringExtra("apellido")


        var bundleUsuario = intent.getBundleExtra("claseUsuario")


        var usuario = Usuario(bundleUsuario!!)
        var tv = findViewById<TextView>(R.id.textViewNombre )
        tv.text = usuario.nombre + " "+ usuario.apellido

      //  var resultado = intent.getIntExtra("resultado",-1)

    }
}