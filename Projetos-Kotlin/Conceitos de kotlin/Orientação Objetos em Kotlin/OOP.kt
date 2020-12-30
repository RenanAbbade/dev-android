fun main() {

    var pessoa: Pessoa = Pessoa("Renan", 1997)
    var pessoa2: Pessoa = Pessoa("Renan", 1997, 23)

    pessoa.saudacao()
    pessoa2.saudacao()

    pessoa.codigoPessoa = 59069843

    println(pessoa.codigoPessoa)

}


class Pessoa(var nome: String, var anoNasc: Int) {

    var idade: Int? = null

    //Segundo constructor
    constructor(nome: String, anoNasc: Int, idade: Int) : this(nome, anoNasc) {
        this.idade = idade
    }

    //Os getters e setters padrão (Boilerplate) são criados por baixo do pano no Kotlin.

    //Se for necessário criar getters e setters especificos, podemos fazer da seguinte maneira:
    var codigoPessoa: Int = 0
        get() {
            print("Get de codigoPessoa foi chamado ")
            return field
        }
        set(value) {
            print("Set de codigoPessoa foi chamado ")
            field = value
        }

    fun saudacao() {
        when (idade) {
            null -> println("Olá, meu nome é $nome e nasci em $anoNasc")
            else -> println("Olá, meu nome é $nome e nasci em $anoNasc, tenho $idade anos")
        }

    }
}
