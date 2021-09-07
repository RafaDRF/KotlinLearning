package me.rafael.collections

fun main() {
    // quando inicia com um tipo não é nescessario explicitar Array<Tipo>()

    val names = Array(3){""}

    // atribuição
    names[0] =  "João"
    names[1] = "Letícia"
    names[2] = "Ana"

    // ordenação alfabetica!!
    names.sort()

    names.forEach { println(it) }

    val names2 = arrayOf("José", "Tulipa", "André")
    names2.forEach { println(it) }

}