fun main(args: Array<String>) {
    println("Enter a number")
    var input:Int = readLine()!!.toInt();
    println(when (input) {
        1 -> "You entered $input"
        2 -> "You entered $input"
        3 -> "You entered $input"
        else -> "You entered $input not 1, 2 or 3"
    })
}