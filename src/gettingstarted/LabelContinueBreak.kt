package gettingstarted

fun main(args: Array<String>) {
    // test label with break and continue
    l1@ for (i in 1..3) {
        for (c in 1.rangeTo(3)) { // equivalent  to  1..3
            println("i = $i  c  = $c")
            if (c == 2 && i == 2) {
                println("Go out Outer Loop !!! ")
                //  break@l1       // will break outer loop so  terminate both loops
                continue@l1   // here it cancel iteration from outer loop
            }
        }
        println("after first loop at iteration $i")
    }

}