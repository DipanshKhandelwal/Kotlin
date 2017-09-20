//simple object oriented basics for Kotlin
fun main(args: Array<String>) {
    val rectangle1: Rectangle = Rectangle(5.0, 2.0) //no 'new' keyword required in Kotlin while initializing
    val triangle1: Triangle = Triangle(3.0, 4.0, 5.0)
    println("Area of rectangle is - ${rectangle1.getArea()} and it's perimeter is - ${rectangle1.getPerimeter()}")
    println("Area of triangle is - ${triangle1.getArea()} and it's perimeter is - ${triangle1.getPerimeter()}")
}

class Rectangle(var height: Double, var length: Double): Shape(4), rectangleProperties {
    override fun isSquare(): Boolean = length == height
    override fun getArea(): Double = height*length
    override fun getPerimeter(): Double = 2*(height + length)
}

class Triangle(var sideA: Double, var sideB: Double, var sideC: Double): Shape(3) {

    override fun getArea(): Double {
        var s = (sideA + sideB + sideC)/2
        return Math.sqrt(s*(s - sideA)*(s - sideB)*(s - sideC))
    }
    override fun getPerimeter(): Double = (sideA + sideB + sideC)
}

abstract class Shape (open var sides: Int) {
    abstract fun getArea(): Double
    abstract fun getPerimeter(): Double
}

interface rectangleProperties {
    fun isSquare(): Boolean
}