package com.example.motivation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivation.R
import com.example.motivation.infra.MotivationConstants
import com.example.motivation.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurityPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Implementação do SharedPreferences
        mSecurityPreferences = SecurityPreferences(this)

        //Retirando barra de navegação da tela
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        buttonSave.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        val id = view?.id

        if (id == R.id.buttonSave) {
            handleSave()
        }
    }

    private fun handleSave() {
        val name = editName.text.toString()

        if (!name.isBlank()) {
            //Intent (Intenção): Utilizado para varias coisas, neste caso será utilizado para navegação entre activities, iniciar uma nova activitie
            //Passando o contexto verificado na AppCompatActivity, e passando a activitie alvo, após isso os ::class.java servem para que o java se encarregue de instanciar a nova activitie, a inserindo no ciclo de vida do android

            mSecurityPreferences.storeString(MotivationConstants.KEY.PERSON_NAME, name)
            startActivity(Intent(this, MainActivity::class.java))

        } else {
            Toast.makeText(this, "Informe seu nome", Toast.LENGTH_LONG).show()
        }

    }
}
