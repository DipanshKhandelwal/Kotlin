// This file shows different types of function implpementations possible in Kotlin
fun main(args: Array<String>) {
    println("Enter Two Numbers")
    print("First Number :- ")
    val a :Double = readLine()!!.toDouble()
    print("Second Number :- ")
    val b :Double = readLine()!!.toDouble()
    println("Sum of $a and $b is ${Addition(a,b)}")
    println("Multiplication of $a and $b is ${Multiplication(a,b)}")
    println("Difference of $a and $b is ${Subtraction(a,b)}")
    println("${Maximum(a,b)} is greater in $a and $b")
}

fun Addition(x: Double, y: Double): Double {
    val z:Double = x + y
    return z
}

fun Multiplication(x: Double, y: Double) = x*y

fun Subtraction(x: Double, y: Double): Double {
    return x-y
}

fun Maximum(x: Double, y: Double) = if (x>y) x else y