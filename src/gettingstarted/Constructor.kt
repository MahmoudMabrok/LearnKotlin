package gettingstarted

class Student(val name: String, var age: Int) { // primary constructor is used to intialize the class
    var message: String = "HI "

    // secondary constructor used to add extra logic, class can have more than one of them but all must call primary
    //  this(lastName , age) --> used to call primary constructor
    constructor(lastName: String, age: Int, message: String) : this(lastName, age) {
        this.message = message
        println("HI from Secondary ")
    }
}

fun main(args: Array<String>) {
    val s1 = Student("Mahmoud", 22, "No Play with mE Again ")
    println("name is ${s1.name} message is  --> ${s1.message}  ")
}