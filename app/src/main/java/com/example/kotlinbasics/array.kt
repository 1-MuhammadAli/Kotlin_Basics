package com.example.kotlinbasics

fun main(){
    // val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
    // val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)

    println(numbers.contentToString())

    for (element in numbers){
        print(element)
    }
    println()
    val fruits = arrayOf(Fruit("Apple",400.0), Fruit("Grape",350.0))

    for (fruit in fruits){
        print("${fruit.name}")
    }


    for (index in fruits.indices){
        print(" ${fruits[index].name} is in index $index")
    }

}
data class Fruit(val name: String,val price: Double)