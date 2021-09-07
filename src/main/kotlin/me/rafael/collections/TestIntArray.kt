package me.rafael.collections

fun main() {
    val value = IntArray(5)

    // iniciar valores
    value[0] = 1
    value[1] = 4
    value[2] = 3
    value[3] = 5
    value[4] = 12

    // iteração no array
    for (v in value){
        println(v)
    }

    value.forEach {
        println(it)
    }

    value.sort()
    for (index in value.indices){
        println(value[index])
    }

}