package course

fun main(args: Array<String>) {

    val arr = arrayOf(1, 2, 3, 4, 5)

    for (item in arr) {
        println(item) // print each item in a new line
    }

    // until stop at max -1 (i.e max is excluded)
    for (index in 0 until arr.size) {
        println(arr.get(index))  // print each item in a new line
    }

    // indices return array of index, step 2 means to update each iteration with 2
    for (index in arr.indices step 2) {
        println(arr.get(index))
    }


}

class MathLib {
    companion object {
        fun add(param1: Int, param2: Int): Int {
            return param1.plus(param2)
        }
    }
}