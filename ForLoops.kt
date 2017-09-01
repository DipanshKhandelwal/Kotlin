// This file shows how can we use For Loops in Kotlin
fun main(args: Array<String>) {

    var arrayList = arrayListOf<String>()

    arrayList.add("First")
    arrayList.add("Second")
    arrayList.add("Third")
    arrayList.add("Fourth")
    arrayList.add("Fifth")

    for (i in 0..3 - 1)
        println(i)

    for (i in 0..arrayList.size - 1)
        println(arrayList.get(i))

    for (i in arrayList)
        println(i)

    if("Fifth" in arrayList)//true here
        println("Yes Fifth is in the array")

    if("Sixth" !in arrayList)//true here
        println("60 is not in the list")
}