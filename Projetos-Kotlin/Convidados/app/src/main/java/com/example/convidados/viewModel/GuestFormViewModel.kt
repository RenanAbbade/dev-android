package com.example.convidados.viewModel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.convidados.service.model.GuestModel
import com.example.convidados.service.repository.GuestRespository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) { //Utilizando AndroidViewModel para habilitar o context do Android

    private val mContext = application.applicationContext
    private val mGuestRepository: GuestRespository = GuestRespository.getInstance(mContext)

    //Mutable Live Data estará observando
    private var mSaveGuest = MutableLiveData<Boolean>()

    //Por não ser private estará sendo observado
    val saveGuest: LiveData<Boolean> = mSaveGuest

    fun save(nome: String, presence: Boolean) {
        val guest =
            GuestModel(nome, presence)
        mGuestRepository.save(guest)

    }
}