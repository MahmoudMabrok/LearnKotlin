package course


val cc = "RED"
const val ccc = "RED"

fun main(args: Array<String>) {

    val res = calc(param2 = 12, param1 = 8) // res = 20
    print(res)

}

fun calc(param1: Int, param2: Int, op: String = "+"): Int {
    when (op) {
        "+" -> return param1 + param2
        "-" -> return param1 - param2
        else -> return -1
    }
}

class Constants {
    companion object {
        const val A = "A"
        @JvmField
        val B = "B"
    }
}