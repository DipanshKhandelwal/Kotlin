//Delegate class is used for just setting setters and getters for fields in any class
import kotlin.reflect.KProperty

class Book {
    var title: String by Delegate()

    override fun toString() = "Book class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, '${prop.name}' has been set !!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main(args: Array<String>) {
    val book = Book()
    println(book.title)
    book.title = "Harry Potter"
}