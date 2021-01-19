package com.example.exempromvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
//Manipulação de interface
class MainActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Deixamos o sistema instanciar a view model, passando para o viewModelProvier a especificação da instancia que queremos criar
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        //A MainActivity irá trabalhar como um observador, observando as ações presentes em sua  respectiva classe viewModel

        //textWelcome é passível de ter observado por ser um MutableLiveData
        //Chamo o método observe, passando o contexto presente e uma implementação do método Observer
        viewModel.textWelcome.observe(this, Observer {
            //escopo de função it, neste caso it é uma String, sendo o mesmo tipo da MutableLiveData que estaremos observando
            textWelcome.text = it
        })

        viewModel.login.observe(this, Observer {
            if(it){
                //this não funciona aqui pois está dentro do Observer
                Toast.makeText(applicationContext,"Sucesso", Toast.LENGTH_LONG).show()
            }
        })

        buttonLogin.setOnClickListener(this)




    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonLogin ->{
                val login = editName.text.toString()
                var name = viewModel.login(login)

            }

        }
    }
}
