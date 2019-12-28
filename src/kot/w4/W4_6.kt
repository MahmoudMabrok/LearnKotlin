package kot.w4

fun main() {
    val (price, name) = Item(10f, "a")
    println("price : $price name:  $name")
}

data class Item(val price: Float, val name: String)
