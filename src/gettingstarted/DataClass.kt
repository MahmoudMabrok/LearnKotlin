package gettingstarted

fun main(args: Array<String>) {
    val a = Book(10)
    Book.a = 11
    var b = a.copy()
    b.price = 44
    println(a.toString()) // string representation for object
    println(b.toString()) // string representation for object

    Book.printHI()

}

// data class must have at least one primary constructor with at least one property
// it has built-in function such as toString , hashCode
data class Book(var price: Int) {
    companion object {
        var a = 10
        fun printHI() {
            println("HI  $a")
        }
    }
}