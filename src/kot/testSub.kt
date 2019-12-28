package kot

fun main() {
    val b = B()
    println(b.name)
}

open class A(open var name: String)
class B() : A("MaHMOUD") {
    override var name: String = "1"
}