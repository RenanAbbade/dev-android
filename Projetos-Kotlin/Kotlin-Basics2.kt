
 //Váriavel null safe
 val test: Int? = null
 
//Operador Elvis: Trabalha com várivaveis que podem ser null - Verifica se na linha abaixo a var. test for null, se for null, 100 é o valor atribuido, se não a variavel atual continua.
val op: Int = test?:100//Se existe valor em test, use, se não, use 100
  
  
 //utilização do when (Simplificação de if's)
fun main(args: Array<String>) {

    valida(5,2)
    println(operacao(10,12,"soma"))
    println(operacao(11,5,"subtração"))
    println(operacao(5,5,"multiplicacao"))
}

fun operacao (a: Int, b: Int, c: String) : Int{
    when(c){ //Quando c tiver o valor de "soma"
        "soma" ->{ 
            return a + b
        }
        "subtração" ->{
            return a - b
        }
        
        //se tiver somente uma instrução, posso tirar os colchetes
        "multiplicacao" -> return a * b
        
        //fluxo default
        else -> {return 0}
    }
}

fun valida (a: Int, b: Int){
    when{ //Quando c tiver o valor de "soma"
        a > 0 && b > 0 -> println("variaveis positivas")
    }
    //when por range - Intervalo de valores
    when{
        a in 1..10 -> { 
        println("a está entre entre 1 e 10")
        }
    }
}


 
 
