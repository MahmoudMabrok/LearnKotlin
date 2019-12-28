package kot.w5

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val res = run {
        println("Start")
        list.takeIf { it.size > 2 } // here it return list as condition of if satisfied
        // then list is returned as a result and be the value of res
    }
    println("First is ${res?.get(0)}")
    res?.let { println("HI(let) :: $it") } // let work with nullable objects
    // HI(let) :: [1, 2, 3, 4, 5]

    /*   val a = object : Session {
           override val user: User
               get() = FaceBookUser()
       }

       check(a)*/
}

fun check(sesson: Session) {
    val user = sesson.user
    if (user is FaceBookUser) println("is Facebook")
}

interface Session {
    val user: User
}

interface User
class FaceBookUser : User