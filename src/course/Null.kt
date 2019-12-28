package course

import gettingstarted.Book.Companion.a

fun main(args: Array<String>) {

    var a: String? = null
    println(a) // print null
    println(a?.length) // print null, you can not use a.length as a is nullable
    println(a?.length ?: -1) // print -1 (Elvis operator )
    println(a!!.length) // Cause Kotlin NuLLPointerException.u can use try-catch to handle it


}