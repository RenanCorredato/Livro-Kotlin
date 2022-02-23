/*
Uma	 estrutura	 de	 repetição	 é	 utilizada	 quando	 queremos
repetir	 determinado	 trecho	 de	 código.
 */

//for

fun main() {
    val list = listOf(1,2,3)

    for (i in list){
        println("Item: $i")
    }

    val listDois = listOf(1,2,3,4)
    for ((indice, valor ) in listDois.withIndex()){
        println("índice: $indice valor:$valor")
    }


    // while

    var x = 0
    while (x < 10){
        println(x.toString())
        x++
    }
}