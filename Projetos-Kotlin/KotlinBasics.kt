
    fun main(args: Array<String>) {
        
       var settado = true //var are commun variables, KT is not a strong style programming language, this var could be assigned to any type.
            
       var salario = 1000
       var bonus = 300

       var total = salario + bonus

       println( "O salário é $total " )

       var nomes = arrayOf(520, "Letícia", "Mariana", "José") //ArrayOf refers to a generic list, of any type
       var numero = intArrayOf(10, 30, 40) //intArray refers to a list of integers numbers

            //nomes[4] = "Pedro" -> This is how a index is accessed on a list in KT

       println( numero[0].toString())
            
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
        if(number%2 == 0){
            return true
        }
        return false
    }
