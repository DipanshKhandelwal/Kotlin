// This file shows how to use HashMaps in Kotlin
fun main(args: Array<String>) {
    val map = hashMapOf<Int, String>()
    map.put(10, "Ten")
    map.put(100,"Hundred")
    map.put(1000, "Thousand")

    println(map.getValue(10))
    
    for((x,y) in map)
        println("$x is $y")
}