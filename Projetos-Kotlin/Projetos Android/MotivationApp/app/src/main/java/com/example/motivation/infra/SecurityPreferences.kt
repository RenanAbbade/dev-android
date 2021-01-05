package com.example.motivation.infra

import android.content.Context

class SecurityPreferences(context: Context) {

    private val mSharedPreferences = context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, value: String){
        this.mSharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String) : String{
        //getString do SharedPreferences, deve possuir um default value, caso seja requerido o valor de uma variavel null
        //Utilizando o recurso do Kotlin, elvis operator -> ?: que basicamente faz a seguinte lógica: Se não for null, use-o, se for use o valor após o "?:"
        return this.mSharedPreferences.getString(key,"") ?: ""

    }

    //O SharedPreferences possui diversos metodos de storege referente a diveferentes tipos, além de String, como putBoolean, putInt, se precisar colocar outros, basta copiar os de String e modificar o put.
}