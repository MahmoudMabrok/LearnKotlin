package course

fun main(args: Array<String>) {

    val sayHallo = { name: String, age: Int ->
        println("hello $name and age $age")
    }

    sayHallo("Ahmed", 21)
    sayHallo.invoke("Ahmed", 21)

    println(sayHallo::class.simpleName)

    val arr = arrayOf("Ahmed", "Mohamed", "Ali")
    // item represent a element from array is sent as parameter to sorted by
    val sorted = arr.sortedBy { item: String -> item.length }
    println(sorted)
    // use it as we expect only one paramter
    val filtered = arr.filter { it.startsWith("A") }
    println(filtered)

    /*
    Output:-
    hello Ahmed and age 21
    hello Ahmed and age 21
    sayHallo$1
    [Ali, Ahmed, Mohamed]
    [Ahmed, Ali]
    */

}