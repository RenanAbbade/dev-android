package com.example.convidados.service.repository

import android.content.Context
import com.example.convidados.service.model.GuestModel

class GuestRespository private constructor(context: Context){

    private var mGuestDataBaseHelper: GuestDataBaseHelper = GuestDataBaseHelper(context)

    //Singleton - Somente uma instancia desta classe, para só ter uma conexão ao mesmo tempo, evitando concorrencia de informação com o banco.
    
    //Método estatico que será responsável por retornar uma instancia desta classe
    companion object {
        //Está var irá guardar a instancia da classe
        private lateinit var repository: GuestRespository

        fun getInstance(context: Context) : GuestRespository {
            if(!::repository.isInitialized){//Verificando se a variavel repository já foi inicializada
                repository = GuestRespository(context)
            }
            return repository
        }
    }
    //CRUD
    fun save(guest : GuestModel){
        mGuestDataBaseHelper.writableDatabase
    }

    fun getAll(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getPresent(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getAbsent(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }



    fun update(guest : GuestModel){

    }

    fun delete(guest : GuestModel){

    }
}