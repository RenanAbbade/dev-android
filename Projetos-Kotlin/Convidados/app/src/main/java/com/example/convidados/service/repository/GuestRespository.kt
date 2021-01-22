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

    fun get(id: Int) : GuestModel?{

        var guest: GuestModel? = null

        return try {
            val db = mGuestDataBaseHelper.readableDatabase

            /**
             * Outra forma mais enxuta de fazer a consulta, seria utilizando o método rawQuery, porém é menos seguro:
             *  db.rawQuery("select * from Guest where id = $id, null)
             *  passa-se como primeiro arg a consulta SQL, e como segundo o criterio de seleção, no caso null
             **/

            val projection = arrayOf(DataBaseConstants.GUEST.COLUMNS.NAME, DataBaseConstants.GUEST.COLUMNS.PRESENCE)

            val selection = DataBaseConstants.GUEST.COLUMNS.ID + " =?"
            val args = arrayOf(id.toString())

            val cursor = db.query(DataBaseConstants.GUEST.TABLE_NAME, projection, selection, args, null, null, null)

            if(cursor != null && cursor.count > 0){
                cursor.moveToFirst()
                val name = cursor.getString(cursor.getColumnIndex(DataBaseConstants.GUEST.COLUMNS.NAME))
                val presence = (cursor.getInt(cursor.getColumnIndex(DataBaseConstants.GUEST.COLUMNS.PRESENCE)) == 1) //Bool

                guest = GuestModel(id, name, presence)
            }

            cursor.close()
            guest
        } catch (e: Exception) {
            guest
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

    fun delete(id: Int) : Boolean {
        return try {
            val db = mGuestDataBaseHelper.writableDatabase //Atualização

            //A lógica do deletedeverá ser baseada na coluna ID, o ? será substituido pela val args que incorpora o Id do usuário
            val selection = DataBaseConstants.GUEST.COLUMNS.ID + " =?"
            val args = arrayOf(id.toString())

            db.delete(DataBaseConstants.GUEST.TABLE_NAME,  selection, args)
            true
        } catch (e: Exception) {
            false
        }

    }
}