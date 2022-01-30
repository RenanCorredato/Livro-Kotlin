/*
Podemos	definir	uma	função	como	um	conjunto	de	comandos
agrupados	 em	 um	 bloco,	 que	 recebe	 um	 nome	 e,	 através	 deste
nome,	 pode	 ser	 chamado	 em	 outras	 partes	 do	 código.	Na	 prática
utilizamos	funções	para	separar	melhor	nossa	lógica.
 */



fun main() {

    val n1 = 10
    val n2 = 20

    val resulttt = sumT(n1, n2)
    println("A soma de $n1 + $n2 = $resulttt")

    val result = sum(5, 7)
    println(result)

    test("Renan")

}

fun sum(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun sumT(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun test(text :String){
    println(text)

}



