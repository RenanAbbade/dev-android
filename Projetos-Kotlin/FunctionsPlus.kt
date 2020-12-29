fun main(){
    
  endereco(cidade = "SP", estado = "SP")
  endereco(rua="Alvaro Gomes",cidade = "SP", estado = "SP", numero = 105)
}

//Os parametros com atribuição referem-se a valores opcionais. Os sem atribuição são valores default, se não houver passagem eles assumem os valores dafault.
fun endereco(rua: String = "", cidade: String, estado: String, numero: Int = 0){
    println("Rua: $rua, Cidade: $cidade, Estado: $estado, Numero: $numero")
}
