/*
Kotlin é Open Source, 100% compativel com Java(aderencia a código escrito em Java), orientada a objetos e funcional, assim como Java pode ser utilizada com Spring, podendo ser utilizada em vários tipos de aplicações
Kotlin é uma linguagem estaticamente tipada - Significa que o compilador no momento de execução já sabe o tipo de variável que será utilizada.
Kotlin é uma linguagem concisa, legivel e simplificada, principalmente em comparação com o Java.
Kotlin é null safe, impede o null point exception
A máquina virtual Java(JVM) fica em cima do sistema operacional, acontece a conversão do código Kotlin, através do ocmpliador, e é gerado o arquivo de byte code(.class), esses arquivos são lidos e executados na JVM.
A máquina virtual é responsável por conectar o sistema operacional e o programa escrito, realizando a interpretação dos .class em tempo de execução para ser executado nas arquiteturas dos Sistemas operacionais, por JIT compiler(Just in Time compiler).
*Escreva uma vez, e execute em qualquer lugar*
Tanto faz para a JVM se é java ou Kotlin, o que vai chegar para ela são os .class que são executados pela JVM independente do sistema operacional.
*/

fun main(args: Array<String>) {
	
	//Variaveis
        
       var settado = true //var are commun variables, KT is not a strong style programming language, this var could be assigned to any type, var represents a mutable variable.
	
       val cidade = "São Paulo" //val is a non-mutable variable, a constant, non-reasigned.
            
       var salario = 1000
       var bonus = 300

       var total = salario + bonus
	//val é o mesmo que final no java
       val x:Int //Assim se declara uma variável sem inicializar, por meio do tipo o Kotlin acaba não reclamando, e sabendo o espaço necessário de memória para alocar esta variável.
       var y = 0
	
       println( "O salário é $total " ) //Concat por $
	
       //Collections
       var nomes = arrayOf(520, "Letícia", "Mariana", "José") //ArrayOf refers to a generic list, of any type
       var numero = intArrayOf(10, 30, 40) //intArray refers to a list of integers numbers

       //nomes[4] = "Pedro" -> This is how a index is accessed on a list in KT

       println( numero[0].toString())
	
	//if é uma expressão em Kotlin
	//if ternário
	val str = if(y == 0) "Sim" else "Não"
            
            //Loops 
       while (settado == true){ //loop while
          println("entrou no while")
          break
        }
     	println("renan".reverse())
        println(retornaQuad(2.0))
        println(exibeMsg())
        println(retornaIntAoQuad(3))
        println(ePar(3))
        println(ePar(2))
    }

//functions 
    fun String.reverse() :String {
        return StringBuffer(this).reverse().toString();
    }

	fun retornaQuad(number: Double) : Double{
        return number * 2
    }

	fun exibeMsg() : String {
        return "exibe"
    }

	fun retornaIntAoQuad(number : Int) : Int {
        return number * number
    }

	fun ePar(number : Int) : Boolean {
 	return number%2 == 0
    }

//return utilizando if ternário
fun max(a: Int, b: Int): Int {
	    return if (a > b) a else b
	}

fun main(args: Array<String>) {
	    println(max(1, 2))
	}
