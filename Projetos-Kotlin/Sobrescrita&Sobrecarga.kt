
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

    //Sobrescrita -> Sobrescrevendo uma função da classe pai
    override fun minhaMarca(): String {
        return "Minha máquina é $marca"
    }

    //Sobrecarga -> Métodos com a mesma assinatura, porém com parametros diferentes
    fun overload(i: Int) = println("Ov1")
    fun overload(i: String) = println("Ov2")


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

    m.overload(1)
    m.overload("oi")

    print(m.minhaMarca())
}
