package gettingstarted

import kotlin.properties.Delegates

// Delegation means passing the responsibility to another class or method.

interface Base {
    fun printME()
}

class BaseImp(val n: Int) : Base {
    override fun printME() {
        println("n is $n")
    }

    //property delegation
    //by lazy
    val temp: String by lazy {
        "temp by lazy "
    }
    // by observable
    var name: String by Delegates.observable("a") { property, oldValue, newValue ->
        run {
            println("property $property $oldValue -->  $newValue")
        }
    }
}

class Derived(b: Base) : Base by b  // use implementation
//  from another class we are using this implementation using “by” keyword.

fun main(args: Array<String>) {
    var a = BaseImp(10)
    a.printME()
    Derived(a).printME()
    println(a.temp)

    println("a.name ->  ${a.name}") // a.name ->  a
    a.name = "Ahmed"    // property var gettingstarted.BaseImp.name: kotlin.String a -->  Ahmed
    a.name = "Mahmoud" // property var gettingstarted.BaseImp.name: kotlin.String Ahmed -->  Mahmoud

}