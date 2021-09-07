package me.rafael.challengers

import java.util.*

// Idade em Dias
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val entrada: Int = scanner.nextInt()

    val anos:Int = entrada/365
    val meses:Int = (entrada%365)/30
    val dias:Int  = (entrada%365)%30


    println("${anos} ano(s)")
    println("${meses} mes(es)")
    println("${dias} dia(s)")
}