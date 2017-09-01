//This file shows the usage of 'lazy' to any class field
//You cannot change the value of such fields in the main function
class LazySample {
    val lazy: String by lazy {
        println("computed!")
        "im lazy"
    }
}

fun main(args: Array<String>) {
    val sample = LazySample()
    println("lazy = ${sample.lazy}")
    println("lazy = ${sample.lazy}")
}