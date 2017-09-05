//This file explains how we can compose new functions using the older ones, in the way we want
fun main(args: Array<String>) {
    val evenLength = compose(::isEven, ::length)
    val strings = listOf("ab", "abc", "abcd")
    println(strings.filter(evenLength))
}

fun isEven(x: Int) = x % 2 == 0
fun length(s: String) = s.length

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}