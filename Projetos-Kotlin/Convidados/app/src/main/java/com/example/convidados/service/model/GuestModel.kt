package com.example.convidados.service.model

data class GuestModel (val id: Int = 0, var name: String, var presense: Boolean)
//Valor default a Id, no qual o banco de dados irá autoincrementar