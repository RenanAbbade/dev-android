package com.example.motivation.infra

class MotivationConstants private constructor(){ //Com private constructor, essa classe não poderá ser instanciada.

    //Essa classe só servirá para armazenar os nomes dos valores constantes que serão armazenados na sessão pelo SharedSecurityPreferentes

    object KEY{
        val PERSON_NAME = "name"
    }

    object PHREASEFILTER{
        val ALL = 1
        val HAPPY = 1
        val MORNING = 1
    }
}