package com.example.kotlinbasics

fun main(){
    val sum: (Int,Int) -> Int = {a:Int,b:Int -> a+b}
    println(sum(10,5))

    //even shorter
    val sum1 = {a:Int, b:Int -> println(a+b) }
    sum1(10,5)
    // unsafe cast
    val obj: Any = "String unsafe cast"
    val str: String? = obj as String?
    println(str)
    // safe cast
    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)

}