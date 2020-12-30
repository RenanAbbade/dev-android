interface Funcionaro{
    fun calculaBonus();
}

class Gerente : Funcionaro {
    override fun calculaBonus() {
        println("Bonus: 50000,00")
    }
}

class Coordenador : Funcionaro {
    override fun calculaBonus() {
        println("Bonus: 25000,00")
    }
}


fun main() {

    val f1 : Funcionaro = Gerente();
    val f2 : Funcionaro = Coordenador();

    calculo(f1)

    calculo(f2)

}

fun calculo(f: Funcionaro){
    f.calculaBonus()
}

