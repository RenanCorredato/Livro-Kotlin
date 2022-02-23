//	ESTRUTURAS	DE	DECISÃO

fun main() {
    val password = "123"

    if (password == "123") {
        println("Acesso concedido")
    } else {
        println("Senha incorredta")
    }

    val aa = 10
    val bb = 5

    if (aa > bb) {
        println("$aa e maior que $bb")
    } else {
        println("$aa e menor que $bb")
    }

    val cc = 10
    val dd = 5
    val menor = if (cc < dd) cc else dd
    println(menor)


    /*
    Essa	é	a	forma	mais	simples	e	clara	de	se	usar	o		when	.	Perceba
que	com	essa	estrutura	temos	2	verificações	e	ainda	um		else		caso
nenhuma	das	duas	seja	a	verdadeira.

     */

    val xx = 5
    when (xx) {
        1 -> println("xx == 1")
        2 -> println("xx = 2")
        else -> println("xx posssui outro valor")
    }

    /*
    Ainda	 temos	 mais	 algumas	 opções	 interessantes	 no	 uso	 do
when	.	 Se	 eu	 quisesse,	 por	 exemplo,	 testar	 se	 a	 variável 	x		 tem
valor	1	ou	2,	poderia	fazer	assim:
     */
    val yy = 10
    when (yy) {
        0, 1 -> println("yy == 0 ou yy ==1")
        else -> println("yy tem outro valor")
    }

    val oo = 11
    when (oo) {
        in 1..10 -> println("oo está no intervalo")
        else -> println("oo está	fora do	intervalo")
    }

}
