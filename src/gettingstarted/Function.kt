package gettingstarted

fun main(args: Array<String>) {
    //  name  : parameter list -> return type = {  parameter -> body }
    val mylamda: (Int, Int) -> Int = { a: Int, b: Int -> if (a > b) a else b }
    println("mylamda(5 , 12)} -->  ${mylamda(5, 12)}")
    println("call fun that accept fun as inline fun ${printMax(10, 12, mylamda)}")

}

// fun take two numbers and a fun then it call this fun with these numbers
fun printMax(x: Int, y: Int, action: (Int, Int) -> Int): Int {
    return action(x, y)
}

