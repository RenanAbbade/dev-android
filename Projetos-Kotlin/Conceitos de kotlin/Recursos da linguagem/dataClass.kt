
//data class Representa uma classe que transita dados
data class Triangulo(val area: Float)

fun main() {

    val t1 = Triangulo(10f)
    val t2 = Triangulo(55f)

    println(t1)
    println(t2)

    //copy
    val t3 = t2.copy()

    println(t3)


    /*
    Output

    Triangulo(area=10.0)
    Triangulo(area=55.0)
    --------------------
    Vantagens de data class

    Diferente de uma class comum, a data class facilita a visualização dos dados aplicando o toString sem invoke.

    O data class já implementa o equals e hashCode comparando diretamente seus valores em vez do endereço de memória como em uma class convencional.

    O data class tem o método .copy(), responsável por copiar os valores de uma instância em outra instância do mesmo objeto

     */

}
