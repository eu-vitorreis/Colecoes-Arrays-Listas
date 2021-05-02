package me.vitor

fun main() {
    val nomes = Array(4){""}
    nomes[0] = "Vitor"
    nomes[1] = "Augusto"
    nomes[2] = "Matos"
    nomes[30] = "Reis"

    for (nome in nomes){
        println(nome)
    }

    println("---------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("---------------")
    val planetas = arrayOf("Plutão", "Saturno", "Netuno")
    planetas.sort()
    planetas.forEach { println(it) }

}

