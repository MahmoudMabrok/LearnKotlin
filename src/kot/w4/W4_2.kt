package kot.w4

fun main() {
    val a = listOf(1, 2, 3, 4)
    val b = listOf(1.5, 2.6, 3.9, 4.4)
/*
println(sum(a))
println(sum(b))
//a.sum()
kot.w4.sum(a)
*/

}
/*

fun <T : Number>  sum (data : List<T>) : T {
    var res = 0
    for (element in data){
        res = res.plus(element)
    }
    return res
}
*/


@JvmName("sumInt")
fun Iterable<Int>.sum(): Int {
    var sum: Int = 0
    for (element in this) {
        sum += element
    }
    return sum
}


