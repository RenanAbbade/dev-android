
//Palavra reservada open diz que uma classe pode ser herdada
open class Maquina(var marca: String){
    open fun minhaMarca() : String {
        return marca
    }

    fun ligar(){}

    fun desligar(){}
}

//Para herdar uma classe, deve-se incluir o nome da mesma após :, depois de se ter informado seus atributos, invocando o construtor da superclass
class Computador(marca: String, val nucleos: Int) : Maquina(marca) {
    fun processar(){}
}

fun main() {

    val m = Computador("xpto", 8)

    //Com o with, consigo chamar diferentes métodos de uma mesma instância, reduzindo o código da forma convencional.
    with(m){
        ligar()
        desligar()
        processar()
    }

    print("marca = ${m.minhaMarca()}")
}
