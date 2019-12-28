package course

fun main(args: Array<String>) {

    // this is Immutable list so can not add/remove from it
    // Note listOf<>() in angle brackets we can write type or let Kotlin to determine it.
    val list = listOf("Ahmed", "Mahmoud")
    // this is mutable list
    val mulList = mutableListOf("Ahmed", "Mahmoud")
    mulList.add("Hafez")
    mulList.add(0, "Hassan")
    mulList.remove("Ahmed")
    println(mulList) // [Hassan, Mahmoud, Hafez]

    // this is Immutable Set so can not add/remove from it
    val set = setOf(1, 2, 3, 2, 4, 5)
    // this is mutable Set
    val mulset = mutableSetOf<Int>(1, 2, 3, 2, 4, 5)
    println(mulset) // [1, 2, 3, 4, 5] NOTE 2 is displayed only one time

    // this is mutable Map
    val map = mutableMapOf(Pair("Ahmed", 22), Pair("Mahmoud", 23))
    // put is used to add Pairs(Key , Value)
    map.put("Hassan", 21)
    // display values is by calling get(key) or use this trick
    for ((name, age) in map) println(" name : $name and Age is $age")


}