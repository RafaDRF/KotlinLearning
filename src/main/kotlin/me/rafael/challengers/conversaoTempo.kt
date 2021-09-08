package me.rafael.challengers

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val entrada: Int = scanner.nextInt()

    val hr = entrada/3600
    val min = (entrada%3600)/60
    val seg = (entrada%60)%60
    println("$hr:$min:$seg")

}