
class Maquina(var marca: String){
    fun ligar(){}

    fun desligar(){}

    fun processar(){}
}

fun main() {

    var m = Maquina("xpto")

    with(m){
        ligar()
        desligar()
        processar()
    }

    //Com o With, consigo chamar diferentes métodos de uma mesma instância, reduzindo o código da forma convencional.

}
