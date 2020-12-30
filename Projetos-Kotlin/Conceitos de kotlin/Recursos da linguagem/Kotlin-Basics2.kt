
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
 
   //FOR
  val name = "Renan Henrique"
   for( c in name){
    println("$c ")
   }
    
   for( i in 1..100){
       println("$i ")
   }
    
    //for in range com step
  for( i in 1..100 step 5){
       println("$i ")
   }
    
    //for regressivo
   for(j in 100 downTo 0){
    println("$j ")
   }
 
   //DO-WHILE Executa uma vez antes de verificar o valor booleano
   var l = 0
   do{
       println(l)
       l++
   }while(l < 100)
 
 
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





 
 
