package com.example.testeretrofit

import com.google.gson.annotations.SerializedName

class PostModel {


    var id: Int = 0

    //A annotation SerializedName possibilita a conversão de JSON indicando o nome especifico do campo que vem na response JSON,
    // o mesmo não é necessário se os atributos já possuem exatamente o mesmo nome do atributo que vem na response
    @SerializedName("userId")
    var idUser: Int = 0

    var title:String = ""

    var body:String = ""
}