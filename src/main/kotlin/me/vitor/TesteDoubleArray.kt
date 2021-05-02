package me.vitor

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3500.0
    salarios[2] = 5000.0

    salarios.forEach { println(it) }

    println("-------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println("-------------------")
    val Bonus = doubleArrayOf(500.0, 860.1, 369.5)
    Bonus.sort()
    Bonus.forEach { println(it) }
}