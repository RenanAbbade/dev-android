fun main(){
    
    println(endereco(cidade = "SP", estado = "SP"))
    println(endereco(rua="Alvaro Gomes",cidade = "SP", estado = "SP", numero = 105))
}

//Os parametros com atribuição referem-se a valores opcionais.
//
fun endereco(rua: String = "", cidade: String, estado: String, numero: Int = 0) : String {
    return "Rua: $rua, Cidade: $cidade, Estado: $estado, Numero: $numero"
}
