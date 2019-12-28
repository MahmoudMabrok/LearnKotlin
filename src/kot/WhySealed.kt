package kot

fun main() {
    println(eval(Sum(Num(5), Num(12))))
}


sealed class Expr
class Num(var value: Int) : Expr()
class Sum(var left: Expr, var right: Expr) : Expr()

fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
        }
