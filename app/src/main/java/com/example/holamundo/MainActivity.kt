package com.example.holamundo


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.holamundo.Activity.thirdActivity

class MainActivity : AppCompatActivity() {
    lateinit var textViewEtiqueta: TextView;
    var nombre = "";
    lateinit var editTextNombre: EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }


    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStop() {
        super.onStop()
    }

    fun onSumar(view: View){
        var editTextNumero1: EditText = findViewById(R.id.editTextNumero1)
        var editTextNumero2: EditText = findViewById(R.id.editTextNumero2)

        var numero1  = Integer.parseInt(editTextNumero1.text.toString());
        var numero2  = Integer.parseInt(editTextNumero2.text.toString());
        var resultado = numero1 + numero2 ;

        var textViewResultado: TextView = findViewById(R.id.textViewResultado)
        textViewResultado.setTextSize(42F);
        textViewResultado.text = resultado.toString();

        var mi_intent = Intent(this, SecondActivity2::class.java)


      // mi_intent = Intent(this, thirdActivity::class.java)
       // startActivity(mi_intent)
        mi_intent.putExtra("resultado",resultado)
        startActivity(mi_intent)

    }

}