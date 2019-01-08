package gettingstarted

fun main(args: Array<String>) {
    val a = Ex<Int>(10)
    var b = Ex<Number>(10.2)

}

class Ex<in T>(input: T) {
    init {
        println("Hi init ")
    }
}
