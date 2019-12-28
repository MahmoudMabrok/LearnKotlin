package course

fun main(args: Array<String>) {
    val a: Parent = Child()
    println(a.foo())


    val aa: String? = null
    println(aa.isEmptyOrNull())

}

fun String?.isEmptyOrNull(): Boolean? = this == null || this.isEmpty()


open class Parent

class Child : Parent()

fun Child.foo() = "Child"
fun Parent.foo() = "Parent"






