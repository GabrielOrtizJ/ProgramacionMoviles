package com.example.holamundo.Activity

import android.os.Bundle

class Usuario {
    lateinit var nombre:String
    lateinit var apellido:String

    constructor(nombre: String, apellido: String) {
        this.nombre = nombre
        this.apellido = apellido
    }
    constructor(bundle: Bundle) {
      this.nombre = bundle.getString("nombre")!!;
        this.apellido = bundle.getString("apellido")!!;
    }
    fun getBundle(): Bundle?{
        var bundle = Bundle()

        bundle.putString("nombre", this.nombre)
        bundle.putString("apellido",this.apellido)
        return bundle
    }
}