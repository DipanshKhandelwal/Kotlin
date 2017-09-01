// This file shows different types of function implpementations possible in Kotlin
fun main(args: Array<String>) {

    var array = Array<Int>(5,{i->0})
    var numbers :IntArray = intArrayOf(10, 20, 30, 40, 50)
    var arrayList = arrayListOf<String>()

    arrayList.add("First")
    arrayList.add("Second")
    arrayList.remove("First")
    arrayList.add(0,"First")
    arrayList.add("Third")

    for (i in 0..3 - 1)
        println(arrayList.get(i))

    for (i in 1..array.size - 1)
        array[i]=i

    for (i in array)
        println(i)

    if(20 in numbers)//true here
        println("Yes 20 is in number array")

    if(60 !in numbers)//true here
        println("60 is not in the list")
}