fun main() {

    var pessoa: Pessoa = Pessoa("Renan", 1997)
    print(pessoa.nome)

    pessoa.saudacao()
}


class Pessoa(var nome: String, var anoNasc: Int){

    fun saudacao(){
        println("Olá, meu nome é $nome e nasci em $anoNasc")
    }
}
