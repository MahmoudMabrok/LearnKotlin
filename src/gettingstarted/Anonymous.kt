package gettingstarted

fun main(args: Array<String>) {

    // when need to implement interface and get reference use anonymous class
    var programmer = object : Human {
        override fun getMax(first: Int, second: Int) = if (first > second) first else second
        override fun printName() {
            println("HI from Anonymous ")
        }

    }

    programmer.printName()
    println("max of (4 , 12 ) ==>  ${programmer.getMax(4, 12)}")
}

interface Human {
    fun printName()
    fun getMax(first: Int, second: Int): Int
}