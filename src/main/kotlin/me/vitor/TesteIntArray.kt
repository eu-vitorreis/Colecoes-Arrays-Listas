package me.vitor

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 8
    values[2] = 9
    values[3] = 10
    values[4] = 6

    for(valor in values){
        println(valor)
    }
    println("-------------------------")

    for(index in values.indices){
        val texto:String = "º - "
        print(index)
        print(texto)
        println(values[index])
    }
}