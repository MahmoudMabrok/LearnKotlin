package course

fun main(args: Array<String>) {

    // create array of values (here are of type Any as types are mixed )
    val arr = arrayOf("10", 12, 13, 14)
    // helper method create nulls of specified type, accept size
    val arr1Null = arrayOfNulls<String?>(10)
    // // create array of integer values
    val arr1 = arrayOf(10, 22, 13, 25)

    arr1.sort()
    for (item in arr1) println(item)
    arr1.sortedArrayDescending()
    for (item in arr1) println(item)


}