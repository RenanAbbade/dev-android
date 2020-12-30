
enum class Prioridade1(){
    BAIXA,MEDIA, ALTA
}

enum class Prioridade2(val id: Int){
    BAIXA(1),MEDIA(2), ALTA(3)
}

fun main() {
    println(Prioridade2.ALTA.id)

    for (p in Prioridade1.values()){
        println(p)
    }

}


