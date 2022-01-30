/*
O	Kotlin	 é	 uma	linguagem	 que	 trabalha	 com	 o	 paradigma	 de
Orientação	 a	 Objetos	 (OO)	 além	 do	 Paradigma	 Funcional.	 No
contexto	 de	 aplicativos,	 é	 fundamental	 entender	 o	 básico	 de
Orientação	 a	 Objetos	 e	 como	 trabalhar	 orientado	 a	 objetos	 com
Kotlin.

 */


fun main() {
    val c = Carro()
    c.color = "Azul"
    c.model = "Nissan 350z"
    c.speed()
}

open class Carro {
    var color: String = ""
    var model: String = ""

    fun speed() {
        println("Acelerando")
    }

    fun brake() {
        print("Freando")
    }
}

