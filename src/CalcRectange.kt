fun main() {

    val base = 3
    val height = 7

    var result = base * height
    println(result)

    //Exemplos

    val x: Int = 10
    var y: Double = x.toDouble() //Retorna	um	objeto	Double	a	partir	do	valor	de	x
    var z: Float = x.toFloat() // Retorna	um	objeto	Float	a	partir	do	valor	de	x
    var a: String = x.toString() ///Retorna	um	objeto	String	a	partir	do	valor	de	x

    println(a)
    println(y)
    println(z)
    println(a)
/*
Dados	numéricos
    val	umMilhao	=	1000000
    val	umMilhao	=	1_000_000 // facilita a leitura do codigo
 */

    /*
    Com	 esse	 recurso,	 é	 possível	 utilizar	 o	 valor	 de	 uma	 variável
dentro	da	String	através	do	caractere		$	.	Veja	um	exemplo

    	val	nomeUsuario	=	"Kassiano"
		val	saudacao	=	"Bem-vindo,	$nomeUsuario"
     */

    val nomeUsuario = "Renan"
    val saudacao = "Bem vindo, $nomeUsuario"
    println(saudacao)

    /*
    Strings	e	caracteres

    Você	 pode	 definir	 também	 um	 texto	 com	 várias	linhas,	 basta
utilizar	o	delimitador	de	3	aspas	duplas		"""		:
val	text	=	"""
				Exemplo	de	texto
				com	mais	de	uma
				linha
				"""

     */

   /*
   Booleanos
   Uma	 coisa	interessante	 é	 que	 o	 tipo	 booleano	 possui	funções
            para	essas	operações.	São	elas		and	,		or		e		not	,	veja

      val	c1	=	b1.and(b2)	//Retorno	será	false
				val	c2	=	b1.or(b2)	//Retorno	será	true
				val	c3	=	b1.not()	//Retorno	será	false
				println("$c1	$c2	$c3")

    */

    val b1 = true
    val b2 = false

    val c1 = b1.and(b2) // Retorno será false
    val c2 = b1.or(b2) // Retorno será true
    val c3 = b1.not() // Retorno será false

    println("$c1 $c2 $c3")

    /*
    Listas	e	Arrays

    Um		Array		sempre	terá	um	tamanho	fixo	e	eu	consigo	definir
e	resgatar	valores	através	de	seu	índice	utilizando	colchetes	(	[	]	).
     */

    val arrayInt : Array<Int> = arrayOf(1,2,3,4,5,6)
//passando	o	índice	2	para	acessar	o	valor	da	posição	2	do	array

    val xUm = arrayInt[2]
    println(xUm)

    /*
    lista mutáveis
    Para	 definir	 uma	 lista	 mutável,	 podemos	 usar	 a	 seguinte
sintaxe:
val	lista	=	mutableListOf(1,2,3,4)

    val list = mutableListOf(1,2,3,4,5)
    list.add(6) //adiciona um valor a lista


Além	 dessa	 característica,	 listas	 possuem	 algumas	 funções
muito	úteis	no	dia	a	dia.	Veremos	3	delas,	a	função 	first	,		last
e		filter	.	A	função		first		retorna	sempre	o	primeiro	elemento
da	lista:


     */

    val list = mutableListOf(1,2,3,4,5)
    list.add(6) //adiciona um valor a lista
    println(list)

    //A	função		first		retorna	sempre	o	primeiro	elemento da	lista
    val itemOne = list.first() //a	variável	item	ficará	com	valor	1
    println(itemOne)

   // A	função		last		retorna	o	último	item	da	lista
    val itemTwo = list.last() ///a	variável	item	ficará	com	valor	6
    println(itemTwo)

    /*
    A	função		filter		aplica	um	filtro	específico	na	lista,	ela	é	bem
bacana	e	economiza	bastantes	linhas	de	código.	Vamos	supor	que
nesta	 mesma	 lista	 nós	 quiséssemos	 aplicar	 um	 filtro	 e	 obter
somente	números	pares.	Isso	é	possível	com	o	seguinte	código:
     */

    val namberPair = list.filter { it % 2 == 0  }
    println(namberPair)

    /*
    Para	 definir	 uma	 lista	 imutável,	 podemos	 usar	 a	 seguinte
sintaxe:
val	lista	=	listOf(1,2,3,4)

Todos	 os	 métodos	 utilizados	 na	 lista	 mutável	 funcionam	 em
listas	imutáveis,	com	exceção	do	método		add	,	pois	em	uma	lista
imutável	não	é	possível	adicionar	novos	valores.


     */





}