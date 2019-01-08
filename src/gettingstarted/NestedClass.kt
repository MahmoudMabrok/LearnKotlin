package gettingstarted

class A {
    var a = "Hello From Nested "

    class B { // nested class by default is static
        fun print() = A().a  // from B can not get reference to a From A only by ( make object )
    }
}

fun main(args: Array<String>) {
    var value = A.B();
    println("returned value is  ${value.print()}")
}


