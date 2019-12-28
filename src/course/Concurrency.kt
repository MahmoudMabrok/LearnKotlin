package course

import java.text.NumberFormat
import java.util.*

fun main(args: Array<String>) {

    val value = 22
    println("It costs ${value}$")

    Locale.setDefault(Locale.FRANCE)

    val formater: NumberFormat = NumberFormat.getCurrencyInstance()
    println("It costs ${formater.format(value)}")

    Locale.setDefault(Locale.US)

    val formater2: NumberFormat = NumberFormat.getCurrencyInstance()

    println("It costs ${value}€")
    println("It costs ${formater2.format(value)}")


}