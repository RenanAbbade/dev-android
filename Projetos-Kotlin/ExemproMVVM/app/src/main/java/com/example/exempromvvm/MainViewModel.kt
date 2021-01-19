package com.example.exempromvvm

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//Responsável pela lógica do negócio
class MainViewModel : ViewModel(){

    private var mRepository = PersonRepository()

    private var mLogin = MutableLiveData<Boolean>()
    var login = mLogin

    private var mTextWelcome = MutableLiveData<String>() //MutableLiveData Permite que nossa MainActivity fique escutando esse dado mutavel vivo, assim que for alterado a MainActiviry reage.

    var textWelcome = mTextWelcome

    //Instanciando a variavel mTextWelcome
    init {
        mTextWelcome.value = "Hello World"
    }

    fun login(name : String){
        val ret = mRepository.login(name)

    }


}