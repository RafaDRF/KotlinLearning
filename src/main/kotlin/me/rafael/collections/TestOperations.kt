package me.rafael.collections

fun main() {
    val salary = doubleArrayOf(1000.2, 5000.0, 7000.0)

    salary.forEach { println(it) }

    println("------------")

    println("Maior salario: ${salary.maxOrNull()}")
    println("Menor salario: ${salary.minOrNull()}")
    println("Média de salario: ${salary.average()}")

    // Filtrar valores
    val salaryBigger = salary.filter { it > 2000.0 }
    println("------------")
    salaryBigger.forEach{ println(it) }

    println("------------")
    println(salary.count{it in 4000.0 .. 20000.0} )

    println("------------")
    println(salary.find { it == 5000.0 })

    println("------------")
    println(salary.any{ it == 1000.2})
}