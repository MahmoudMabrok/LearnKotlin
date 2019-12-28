package course

// Note sealed and its subs must be in same code file
fun main(args: Array<String>) {

    val item1 = Shirt("XL", 21.4)
    val item2 = Paints("XX", 25.4)

    val mostexpensive = if (item1.price > item2.price) item1 else item2

    val instriction = when (mostexpensive) {
        is Shirt -> "Button it!"
        is Paints -> "Buckle it!"
    }

    println(instriction) // Buckle it!
}

sealed class ClothingItem(val type: String) {
    abstract val size: String
    abstract val price: Double

    abstract fun add()
}

data class Shirt(override val size: String,
                 override val price: Double) : ClothingItem("Shirt") {
    override fun add() {

    }
}

data class Paints(override val size: String,
                  override val price: Double) : ClothingItem("Paints") {
    override fun add() {

    }
}

