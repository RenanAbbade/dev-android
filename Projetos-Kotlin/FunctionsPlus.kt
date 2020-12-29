fun main(){
    
    println(endereco(cidade = "SP", estado = "SP"))
    println(endereco(rua="Alvaro Gomes",cidade = "SP", estado = "SP", numero = 105))
    
    println(media(1,51,4554,32138,16,3213,213238,14,45,1288,15656,2132132,1612,2120))
}

//Os parametros com atribuição referem-se a valores opcionais.
//
fun endereco(rua: String = "", cidade: String, estado: String, numero: Int = 0) : String {
    return "Rua: $rua, Cidade: $cidade, Estado: $estado, Numero: $numero"
}

//Parametros flexiveis
//
fun media(vararg notas: Int) : Double{
    var somaNotas = 0.0
    if(notas.isNotEmpty()){
        for(nota in notas){
            somaNotas = somaNotas + nota
        }
    }
    return somaNotas / notas.size
}
