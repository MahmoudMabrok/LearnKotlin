package kot.w4

fun main() {
    val a = listOf(1, 2, 2, 3, 3)
    val b = a.groupBy { it }

    println(b)
    val c = a.toSet()
}

class Data {
    companion object {
        var mName: String = "Mahmoud"
        @JvmStatic
        var mName1: String = "Mahmoud"
    }
}
