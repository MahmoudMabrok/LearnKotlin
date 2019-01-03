package basics

fun main(args: Array<String>) {
    var a: Int = 10000
    var b: Byte = 1
    var x = 0b1100
    var id: Int? = a;

    println(" ${id === 10_000}")
    println(" x after ((x shl 2))  ${(x shl 2).toString(2)}")

    // no implicity conversion for  smaller values for ex byte can not assigned to Int without Explicity casting
    a = b.toInt()
    println("a is $a")
    a = 111125
    b = a.toByte() // ocurred Overflow res is 21
    println("a $a b $b")


    // 76


}