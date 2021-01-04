package com.example.primeiroprojetokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(this)

        /*
        * Existem 2 métodos utilizados para atribuir o evento de clique:
        * 1.Chamada pelo XML -> Dentro de um elemento do XML, utilizar a propriedade onClick, e atribuir como resultado o nome de um método da classe java atribuida ao XML.
        * 2.Implementando a interface View.OnClickListener, para desacoplar o XML e incluir a chamada somente na classe, que é o mais apropriado e será utilizado aqui.
        * */


    }

    override fun onClick(view: View?) {

        //Para identificar o elemento que foi clicado, da forma de clique de envento utilizando a interface OnClickListener
        //Utiliza-se uma lógica para validar o id do elemento e então atribuir uma action

        val id = view?.id //null safe call

        if (id == R.id.buttonCalculate) {
            calculate()
        }
    }

    private fun calculate() {

        if (validateOk()) {

            try {

                val distancia = editDistancia.text.toString().toFloat()
                val preco = editPreco.text.toString().toFloat()
                val autonomia = editAutonomia.text.toString().toFloat()

                val totalValue = (distancia * preco) / autonomia

                editResultado.text = "R$ ${"%.2f".format(totalValue)}"

            } catch (nfe: NumberFormatException) {
                Toast.makeText(this, getString(R.string.informe_dados_validos), Toast.LENGTH_LONG)
            }
        } else {
            //Criando notificação para informar os campos invalidas, passa-se applicationContext ou this se estamos falando da propria Activity, sequencia de String, tempo em que a msg é apresentada na tela
            Toast.makeText(this, getString(R.string.preencha_todos_campos), Toast.LENGTH_LONG)
                .show()
        }
    }

    //Função inline
    private fun validateOk(): Boolean =
        (editDistancia.text.toString() != "" && editAutonomia.text.toString() != "" && editPreco.text.toString() != "" && editAutonomia.text.toString() != "0")

}
