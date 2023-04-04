package com.example.kotlinbasics

fun main(){
    val fruits =setOf("Orange","Apple","Mango","Grape","Apple")
    println(fruits.size)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits)

    val days = mapOf(1 to "Mon", 2 to "Tue", 3 to "Wed")
    println(days)

    for (key in days.keys){
        print(" $key is to ${days[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruits("Mango",250.0) , "OK" to Fruit("Apple" , 450.0))

    val newDays = days.toMutableMap()
    newDays[4] = "Thu"
    newDays[5] = "fri"

    print(newDays.toSortedMap())
}

data class Fruits(val name: String,val price: Double)