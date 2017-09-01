fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Odd numbers - ${numbers.filter(::isOdd)}")
    println("Even numbers - ${numbers.filter(::isEven)}")
}

fun isOdd(x: Int) = x % 2 != 0
fun isEven(x: Int) = x % 2 == 0