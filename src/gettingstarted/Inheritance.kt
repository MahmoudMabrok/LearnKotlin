package gettingstarted

// by default class is final so can not be inherited
open class parent(val name: String, var age: Int) {
    var message: String = "TOP"
    open fun printHello() {
        println("Hello  $name   your age is $age")
    }
    constructor(name: String) : this(name, 0) // call primary
}

// : used to inherit the parent class
class child(name: String, age: Int, val grade: Int) : parent(name, age) {
    // age is now member of child calss
    override fun printHello() {
        println("Hello  $name   your age is $age your grade is $grade")
    }
}

fun main(args: Array<String>) {
    var ch = child("Mahmoud", 22, 99)
    ch.printHello() // child version will be used so grade will be printed
}
