fun main() {

    val l1 = listOf<String>("Renan", "São Paulo") //Lista imutável

    val l2 = mutableListOf<String>() //Lista mutável, similar ao ArrayList do Java

    var al = arrayListOf<String>()//Retorna um ArrayList do Java, contém exatamente todos os métodos que o ArrayList do Java faz.

    val s1 = setOf<String>("Renan","Renan") //Set: Conjunto, não pega as repetições de valores, neste caso assim como o listOf, não é mutável

    val s2 = mutableSetOf<String>("Renan","Renan") //Set mutável

    val h1 = hashMapOf<String,String>(Pair("key","value"), Pair("São Paulo", "SP"))//O HashMapOf neste caso é mutável, possui métodos de leitura, delete e insert de elementos

}

