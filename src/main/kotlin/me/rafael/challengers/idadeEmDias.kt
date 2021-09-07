package me.rafael.challengers

fun main() {
    var entrada = 800

    var anos:Int = entrada/365
    var meses:Int = (entrada%365)/30
    var dias:Int  = (entrada%365)%30

    println("${anos} ano(s)")
    println("${meses} mes(es)")
    println("${dias} dia(s)")

}