fun main() {

    var pessoa: Pessoa = Pessoa("Renan", 1997)
    var pessoa2: Pessoa = Pessoa("Renan", 1997, 23)

    pessoa.saudacao()
    pessoa2.saudacao()
}


class Pessoa(var nome: String, var anoNasc: Int){

    var idade: Int? = null

    //Segundo constructor
    constructor(nome: String, anoNasc: Int, idade: Int) : this(nome,anoNasc){
        this.idade = idade
    }

    fun saudacao(){
        when(idade){
            null -> println("Olá, meu nome é $nome e nasci em $anoNasc!")
            else -> println("Olá, meu nome é $nome e nasci em $anoNasc, tenho $idade anos!")
        }
    }
}
