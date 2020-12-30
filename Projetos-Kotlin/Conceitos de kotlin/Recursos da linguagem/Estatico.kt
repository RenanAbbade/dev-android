
fun main() {
    println("${Auxiliar.frase} ${Auxiliar.calculaSoma(2,3)}")
}

class Auxiliar(){

    //Com companion object, significa que não preciso instanciar a classe para utilizar seus recursos, sendo os que estão dentro de seu trecho, métodos/atributos estáticos
    companion object{

        val frase = "O resultado é"

        fun calculaSoma(a: Int, b: Int) : Int{
            return a + b
        }
    }
/* Nomeando um companion object, no main então chamaria como Auxiliar.AUX.frase ou Auxiliar.AUX.calculaSoma

    companion object AUX{

        val frase = "O resultado é"

        fun calculaSoma(a: Int, b: Int) : Int{
            return a + b
        }
    }*/
}
