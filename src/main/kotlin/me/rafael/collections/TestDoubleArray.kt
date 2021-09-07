package me.rafael.collections

fun main() {
    val salary = DoubleArray(3)

    salary[0] = 20000.0
    salary[1] = 10000.0
    salary[2] = 88000.0

    salary.forEach { println(it) }

    println("-------------")
    // modificação de valores nos indices
    salary.forEachIndexed { index, money ->
        salary[index] = money * 1.1
    }

    salary.forEach { println(it) }

    println("-------------")

    val salary2 = doubleArrayOf(50000.0, 80000.0, 12000.0)
    salary2.sort()
    salary2.forEach { println(it) }
}