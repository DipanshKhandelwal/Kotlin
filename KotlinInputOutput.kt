fun main(args: Array<String>) {

    println("Enter a string")
    var string:String = readLine()!!
    println("The output is:${string}")

    println("Enter an integer")
    var integer:Int = readLine()!!.toInt()
    println("The output is:${integer}")

    println("Enter a double")
    var double:Double = readLine()!!.toDouble()
    println("The output is:${double}")
}