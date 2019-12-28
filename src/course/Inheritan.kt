package course

fun main(args: Array<String>) {

    var a = Animal("Yellow")
    println(a)

    var b: Dog = Dog("Black")
    b.walk()

/*
    Output:-
    Animal with Yellow
    I am Dog
    kotlin.Unit --> why this

    */

}

open class Animal(val color: String) {
    fun walk() {
        println("I am Walking ${this::class.simpleName}")
    }

    override fun toString(): String {
        return "Animal with ${color}"
    }
}

open class Dog(color: String) : Animal(color) {
    /* fun walk() {
         println("I am Dog")
     }*/
}

class WildDog() : Dog("Black") {
}

data class Item(var name: String,
                var price: Float)