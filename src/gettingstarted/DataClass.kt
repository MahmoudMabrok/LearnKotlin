package gettingstarted

fun main(args: Array<String>) {
    val a = Book(10)
    println(a.toString()) // string representation for object
}

// data class must have at least one primay constructor with at leat one property
// it has built-in function such as toString , hashCode
data class Book(var price: Int) {
    companion object {
        val a = 10
        fun printHI() {
            println("HI  $a")
        }
    }
}