package com.example.convidados.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AbscentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Abscent Fragment"
    }
    val text: LiveData<String> = _text
}