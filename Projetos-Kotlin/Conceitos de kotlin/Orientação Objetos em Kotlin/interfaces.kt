//Interface: Um contrato que as classes que herdam devem implementar seus métodos.
//Não existe herança multipla, porém uma classe pode herdar mais que uma interface.

interface Mamifero {
    fun falar() {}
}

interface Animal {
    fun respirar() {}
}

class Cachorro (nome: String, peso: Float) : Mamifero, Animal{


    override fun falar(){
        super.falar()
    }
    override fun respirar() {
        super.respirar()
    }
}


fun main() {

    var cachorro:Cachorro = Cachorro("Bob", 50.5f)

    if(cachorro is Mamifero && cachorro is Animal){ //Analogo a instanceOf
        print(cachorro.toString())
    }

}

