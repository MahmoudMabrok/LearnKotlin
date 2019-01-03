package gettingstarted

interface arithOP {
    var maxInt: Int
    fun getMax(first: Int, second: Int): Int
    fun dummy() {   // default implementation
        println("HI from dummy ")
    }

}

class aithEmp : arithOP {
    override var maxInt: Int = 1  // intial value must be assigned
        get() = field                  // field  represent maxInt
        set(value) {
            field = value
        }

    override fun getMax(first: Int, second: Int) = if (first > second) first else second
}

fun main(args: Array<String>) {
    val a = aithEmp()
    println(a.maxInt)
    a.maxInt = 1114
    println(a.maxInt)
    a.dummy()

}