package com.example.kotlinbasics

fun main(){
    val months = listOf("January","February","March")
    for (month in months){
        println(month)
    }
    val additionalMonths =months.toMutableList()
    val newMonths =arrayOf("April","May","June")
    additionalMonths.addAll(newMonths)
    print(additionalMonths)

    val days = mutableListOf<String>("Mon","Tue","wed")
    days.add("Thu")
    println(days)
    days[2]="Sunday"
    days.removeAt(3)
    println(days)

}