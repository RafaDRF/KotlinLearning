package me.rafael.collections

fun main() {
    // Forma alternativa de criar um array
    // desprendida da atribuição de um tamanho
    val value = intArrayOf(4, 5, 5, 7, 57)

    value.forEach {
        println(it)
    }
}