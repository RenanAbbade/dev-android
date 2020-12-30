package com.example.primeiroprojetokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View){
        Log.i("BOTAO","Botão foi pressioado")
        var texto = findViewById<TextView>(R.id.textView)
        texto.setText("Texto Alterado!")

    }
}
