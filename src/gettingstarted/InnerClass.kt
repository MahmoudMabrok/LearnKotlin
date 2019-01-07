package gettingstarted

class Outer {
    var a = "Hello From Nested "

    inner class Inner { // nested class by default is static but with inner it become member field
        fun print() = a  // can get  a From A  as inner is as a member inside Outer
    }
}

fun main(args: Array<String>) {
    var value = Outer().Inner();
    println("returned value is  ${value.print()}")
}

