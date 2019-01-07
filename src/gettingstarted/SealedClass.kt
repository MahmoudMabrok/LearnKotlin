package gettingstarted

import gettingstarted.H.Woman


fun main(args: Array<String>) {

    val hObj: H = H.Man() // must ref be type of sealed class
    when (hObj) {
        is Woman -> {
            println("womman")
        }
        is H.Man -> println("man")

    }
}

sealed class H {
    class Man : H()
    class Woman : H()
}


