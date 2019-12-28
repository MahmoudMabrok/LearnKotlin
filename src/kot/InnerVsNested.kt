package kot

import javafx.scene.effect.MotionBlur

fun main() {
    val o = Outer()
    println(o.a::class)

    val b = o.Inner()
    println(b::class)

    val c = Outer.Nested()
    println(c::class)

}

class Outer {
    var ab: Int = 10

    inner class Inner {
        fun printA() {
            println(ab) // reference outer class directly or use @NameOfOuter
        }
    }

    class Nested {
        fun printA() {
            //    println(ab) // error can not reference the outer class.
        }
    }

    val a = object : Repository {
        override fun getAll(): List<String> {
            return listOf()
        }
    }

}