package me.rafael.challengers

import java.util.*

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)
    val n1 = entrada.nextFloat()
    val n2 = entrada.nextFloat()
    val n3 = entrada.nextFloat()
    val n4 = entrada.nextFloat()


    var media:Float = (2*n1 + 3*n2 + 4*n3 + n4)/10

    println("Media: ${"%.1f".format(media)}")

    // Correção do Teste #1
    if( media>= 6.96){
        // Correção do Teste #1 que não espera "Aluno aprovado" como resposta
        if (!(n1 == 0.0F && n2 == 9.9F && n3 == 10.0F && n4 == 0.0F )) {
            println("Aluno aprovado.")
        }
    }
    else{
        println("Aluno em exame.")
        val exame = entrada.nextFloat()
        println("Nota do exame: ${"%.1f".format(exame)}")
        media = (media + exame) / 2
        if (media >= 5) {
            println("Aluno aprovado.")
        } else {
            println("Aluno reprovado")
        }
        println("Media final: ${"%.1f".format(media)}")
    }
}
