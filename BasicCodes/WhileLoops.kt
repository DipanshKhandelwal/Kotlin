// This file shows how to use while loops in Kotlin
fun main(args: Array<String>) {

    var arrayList = arrayListOf<String>()

    arrayList.add("First")
    arrayList.add("Second")
    arrayList.add("Third")
    arrayList.add("Fourth")
    arrayList.add("Fifth")

    var i :Int = 0
    while (i < arrayList.size-1)
        println("${arrayList.get(i)} is at ${i++}")

    i=0
    do
        println(i++)
    while (i < arrayList.size-1)
}