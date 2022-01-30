/*
Uma	 das	 características	 mais	 marcantes	 da	 Orientação	 a
Objetos	é	a	capacidade	de	se	fazer	uma	herança	entre	classes.	Isso
quer	 dizer	 que	 conseguimos	 criar	 subclasses	 de	 alguma	 outra
classe.	Por	exemplo,	imagine	que	precisaremos	criar	um	modelo	de
carro	 específico	 com	 propriedades	 e	 métodos	 novos,	 porém
mantendo	as	propriedades	e	métodos	de	um	carro	comum


Desta	forma,	a	classe		CarroEspecial		herda	automaticamente
todas	as	propriedades	e	métodos	da	classe		Carro	,	e	implementa
um	método	novo.	Mas	para	isso	funcionar,	a	classe		Carro		 deve
permitir	a	explicitamente	que	se	faça	herança	dela.
Para	 isso,	 devemos	 utilizar	 a	 palavra	 	open		 na	 definição	 da
classe,	 assim:	 	open	 class	 Carro

 */

fun main() {
    class CarroEspecial : Carro() {
        fun fazerDrif(){
            // TODO: 30/01/2022
        }
    }
}