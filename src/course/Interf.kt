package course

fun main(args: Array<String>) {

    val lol = Retriever()
    val moly = Sealer()

    makeSpeak(lol)
    makeSpeak(moly)
    // make an anonymous object
    makeSpeak(object : Cat {
        override fun speak() {
            println("Anonymous")
            super.speak()
        }
    })


}

fun makeSpeak(cat: Cat) {
    cat.speak()
}

interface Cat {
    fun speak() {
        println("Cat")
    }
}

interface Lion {
    fun speak() {
        println("Lion")
    }
}

class Retriever : Cat, Lion {
    override fun speak() {
        //  super.speak() // error, conflict there several implementation
        super<Cat>.speak()
        println("Retriever ")
    }
}

class Sealer : Cat, Lion {
    override fun speak() {
        super<Lion>.speak()
        println("Sealer ")
    }
}



