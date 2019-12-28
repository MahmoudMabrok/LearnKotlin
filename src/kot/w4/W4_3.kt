package kot.w4

fun main() {
    // part1
    val ball1 = Ball(10)
    val ball2 = Ball(10)
    println("ball ${ball1 + ball2}")
    // part2
    var l1 = listOf(1, 2, 3)
    // if we store return data in a val ,original value not be changed
    val plusElement = l1.plusElement(4)
    println("l1 $l1") // l1 [1, 2, 3]
    var l2 = l1
    l1 += 2 // this change l1 and re-assigne to itself
    println("l1 $l1") // l1 [1, 2, 3, 2]
    println("l2 $l2") // l2 [1, 2, 3]

}

operator fun Ball.plus(other: Ball): Ball {
    return Ball(x + other.x)
}

data class Ball(var x: Int)

