package com.example.banktogo.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.banktogo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Retirando barra de navegação da tela
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        //imageView.clipToOutline = true

        buttonAutosservice.setOnClickListener(this)
        buttonTotem.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val id = view?.id

        if (id == R.id.buttonAutosservice) {
            //redirect autosservico startActivity(Intent(this, MainActivity::class.java))

        }
        if(id == R.id.buttonTotem){
            startActivity(Intent(this, TotemActivity::class.java))
        }
    }
}
