package com.example.convidados.service.repository

import android.content.ContentValues
import android.content.Context
import com.example.convidados.service.constants.DataBaseConstants
import com.example.convidados.service.model.GuestModel
import java.lang.Exception

class GuestRespository private constructor(context: Context) {

    private var mGuestDataBaseHelper: GuestDataBaseHelper = GuestDataBaseHelper(context)

    //Singleton - Somente uma instancia desta classe, para só ter uma conexão ao mesmo tempo, evitando concorrencia de informação com o banco.

    //Método estatico que será responsável por retornar uma instancia desta classe
    companion object {
        //Está var irá guardar a instancia da classe
        private lateinit var repository: GuestRespository

        fun getInstance(context: Context): GuestRespository {
            if (!::repository.isInitialized) {//Verificando se a variavel repository já foi inicializada
                repository = GuestRespository(context)
            }
            return repository
        }
    }

    //CRUD
    fun save(guest: GuestModel): Boolean {

        return try {
            val db = mGuestDataBaseHelper.writableDatabase

            val contentValues = ContentValues()
            contentValues.put(DataBaseConstants.GUEST.COLUMNS.NAME, guest.name)
            contentValues.put(DataBaseConstants.GUEST.COLUMNS.PRESENCE, guest.presense)

            db.insert(DataBaseConstants.GUEST.TABLE_NAME, null, contentValues)
            true
        } catch (e: Exception) {
            false
        }
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


    fun update(guest: GuestModel): Boolean {
        return try {
            val db = mGuestDataBaseHelper.writableDatabase //Atualização

            val contentValues = ContentValues()
            contentValues.put(DataBaseConstants.GUEST.COLUMNS.NAME, guest.name)
            contentValues.put(DataBaseConstants.GUEST.COLUMNS.PRESENCE, guest.presense)

            //A lógica do update(critério de atualização) deverá ser baseada na coluna ID, o ? será substituido pela val args que incorpora o Id do usuário
            val selection = DataBaseConstants.GUEST.COLUMNS.ID + " =?"
            val args = arrayOf(guest.id.toString())

            db.update(DataBaseConstants.GUEST.TABLE_NAME, contentValues, selection, args)
            true
        } catch (e: Exception) {
            false
        }

    }

    fun delete(guest: GuestModel) {

    }
}