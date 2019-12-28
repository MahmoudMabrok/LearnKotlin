package course

fun main(args: Array<String>) {

    val a = Student()
    println(a.name)
}

class Student(var name: String, private var _age: Int) {

    // this is a secondary constructor, it must call primary one
    constructor() : this("na", 10) {
        println("Called from secondary ")
    }

    // is called after calling to primary constructor
    init {
        name = name.toUpperCase()
        println("Promary is called ")
    }

    // make another one, provide a get and set
    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }

}