//Classes abstratas: As classes abstratas não permitem qualquer tipo de instancia, são classes feitas para serem derivadas. As classes concretas deverão sobrescrever os métodos
//realizando a implementação dos mesmos.

abstract class Mamifero(var nome: String) {

    var peso: Float = 0f
    abstract fun falar()
    open fun dormir() {
        println("Estou dormindo")
    }

}

class Cachorro (nome: String, peso: Float) : Mamifero(nome){

    //init é executado quando uma classe é instanciada
    init {
        this.peso = peso
    }

    override fun toString(): String {
        return "nome $nome, peso $peso"
    }


    override fun falar() {
        println("auau")
    }
}


fun main() {

    var cachorro:Cachorro = Cachorro("Bob", 50.5f)

    if(cachorro is Mamifero){ //Analogo a instanceOf
        print(cachorro.toString())
    }

}

