class Cachorro {

    //lateinit é utilizado quando se tem uma variável que tera um valor atribuido tardiamente, não no momento da criação da variável. Em Java, atribui o valor null nesses casos, em KT utiliza-se lateinit
    lateinit var nome: String

    fun geradorDeNome() {
        nome = "Renz"
    }
}


fun main() {

    val p = Cachorro()
    p.geradorDeNome()
}

