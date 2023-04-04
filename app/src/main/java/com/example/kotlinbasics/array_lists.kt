package com.example.kotlinbasics

fun main(){
    // Array list
    val myArrayList: ArrayList<Double> = ArrayList()
    myArrayList.add(13.212312)
    myArrayList.add(23.151232)
    myArrayList.add(32.651553)
    myArrayList.add(16.223817)
    myArrayList.add(18.523999)
    var total = 0.0
    for (i in myArrayList){
        total += i
    }
    var average = total / myArrayList.size
    println("\nAverage is $average")

// Array list using collection
    val arrayList : ArrayList<String> = ArrayList<String>(5)
    var list:MutableList<String> = mutableListOf<String>()
    list.add("One")
    list.add("Two")
    arrayList.addAll(list)
    val itr =arrayList.iterator()
    while (itr.hasNext()){
        print("\n${itr.next()}\n")
    }
    println("size of arrayList ${arrayList.size}")
}